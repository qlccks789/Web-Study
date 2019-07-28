# 미정 키워드 인자 사전을 이용해 값을 전달하는 방법 : 미정 키워드 인자 이용
def login(ip, port, **other):
    s = "IP : " + ip + ", Port : " + str(port) + ", "
    print(type(other))    # <class 'dict'>

    for key in other.keys():
        s += key + " : " + other[key] + ", "

    return s


result = login("192.168.0.110", 8000)
print(result)  # IP : 192.168.0.110, Port : 8000,
result = login(
    "192.168.0.110", 8000,
    id="abc", passwd="1234")
print(result)    # IP : 192.168.0.110, Port : 8000, id : abc, passwd : 1234,

# 아래는 에러임... 반드시 이름과 값의 쌍으로 값을 넘겨야 한다.
# TypeError: login() takes 2 positional arguments but 3 were given
# s = login("192.168.0.110", 8000, "abc")
# print(s)
