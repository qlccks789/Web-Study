# try문에서 오류가 발생하지 않은 경우 else 절이 수행됩니다.
try:
    f = open("a.txt")
    try:
        print(f.read())
    finally:
        f.close()
except Exception as err:
    print(err)


