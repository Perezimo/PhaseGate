number = int(input("Enter a number: "))

isPerfect = False
sum = 0

for count in range(1, number):
    if number % count == 0:
        sum += count

if sum == number:
    isPerfect = True

print(isPerfect)
