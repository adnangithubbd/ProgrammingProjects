class Item:
    def __init__(self, value, weight):
        self.value = value
        self.weight = weight


array = [Item(60, 10), Item(100, 20), Item(120, 30)]
sorted_array = sorted(array, key=lambda item: item.value / item.weight, reverse=True)

for item in sorted_array:
    print(item.weight)