import random

def OrderId(n):
   return  f"O{random.randrange(0, 10**n-1):0{n}}"


def printbill(orders,bill):
    index = 0
    for oreder , items in orders.items():
        print("OrderID: ",OrderId(6))
        print("---------------------------------------------")
        print("Item name:\tQuantity\tTotal Price")
        for item in items:
            print(f"{item[0]}\t\t{item[1]}\t\t{menu.get(item[0])} x {item[1]}")
        print("---------------------------------------------")
        print(f"\t\t\t\tTotal : {bill[index]}")
        index += 1

menu = dict()

for i in range(1,31):
    key = f"Item{i}"
    val = round(random.uniform(10.0,500.0),1)
    menu[key] = val

print(menu)
    

n = int(input("Enter Number of Orders : "))
orders = dict()
for i in range(n):
    key = f"Order{i+1}"
    no_items = int(input(f"Enter Number of Items for Order - {i+1} :"))
    val = [[f"Item{int(input())}",int(input("Quantity : "))] for i in range(no_items)]
    orders[key] = val


bill = list()
for order in orders.values():
    total = 0
    for item in order:
        total += (menu.get(item[0]) * item[1])
    bill.append(round(total,2))

printbill(orders,bill)