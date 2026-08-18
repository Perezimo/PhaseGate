

first_score = int(input("Enter the first score: "))

second_score = int(input("Enter the second score: "))

third_score = int(input("Enter the third score: "))

total_scores = int(first_score + second_score + third_score)

average_score = total_scores/ 3.

if(average_score>=90 and average_score<=100):
	print("A", average_score)

if(average_score>=80 and average_score<90):
	print("B", average_score)

if(average_score>=70 and average_score<80):
	print("C", average_score)

if(average_score>=60 and average_score<70):
	print("D", average_score)

if(average_score>=0 and average_score<59):
	print("F", average_score)

