# 리스트 메서드 사용하기
fruits = ["사과", "포도", "딸기"]

# 해당 객체(사과)의 개수를 반환
print(fruits.count("사과"))   # 1

# 데이터를 마지막에 추가
fruits.append("참외")
print(fruits)          # ["사과", "포도", "딸기", "참외"]

# 특정 위치에 추가
fruits.insert(1, '수박')
print(fruits)  # ['사과', '수박', '포도', '딸기', '참외']

# 정렬
fruits.sort();
print(fruits)          # ['딸기', '사과', '수박', '참외', '포도']

# 역정렬
fruits.reverse();
print(fruits)          # ['포도', '참외', '수박', '사과', '딸기']

# 지정된 객체 제거하기
fruits.remove("참외");
print(fruits)          # ['포도', '수박', '사과', '딸기']

# 지정된 위치의 데이터 제거
del fruits[1]
print(fruits)          # ['포도', '사과', '딸기']

# 마지막에 입력되어 있는 데이터를 꺼낸 후 삭제
print(fruits.pop())    # 딸기
print(fruits)          # ['포도', '사과']

# 지정된 위치의 데이터를 꺼내고 리스트에서 삭제한다.
print(fruits.pop(0))   # 포도
print(fruits)          # ['사과']

# extend를 통한 확장
fruits.extend(["배", "복숭아"])
print(fruits)          # ['사과', '배', '복숭아']

