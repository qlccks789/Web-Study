"""
f = open(file, mode, option)
mode : 파일을 열때의 모드를 의미
  -  r :  읽기(디폴트)
  -  w : 쓰기
  -  a :  쓰기 + 이어쓰기
  -  b :  바이너리
  -  t  :  텍스트(디폴트)
"""
f = open("test01_write.txt", "r", encoding="utf-8")
"""
f.read() - 파일 전체 내용 읽기

파이썬은 간단하다.
python is simple.
"""
# print(f.read())  # 전체내용 읽기


"""
파이썬은 간단하다.
python is simple.

f.readline() 은 한줄읽는다(줄넘김 문자 포함됨)
"""
# print(f.readline(), end="")
# print(f.readline(), end="")

'''
# readlines() : 전체 내용을 읽어서 리스트 반환
'''
f_list = f.readlines()
print(type(f_list))    # <class 'list'>
print(f_list)          # ['파이썬은 간단하다.\n', 'python is simple.\n']

for data in f_list:
    # print(data, end="")
    print(data.strip("\n"))   # data.strip(문자) 문자에 해당하는 것을 data에서 찾아서 제거

f.close()
