class General:
    instance_cnt = 0

    def __init__(self):
        # 에러발생 : instance_cnt 는 자동으로 지역변수 개념이 되어서 선언없이 사용한 경우가 된다.
        # instance_cnt += 1
        General.instance_cnt += 1

    # 에러인것처럼 보이지만 에러아님 : 실행됩...
    def view_instance_cnt():
        print("Ins Cnt : ", General.instance_cnt)

g1 = General()
g2 = General()
g3 = General()
General.view_instance_cnt()
# TypeError: view_instance_cnt() takes 0 positional arguments but 1 was given
# g1.view_instance_cnt()