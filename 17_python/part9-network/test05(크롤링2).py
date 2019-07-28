from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://comic.naver.com/webtoon/weekday.nhn").read().decode("utf-8")
soup = BeautifulSoup(html, "html.parser")

for a_tag in soup.find_all("a", {"class": "title"}):

    detail = BeautifulSoup(urlopen("http://comic.naver.com" + a_tag['href']).read().decode("utf-8"), "html.parser")
    for a_tag in detail.find("table", {"class": "viewList"}).find_all("a"):
        if not a_tag["href"].startswith("/webtoon") or not a_tag.img:
            continue

        print("http://comic.naver.com" + a_tag["href"])
        print(a_tag.img["title"], a_tag.img["src"])

        break
