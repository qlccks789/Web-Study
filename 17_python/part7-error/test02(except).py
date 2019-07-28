"""
 try         실행코드 입력
 except      try 문 실행시 오류가 발생하면 except 문이 수행된다.
 else        try 문이 정상적으로 수행되었을 때 실행된다. 반드시 except 다음에 위치해야 한다.
 finally     예외 발생 여부와 상관없이 수행된다. 일반적으로 리소스 정리 작업을 처리한다.
 raise       인위적으로 예외를 발생시킨다.

"""
try:
    with open("a.txt") as f:
        print(f.read())
# 오류 종류와 상관없이 except 문을 수행한다.
except:
    print("오류 발생함")
