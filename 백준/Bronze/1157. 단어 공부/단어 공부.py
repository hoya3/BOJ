from collections import Counter

word = input().lower()
cnt = Counter(word)
most = cnt.most_common(2)
if len(most) == 1 or most[0][1] != most[1][1]:
    print(most[0][0].upper())
else:
    print("?")