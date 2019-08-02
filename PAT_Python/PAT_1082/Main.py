n = int(input())
d = {}
for i in range(n):
    str = input()
    num = str.split(" ")
    radius = int(num[1]) ** 2 + int(num[2]) ** 2
    d[radius] = num[0]

d = [d[k] for k in sorted(d.keys())]
print(d[0], d[-1])