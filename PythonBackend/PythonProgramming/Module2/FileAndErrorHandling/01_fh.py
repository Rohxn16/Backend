def divide(a,b):
    return a/b

try:
    ans = divide(10,0)
except ZeroDivisionError as e:
    print('Division by zero\n')
except Exception as e:
    print('Something went wrong\n',e)