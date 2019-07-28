# 반환값을 여러개 넘길 경우 tuple 형태로 넘어간다.
def swap(a, b):
    return b, a


t = swap(10, 20)
print(type(t))    # <class 'tuple'>
print(t)          # (20, 10)

x, y = swap(100, 200)
print(x, y)       # 200 100
