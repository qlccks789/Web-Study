class General:
    instance_cnt = 0

    def __init__(self):
        General.instance_cnt += 1

    def view_instance_cnt():
        print("Ins Cnt : ", General.instance_cnt)

    static_view_instance_cnt = staticmethod(view_instance_cnt)

g1 = General()
g2 = General()
g3 = General()

General.static_view_instance_cnt()  # 3
g1.static_view_instance_cnt()  # 3

General.view_instance_cnt()  # 3
# TypeError: view_instance_cnt() takes 0 positional arguments but 1 was given
# g1.view_instance_cnt()