# json 데이터 파싱
import json

with open("json.txt", "r", encoding="utf-8") as f:
    data = json.loads(f.read())

# print(type(data))
# print(data)
# print(data["channel"])
# print(data["channel"]["item"])

for item in data["channel"]["item"]:
    print(item["author"], item["title"])
