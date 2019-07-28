try:
    with open("a.txt") as f:
        print(f.read())
# 에러 메세지 변수에 담기
except FileNotFoundError as err:
    # [Errno 2] No such file or directory: 'a.txt'
    print(err)
