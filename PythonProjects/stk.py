class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None


class Stack:
    def __init__(self):
        self.top = None

    def push(self, data):
        new_node = Node(data)
        if self.top is None:
            self.top = new_node
        else:
            new_node.next = self.top
            self.top.prev = new_node
            self.top = new_node

    def pop(self):
        if not self.top:
            return None
        poppped_data = self.top.data
        if self.top.next:
            self.top = self.top.next
            self.top.prev = None
        else:
            self.top = None

        return poppped_data

    def peek(self):
        return self.top.data if self.top else None

    def is_empty(self):
        return self.top is None

    def display(self):
        current = self.top
        while current:
            print(current.data, end="->")
            current = current.next
        print("None")


# def greater(a, b):
#     return a if a > b else b
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
stack.display()
stack.pop()
stack.display()
