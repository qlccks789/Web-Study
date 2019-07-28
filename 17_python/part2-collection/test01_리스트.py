# 생성 : [], list()
singers = []
print("1 :", singers)  # 1 : []

singers = list()
# print("2 : " + singers)       #  TypeError: can only concatenate str (not "list") to str
print("2 : " + str(singers))  # 2 : []

names = ["김범수", "나얼", "박효신", "이수"]
print(names)

ages = [11, 22, 33, 44]
print(ages)

# 다양한 타입을 리스트에 넣을 수 있다.
singers = ["김범수", 11, "나얼", 22, "박효신", 33, "이수", 44]
print(singers)  # ['김범수', 11, '나얼', 22, '박효신', 33, '이수', 44]

singers = [["김범수", 11], ["나얼", 22], ["박효신", 33], ["이수", 44]]
print(singers)  # [['김범수', 11], ['나얼', 22], ['박효신', 33], ['이수', 44]]


