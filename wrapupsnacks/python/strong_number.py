
number = int(input("Enter a number to check for strong number: "))

numberString = str(number)
keepDigit = number
sum = 0

for count in range(len(numberString)):
    digit = keepDigit % 10
    keepDigit //= 10

    factorial = 1

    for counter in range(1, digit + 1):
        factorial *= counter

    sum += factorial

if sum == number:
    print("It is a strong number!")
else:
    print("It is not a strong number!")
