#Var.Init.
i = 0
total = 9
numList = [None] * total

#Taking 9 Inputs Into List
while i < 9:
    numList[i] = int(input())
    i += 1

maximum = max(numList)                      #Find max

i = 0
for x in numList:
    if maximum == x:
      print(maximum)
      print(i+1)
    i += 1
 
