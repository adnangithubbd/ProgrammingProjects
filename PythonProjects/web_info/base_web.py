import requests
from bs4 import BeautifulSoup

# url = 'https://www.scrapethissite.com/pages/forms/'
#
# page = requests.get(url)
# if page.status_code == 200:
#     soup = BeautifulSoup(page.text, 'html.parser')
#     print(soup.find('p').text)
# else:
#     print('Not 200 !')
root_url = "https://en.wikipedia.org/wiki/List_of_largest_corporate_profits_and_losses"
page = requests.get(root_url)
soup = BeautifulSoup(page.text, "html.parser")
tables = soup.find_all('table')
# print(tables)
table = tables[1]
print(table)
# column_data = table.find_all('tr')
# for row in column_data:
#     row_data = row.find_all('td')
#     single_data = [data.text.strip() for data in row_data]
#     print(single_data)
