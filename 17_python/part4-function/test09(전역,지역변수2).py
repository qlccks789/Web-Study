"""
이 경우 local_num 함수는 지역 변수 num이 존재하고
global_num 함수는 지역 변수 num이존재하지 않습니다.
그러므로 내부에서 return 할 때 num을 호출하지만 결과는 다르게 됩니다.
"""
num = 10
def local_num(a):
    num = 100   # 지역변수 인식, 전역변수에는 영향 없음
    return a + num


def global_num(a):
    return a + num

val1 = local_num(100)
val2 = global_num(100)
print(val1)  # 200
print(val2)  # 110
