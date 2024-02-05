import os, shutil

root = 'C:/MyFiles/'

if not os.path.exists(root + 'pyfiles'):
    os.makedirs(root + 'pyfiles')
else:
    txt_path = os.path.join(root + 'pyfiles', 'txt.php')

with open(txt_path, 'a') as f:
    f.write('hello some one is there')
    f.write('\n another text with new line')

os.listdir(root + 'pyfiles')

# print(files)
# f = open("hello.txt", "rt")
# old_text=f.read()
# fa = open('hello.txt', 'w')
# fa.write('hiii ')


# with open('hello.txt', 'wb') as f:
#     f.write(b'test')
# with open('hello.txt', 'ab') as f:
#     f.write(b'koko')
# with open('hello.txt', 'rb') as f:
#     f.read()


# with open('hello.txt', 'w') as f:
#     f.write('text with new line is added')
# with open('hello.txt', 'r') as f:
#     res = f.read()
#     print(res)
n = [1, 2, 3, 4, 5, 6]
ns = [item*2 for item in n]
print(ns)