a = int(input())
b = int(input())
c = int(input())

mult = a * b * c

numString = str(mult)

#Var. Init.
zero = one = two = three = four = five = six = seven = eight = nine = 0

for x in numString:
  if x == '0':
    zero += 1
  elif x == '1':
    one += 1
  elif x == '2':
    two += 1
  elif x == '3':
    three += 1
  elif x == '4':
    four += 1
  elif x == '5':
    five += 1
  elif x == '6':
    six += 1
  elif x == '7':
    seven += 1
  elif x == '8':
    eight += 1
  elif x == '9':
    nine += 1


print(zero)
print(one)
print(two)
print(three)
print(four)
print(five)
print(six)
print(seven)
print(eight)
print(nine)

