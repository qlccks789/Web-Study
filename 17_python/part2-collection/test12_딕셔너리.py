# 사전 : {}, 또는 dict()로 생성,
# 키로 사용하는 것은 값의 변경이 불가능한것 : 숫자, 문자열, 튜플
# 순서 없음, 인덱스 접근 불가능, 크기는 len()으로 접근 가능함

"""
아래의 코드에서 경고표시 나오면 메뉴에서 설정 변경하자
Settings -> Inspections -> Python
"Dictionary creation could be rewritten by dictionary literal" 체크해제
"""
dict1 = {"a": 1, "b": 2}

# 값 추가 및 변경
dict1["b"] = "bb"
dict1["c"] = "cc"
print(dict1, type(dict1))  # {'a': 1, 'b': 'bb', 'c': 'cc'} <class 'dict'>

# 입력된 값의 갯수
print(len(dict1))          # 3

# 값 꺼내기
print(dict1["a"])          # 1
print(dict1.get("a"))      # 1

# 데이터가 없을 경우의 기본 값
print(dict1.get("d", "ddd"))  # ddd

# 데이터 삭제하기
del dict1["a"]
print(dict1)  # {'b': 'bb', 'c': 'cc'}

print("-" * 50)

# 객체 생성
dict2 = dict()
dict2.update({
  'a': 1,
  'b': 2,
  'c': 'cc'
})
dict2["b"] = "bb"
print(dict2, type(dict2))  # {'a': 1, 'b': 'bb', 'c': 'cc'} <class 'dict'>
print(len(dict2))  # 3
print("-" * 50)

# 키만 가져오기
key_list = dict2.keys()    # dict_keys(['a', 'b', 'c']) 를 반환한다.
print(key_list)  # dict_keys(['a', 'b', 'c'])
print(list(key_list))  # ['a', 'b', 'c'], dict_keys라는 객체를 리스트로 변환한다.

# 값만 가져오기
print(dict2.values())  # dict_values([1, 'bb', 'cc'])
print(list(dict2.values()))  # [1, 'bb', 'cc']

# items() : 딕셔너리의 모든 키와 값을 튜플로 묶어서 반환하며
print(dict2.items())  # dict_items([('a', 1), ('b', 'bb'), ('c', 'cc')])
print(list(dict2.items()))  # [('a', 1), ('b', 'bb'), ('c', 'cc')]

# 전체 삭제
dict2.clear()
print(dict2)  # {}
