try:
    with open('newfile.txt',mode='a') as file:
        file.write('THis is a new file\n')
        file.write('THis is another line\n')
        #writing multiple lines
        file.writelines(['a line\n','another line\n','yet another line\n'])
except FileNotFoundError as e:
    print('Error: File not found')