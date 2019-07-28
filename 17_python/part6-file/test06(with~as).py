"""
파일을 자동으로 닫기 위해서 with 구문을 이용
with open(file[, mode][, encoding]) as 변수명

파일객체.closed : 현재 파일이 닫혀 있는지 상태를 True, False로 반환한다.
"""
with open("test01_write.txt", "r", encoding="utf-8") as f:
    print(f.read())
    print("파일 닫혀있니? ", f.closed)

print("with 빠져나옴.. 파일 닫혀있니? ", f.closed)
