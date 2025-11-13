uniform mat4 transformation;
attribute vec4 coord;
void main(void) {
  gl_Position = transformation * coord;
}
const vertBuffer = gl.createBuffer();
gl.bindBuffer(gl.ARRAY_BUFFER, vertBuffer);
gl.bufferData(gl.ARRAY_BUFFER, new Float32Array([
 -0.5, -0.5, 0.5, 1,
  0.5, -0.5, 0.5, 1,
  0.5,  0.5, 0.5, 1,
 -0.5,  0.5, 0.5, 1,
]), gl.STATIC_DRAW);

const indexBuffer = gl.createBuffer();
gl.bindBuffer(gl.ELEMENT_ARRAY_BUFFER, indexBuffer);
gl.bufferData(gl.ELEMENT_ARRAY_BUFFER, new Uint8Array([0,1,2,3]), gl.STATIC_DRAW);
function rotateX(ang) { const mat = mat4.create(); return mat4.rotateX(mat, mat, ang); }
function rotateY(ang) { const mat = mat4.create(); return mat4.rotateY(mat, mat, ang); }
const faces = [
  { color: new Float32Array([0,0,0,1]), transformation: mat4.create() },
  { color: new Float32Array([0,0,1,1]), transformation: rotateX(Math.PI * 1/2) },
  { color: new Float32Array([0,1,0,1]), transformation: rotateX(Math.PI) },
  { color: new Float32Array([0,1,1,1]), transformation: rotateX(Math.PI * 3/2) },
  { color: new Float32Array([1,0,0,1]), transformation: rotateY(Math.PI * 1/2) },
  { color: new Float32Array([1,0,1,1]), transformation: rotateY(Math.PI * 3/2) },
];

const startTime = new Date().getTime();
function redraw() {
  const t = (new Date().getTime() - startTime) / 1000;
  const timeTrans = mat4.create();
  mat4.rotateX(timeTrans, timeTrans, t);
  mat4.rotateY(timeTrans, timeTrans, t/2);
  mat4.rotateZ(timeTrans, timeTrans, t*2);
  gl.clear(gl.COLOR_BUFFER_BIT);
  for (let face of faces) {
    const trans = mat4.create();
    mat4.multiply(trans, timeTrans, face.transformation);
    gl.uniformMatrix4fv(transformationLoc, false, trans);
    gl.uniform4fv(faceColorLoc, face.color);
    gl.drawElements(gl.TRIANGLE_FAN, 4, gl.UNSIGNED_BYTE, 0);
  }
  window.requestAnimationFrame(redraw);
}

