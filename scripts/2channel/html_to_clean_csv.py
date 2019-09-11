from bs4 import BeautifulSoup
import csv
import re
from datetime import datetime

csvFile = open("./name_of_csv_file.csv", 'w+', newline='', encoding='UTF-8') #where to save
fileName = "name_of_html_file.html"
day = "(金)" #distinguish dates
anonName = "名無しさん＠１周年" #every board has a different way of naming 'anon' users
try:
	writer = csv.writer(csvFile)
	writer.writerow(('post ID', 'User', 'Date', 'UserID', 'Anonymous', 'Contents'))
	with open(fileName) as f:
		data = f.read()
		soup = BeautifulSoup(data, "html5lib")
		nameList = soup.findAll("div", "post")
		for name in nameList:
			print(name)
			post_id = name.find("span", "number").string
			if int(post_id) < 1001 and post_id != "1":
				post_name = name.find("span", {"class":{"name"}}).b.string
				is_anonymous = (post_name == anonName)
				post_date = name.find("span", {"class":{"date"}}).string
				post_date = post_date.replace(day, "")
				post_date = datetime.strptime(post_date, '%Y/%m/%d %H:%M:%S.%f')
				post_date = post_date.strftime('%x %X')
				post_uid = name.find("span", {"class":{"uid"}}).string
				post_contents = str(re.sub("<.*?>", "", str(name.find("span", "escaped"))))
				writer.writerow((post_id, post_name, post_date, post_uid, str(is_anonymous), post_contents))
finally:
	csvFile.close()



