try:
    with open("a.txt") as f:
        print(f.read())
# 특정 에러만 처리하도록 선언
except FileNotFoundError:
    print("a.txt 파일이 존재하지 않습니다.")
