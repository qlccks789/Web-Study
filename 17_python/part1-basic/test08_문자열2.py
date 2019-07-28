msg = "Hello Python"
print(msg.replace("Python", "Bigdata"))  # Hello Bigdata
print(msg.split())  # ['Hello', 'Python']  기본 공백으로 파싱
print(msg.split("o")) # ['Hell', ' Pyth', 'n']
print(msg.upper())   # HELLO PYTHON
print(msg.lower())   # Hello Python
print(msg)           # Hello Python

print("|".join("Hello"))    # H|e|l|l|o
# print("Hello".join("l"))    # l

print("=" + "   Hello  =")                  # =   Hello  =
print("=" + "   Hello  ".lstrip() + "=")    # =Hello  =
print("=" + "   Hello   ".rstrip() + "=")   # =   Hello=
print("=" + "   Hello   ".strip() + "=")    # =Hello=
