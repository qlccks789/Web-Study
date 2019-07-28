# select 테스트
import pymysql

# 연결 형성
conn = pymysql.connect(host='localhost', user='bit2019',
                       password='bit2019', db='bitdb', charset='utf8')

# 연결 후 SQL 실행하기 위한 객체 : Cursor
cursor = conn.cursor()

# SQL 작성
sql = """select no, title, writer 
           from tb_board
          order by no desc"""

# SQL 실행하기 : 실행된 결과가 cursor에 담겨있다.
cursor.execute(sql)
# print(type(cursor))  # <class 'pymysql.cursors.Cursor'>

# 결과값 확인하기
"""
for row in cursor:
    print(row, type(row))   # <class 'tuple'>
"""


# rows = cursor.fetchall()     # 전체 가져오기
# rows = cursor.fetchmany(3)   # 지정된 숫자 만큼 가져오기
# for row in rows:
#     print(row, type(row))   # <class 'tuple'>


"""
# 하나의 데이터만 가져오기
"""
row = cursor.fetchone()
print(type(row))  # <class 'tuple'>
print(row)



# 연결 닫기
conn.close()