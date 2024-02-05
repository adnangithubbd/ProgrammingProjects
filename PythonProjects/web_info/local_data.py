import requests
from bs4 import BeautifulSoup

# with open('index.html', 'r', encoding='utf-8') as file:
#     html_content = file.read()
# soup = BeautifulSoup(html_content, 'html.parser')
# table = soup.find('table')
# if table:
#     for row in table.find_all('tr'):
#         data = [cell.text.strip() for cell in row]

url = "https://en.wikipedia.org/wiki/List_of_largest_corporate_profits_and_losses"
response = requests.get(url)
print(response.status_code)

soup = BeautifulSoup(response.text, 'html.parser')

tables = soup.find_all('table')[1]

