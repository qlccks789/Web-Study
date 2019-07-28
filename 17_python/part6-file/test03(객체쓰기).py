# 객체를 파일에 저장하고 불러오기
import pickle

data = ["python", "is", "simple"]
# 객체를 파일에 쓰기 위해서 wb 를 사용함, 없으면 에러 발생한다.
# 바이너리 데이터이기 때문에 파일의 내용을 직접 해석할 수 없다.
f = open("test02_object.txt", "wb")

# 객체를 파일에 쓰기 위한 메서드( dump )
pickle.dump(data, f)

f.close()
print("객체 저장 성공...")
