h, m = map(int, input().split())
t = int(input())

m = m + t
h = h + m // 60
m = m % 60
h = h % 24
print(h, m)