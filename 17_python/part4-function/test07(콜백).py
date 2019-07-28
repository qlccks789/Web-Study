# 콜백함수 리턴하기
def hello(data):
    print(data)


def ret_func():
    return hello


ret_func()("안녕")  # 안녕


# 콜백 함수 매개변수 받기
def call(arr, callback):
    return callback(arr)


def print_arr(arr):
    for val in arr:
        print(val)


call(["a", "b", "c"], print_arr)   # a  b  c
