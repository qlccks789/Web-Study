# pip install pymysql 설치 후 모듈 사용 가능
import pymysql

# 연결 형성
conn = pymysql.connect(host='localhost', user='bit2019',
                       password='bit2019', db='bitdb', charset='utf8')

# 연결 후 SQL 실행하기 위한 객체 : Cursor
cursor = conn.cursor()

# SQL 작성
sql = "insert into tb_board(writer, title, content) values(%s, %s, %s)"

# SQL 실행하기
cursor.execute(sql, ('mysql0', 'mysql title0', 'mysql content0'))

# 여러개를 한번에 입력 처리(다중 입력하기)
data = (
    ('mysql1', 'mysql title1', 'mysql content1'),
    ('mysql2', 'mysql title2', 'mysql content2'),
    ('mysql3', 'mysql title3', 'mysql content3')
)

print(type(data))
cursor.executemany(sql, data)

# 데이터 베이스 적용하기 : 커밋을 해야 적용됨..
conn.commit()

print("SQL 처리 성공...")
