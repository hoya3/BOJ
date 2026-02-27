a, b = map(int, input().split())
if b < 45:
    b = b - 45 + 60
    a = a - 1
    if a < 0:
        a = 23
else:
    b = b -45
print(a, b)
  