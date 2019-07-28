# 터미널 열고 install 실행
# pip install beautifulsoup4
# 크롤링
from bs4 import BeautifulSoup
html = """
    <html>
        <head><title>테스트</title></head>
        <body>
            <div id="test"><a href="#1">연습</a></div>
            <div class="list">
                <ul class="item_ul">
                    <li><a href="http://www.naver.com"><b>네이버</b></a></li>
                    <li><a href="http://www.daum.com"><b>다음</b></a></li>
                </ul>
            </div>
        </body>
    </html>
"""

# html 파서 사용
soup = BeautifulSoup(html, "html.parser")

# div_tags = soup.find_all("div")
# print(div_tags)

# div의 class 속성의 값이 list 인 엘리먼트만 선택
div_tags = soup.find_all("div", {"class": "list"})
# print(div_tags)


# 선택된 div 태그중에서 첫번째 div 태그를 가져오고 
# div 태그의 자식중에서 ul 태그 하나 선택
ul_tag = div_tags[0].find("ul")
# print(ul_tag)

"""
"""
# 선택된 ul 태그중에서 모든 a 태그를 가져온다.
a_tags = ul_tag.find_all("a")
# print(a_tags)


# ul_tag = soup.find("ul")
# print(ul_tag)

# a_tags = soup.find_all("a")
# print(a_tags)

"""
"""
for a_tag in a_tags:
    # href 속성의 값 가져오기
    print(a_tag["href"])

    if not a_tag.b:
        continue

    # a 태그 안에서 b 태그를 가져오고 그 안에 있는 문자열만 가져온다.
    print(a_tag.find("b").string)

    # 위와 동일
    print(a_tag.b.string)

