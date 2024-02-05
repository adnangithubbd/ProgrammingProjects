import os, shutil

path = r"C:/MyFiles/"
file_names = os.listdir(path)

folder_names = ['csv_file', 'image_file', 'text_file']
for folder in range(0, len(folder_names)):
    if not os.path.exists(path + folder_names[folder]):
        os.makedirs(path + folder_names[folder])

for file in file_names:
    if '.png' in file and not os.path.exists(path + 'image_file/' + file):
        shutil.move(path + file, path + 'image_file/' + file)
    if '.jpg' in file and not os.path.exists(path + 'csv_file/' + file):
        shutil.move(path + file, path + 'csv_file/' + file)
