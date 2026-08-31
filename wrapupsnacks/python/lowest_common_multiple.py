

first_number = int(input("Enter first number: "))
second_number = int(input("Enter second number: "))


highestNumber=first_number
if second_number>first_number:

	highestNumber = second_number

lowestCommonMultiple = highestNumber*2

while lowestCommonMultiple%first_number!=0 or lowestCommonMultiple % second_number!=0:
	lowestCommonMultiple+=1

	
print(lowestCommonMultiple)
	



