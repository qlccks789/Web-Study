# 함수안에서 지역변수가 아닌 글로벌 변수 사용시 변수명 앞에 global 키워드를 선언한다.
num = 10
def local_num(a):
    global num
    num = 100
    return a + num

def global_num(a):
    return a + num


print("num : {0}".format(num))   # num : 10
val1 = local_num(100)
val2 = global_num(100)
print(val1)  # 200
print(val2)  # 200
print("num : {0}".format(num))  # num : 100
