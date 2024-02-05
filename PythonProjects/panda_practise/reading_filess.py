import pandas as pd

#
# df = pd.read_csv(r"C:\MyFiles\csv_file\countries.csv", encoding='latin1')
#
# print(df)

df = pd.read_csv(r"C:\MyFiles\csv_file\countries.csv", encoding='latin1')
pd.set_option('display.max_rows', 100)

pd.set_option('display.max_columns', 6)
print(df.head(100))
