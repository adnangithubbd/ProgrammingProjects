class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
        self.prev = None


class DoublyLinkedList:
    def __init__(self):
        self.head = None

    def add_to_last(self, data):

        new_node = Node(data)
        if not self.head:
            self.head = new_node
        else:
            current = self.head
            while current.next:
                current = current.next
            current.next = new_node
            new_node.prev = current

    def add_to_first(self, data):

        new_node = Node(data)
        if self.head is None:
            self.head = new_node
        else:
            new_node.next = self.head
            self.head.prev = new_node
            self.head = new_node

    def delete(self, data):
        current = self.head
        while current:
            if current.data == data:
                # not head
                if current.prev:
                    current.prev.next = current.next
                # head case
                else:
                    self.head = current.next
            return
        current = current.next

    def display(self):
        current = self.head
        while current:
            print(current.data, end="<->")
            current = current.next
        print('None')


dll = DoublyLinkedList()
dll.add_to_last(1)
dll.add_to_last(2)
dll.add_to_last(3)
dll.add_to_first(0)

dll.display()
