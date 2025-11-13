package Critical_Thinking;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIBankBalanceApplication implements ActionListener {
	
	private JTextField textfield;
	private double balance;
	private JLabel balanceL;
	
	GUIBankBalanceApplication() {
		// adds JFrame, sets closiing operation, sets size of the JFrame, and sets location of JFrame
		JFrame frame = new JFrame("Bank Account");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800, 100);
		frame.setLocationRelativeTo(null);
		//Creates JPanel, 2 JLabels, a JTextField, and 2 JButtons
		JPanel panel = new JPanel();
		JLabel label = new JLabel("Woud you like to deposit or withdraw funds: ");
		textfield = new JTextField(20);
		JButton button = new JButton("Deposit");
		JButton button2 = new JButton("Withdraw");
		balanceL = new JLabel("Balance:  $" + balance);
		// sets JFrame layout to a FlowLayout
		frame.setLayout(new FlowLayout());
		// adds 2 JLabels, a JTextField, and 2 JButtons to JPanel
		panel.add(label);
		panel.add(textfield);
		panel.add(button);
		panel.add(button2);
		panel.add(balanceL);
		// adds ActionListeners to the 2 JButtons
		button.addActionListener(this);
		button2.addActionListener(this);
		// adds JPanel to JFrame and sets the JFrame to visible
		frame.add(panel, BorderLayout.CENTER);
		frame.setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		/* adds a double equal to value in textfield and adds a if statement to 
		   figure out which button is pushed and adds or subtracts the value in 
		   the textfield from the balance */
		double balance2 = Double.parseDouble(textfield.getText());
		if (e.getActionCommand().equals("Deposit")) {
			balance += balance2;
		} else {
			balance -= balance2;
		}
		// updates bank balance displayed
		balanceL.setText("Balance:  $" + balance);
		textfield.setText("");
		
	}
	
	
	public static void main(String[] args) {
		// initiates GUI
		new GUIBankBalanceApplication();
		
	}

}
