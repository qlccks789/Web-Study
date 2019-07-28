# test.mp3 파일을 읽어서 test3.mp3 파일로 복사
f = open("test.mp3", "rb")
f2 = open("test_copy.mp3", "wb")
f2.write(f.read())
f.close()
f2.close()
print("복사 성공")