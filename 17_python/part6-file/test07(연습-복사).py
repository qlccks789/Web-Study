def my_copy(ori_name, dest_name):
    with open(ori_name, encoding="utf-8") as f1, open(dest_name, "w", encoding="utf-8") as f2:
        f2.write(f1.read())


# test01.txt 파일의 내용을 읽어서 test05.txt 에 저장하는 함수 구현
my_copy("test01_write.txt", "test01_write2.txt")
print("복사 성공")
