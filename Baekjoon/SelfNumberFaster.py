def sumOfDigits(num):
  sum1 = 0;
  
  while num != 0:               #While Start
    sum1 = sum1 + num % 10;
    num = num // 10;                #While En
    
  return sum1;

newNumList = []

for x in range (10001):
  newNum = x + sumOfDigits(x)
  if(newNum <= 10000):
    newNumList.append(x)
    
