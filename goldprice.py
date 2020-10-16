"""

author : oloop

"""

import requests
import json


def get_bitcoin():

    url = "https://www.coinbase.com/api/v2/assets/summary?base=INR&filter=listed&include_prices=true&resolution=day"

    html  = requests.get(url)

    content = json.loads(html.content)

    bitcoin_price = content['data'][0]['latest_price']['amount']['amount']

    return (bitcoin_price)
    # return (bid_price.replace(",",""), ask_price.replace(",",""))

def get_gold():

    url = "https://fsapi.gold.org/api/v11/charts/spotprice"

    html  = requests.get(url)

    content = json.loads(html.content)

    ask_price = content['chartData']['usd']['ask']['price']
    bid_price = content['chartData']['usd']['bid']['price']

    return (bid_price, ask_price)
    # return (bid_price.replace(",",""), ask_price.replace(",",""))

bid,ask = get_gold()
price_bitcoin = float(get_bitcoin())  #'${:,.2f}'.format(amount)

print("%-8s : %10s"%("gold", ask))
print("%-8s : %10s"%("bitcoin",'{:,.2f}'.format(price_bitcoin)))
# print(float(price[0]))
# print(float(price[1]))
