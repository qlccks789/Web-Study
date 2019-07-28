"""
f = open(file, mode, option)
mode : 파일을 열때의 모드를 의미
  -  r :  읽기(디폴트)
  -  w : 쓰기
  -  a :  쓰기 + 이어쓰기
  -  b :  바이너리
  -  t  :  텍스트(디폴트)
"""

f = open("test01_write.txt", "w", encoding="utf-8")
f.write("파이썬은 간단하다.\n")
f.write("python is simple.")
f.close()

print("파일 쓰기 성공..")
