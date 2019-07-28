import json
import urllib.request

"""
url : https://openapi.naver.com/v1/search/blog?query=검색어
con.setRequestProperty("X-Naver-Client-Id", clientId);
con.setRequestProperty("X-Naver-Client-Secret", clientSecret);
"""

request_url = "https://openapi.naver.com/v1/search/blog?query=java"
clientId = ""
clientSecret = ""

# 헤더 설정 정보
headers = {
    "X-Naver-Client-Id": clientId,
    "X-Naver-Client-Secret": clientSecret
}

req = urllib.request.Request(request_url, headers = headers)
data = urllib.request.urlopen(req).read().decode("utf-8")
# print(type(data), data)  # <class 'str'>

# dict 객체로 변환
data = json.loads(data)
# print(type(data), data)  # <class 'dict'>

for item in data["items"]:
    print(item["title"], item["link"], item["description"])
