


def father_son_age(father_age , son_age):


	age_ago = int(father_age - 2*(son_age))

	if age_ago>0:
		print(age_ago ,"years ago the father age was twice that of his son")

	else:
		print("Past is not catered for")
	

	return age_ago
		
print(father_son_age(45, 20))

