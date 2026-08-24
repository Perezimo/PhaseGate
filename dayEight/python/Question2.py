

array = [[3,5,7],[2,2,2],[4,1,9]]

new_array = []

for count in range(len(array)):

    addition = 0

    for counter in range(len(array[count])):

        addition+=array[count][counter]

    new_array.append(addition)

print(new_array)

