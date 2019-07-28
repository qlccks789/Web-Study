# 객체를 파일에 저장하고 불러오기
import pickle

f = open("test02_object.txt", "rb")
# 파일에 쓰여진 객체를 읽기 위한 메서드( load )
result = pickle.load(f)
print(type(result))
print(result)
f.close()
