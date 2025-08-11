def add(*args):
    sum = 0
    for n in args:
        sum += n
    return sum
print(add(1,2,3,3,4,4))

# def calculate(**kwargs):
#     for key,value in kwargs.items():
#         print(key)
#         print(value)
#     print(kwargs)
def calculate(n,**kwargs):
    print(kwargs)
    n += kwargs["add"]
    n *= kwargs["multiply"]
    print(n)
calculate(1,add=2,multiply=3)