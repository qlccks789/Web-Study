from urllib.request import urlopen
from bs4 import BeautifulSoup

html = urlopen("http://comic.naver.com/webtoon/weekday.nhn").read().decode("utf-8")
soup = BeautifulSoup(html, "html.parser")
for a_tag in soup.find_all("a", {"class": "title"}):
    print(a_tag['title'], "http://comic.naver.com" + a_tag['href'])
