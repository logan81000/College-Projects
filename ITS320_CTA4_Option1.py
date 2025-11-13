nums = []
count = 0
numsinterest= []
Average = 0
while count < 5:
    count += 1
    number = float(input("Enter a Number: "))
    nums.append(number)
    numsinterest.append(number + number * 0.2)
Total = sum(nums)
Average = float(Total / 5)
Max = max(nums)
Min = min(nums)
print("The total is", Total)
print("The average is", Average)
print("The maxiumum is", Max)
print("The minimum is", Min)
print("Each number with a 20 percent interest rate would be", numsinterest)




