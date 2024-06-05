file = open('sample.txt',mode='r')
data = file.readlines()
print(data)
file.close()


# another way to do this (preferred way)
with open ('sample.txt',mode='r') as f:
    data = f.readlines()
    for line in data:
        print(line)