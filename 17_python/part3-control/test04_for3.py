# 구구단
index = [1, 2, 3, 4, 5, 6, 7, 8, 9]
for i in index[1:]:
    for j in index:
        print(str(i) + " * " + str(j) + " = " + str(i*j))
    print()

"""
2 * 1 = 2
2 * 2 = 4
....
9 * 8 = 72
9 * 9 = 81
"""
