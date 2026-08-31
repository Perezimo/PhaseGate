

firstNumber = int(input("Enter the first number: "))

secondNumber = int(input("Enter the second number: "))


greatestCommonDivisor= 1
count = 2

smallestNumber=firstNumber

if secondNumber<firstNumber:
	smallestNumber = secondNumber


while count <= smallestNumber // 2:

	if firstNumber % count == 0 and secondNumber % count == 0:
		greatestCommonDivisor *= count
		firstNumber//=count
		secondNumber//=count
	else:
	
		count+=1
	
	
print(greatestCommonDivisor)
	
	
	


