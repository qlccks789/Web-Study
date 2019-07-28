# 가변 인자 튜플을 이용해 값을 전달하는 방법 : 가변 인자 이용
def method(*args):
    print(args)


method(1)          # (1,)
method(1, 2)       # (1, 2)
method(1, 2, 3)    # (1, 2, 3)
