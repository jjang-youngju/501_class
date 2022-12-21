
# HTTP - 하이퍼텍스트(html)을 전송하기 위한 규칙
# 프로토콜 - 약속, 규약
# URL - http://www.naver.com
# URI - url에 사용자 정보와 스키마를 포함한 값

# 스크래핑 - 웹페이지에서 자동으로 데이터를 추출하는것,웹 페이지 소유자의 허락없이
#           무단으로 끌어오는 행위 
# 크롤링 - 웹페이지에서 자동으로 데이터를 추출

# 스크래핑은 특정 웹사이트에서 데이터 추출, 크롤링은 웹사이트의 링크를 통해서 정보를 
# 찾아서 추출하는 방식 - 둘다 데이터를 추출한다라는 것이 동일하기에 흔히 크롤링이라고 한다.

# import urllib.request
# import requests

from urllib.request import urlopen
import bs4

# test_html ="<html><head></head><body><div>hahaha</div></body></html>"

# bodj = bs4.BeautifulSoup(test_html,"html.parser")

# print(test_html)
# print(bodj)

# print(test_html.find("div"))
# print(bodj.find("div"))
# print(bodj.find("p"))


# url = "https://www.naver.com"
# html = urlopen(url)

# print(html.read())

html = """
<html>
    <body>
        <div>
            <ul class="kjy>
                <li>babo</li>
                <li>19</li>
            </ul>
            <ul class="ljh>
                <liold mai ...</li>
                <li>old...</li>
            </ul>
        </div>
    </body>
</html>
"""
# bsp = bs4.BeautifulSoup(html,"html.parser")

#태그의 속성을 통해서 가져오는 방법
# ul = bsp.find("ul",{"class":"ljh"})
# print(ul)



# ul = bsp.find("ul")
# print(ul)
# # li = bsp.find("li")
# # print(li.text)
# li = bsp.findAll("li")
# print(li[1])

# for i in li:
#     print(i.text)

url = "https://www.naver.com"
html = urlopen(url)
html = html.read()
# print(html)

bsp = bs4.BeautifulSoup(html,"html.parser")
temp = bsp.findAll("strong",{"class":"current"})
print(temp[0].text)
for t in temp:
    if"현재기온" in t:
        print(t.text)



# 웹을 만들기 위해 사용되는 다양한 기술들
# 필수- HTTP(HTTPS → SSL/TLS) : HTML과 JS와 CSS같은 파일을 웹 서버에게 요청하고 받아오는 프로토콜
#     - HTML : 웹 페이지를 채울 내용
#     - Javascript : 웹 페이지에 들어갈 기능
#     - CSS : 웹 페이지를 예쁘게 꾸밀 디자인
#     - ASP/SAP.NET, JSP, PHP : 웹 서버 페이지를 만드는 기술들
#     - JSP
#     - PHP
#     - DB
# 선택- Python
#     - Spring
#     - Jquery
#     - Ajax