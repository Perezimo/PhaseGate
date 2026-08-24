def doubleEvenAndAddOneToOdd(numbers):

	values = []
	for number in numbers:
		
		if number % 2==0:
			
				number *=2
				values.append(number)
	else:
				number +=1
				values.append(number)
				
	return values
list_1 = [2,8,14,1]

print(doubleEvenAndAddOneToOdd(list_1))
