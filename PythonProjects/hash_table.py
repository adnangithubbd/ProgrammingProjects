import math

user_input = int(input("Enter the Upper Limit of primary numbers:"))

primary_nums = set()


def is_prime(num):
    sorted_pk = sorted(primary_nums)

    for i in sorted_pk:

        if i != 1 and i <= int(math.sqrt(num)) and num % i == 0:
            return False

    else:

        primary_nums.add(num)

        return True


for i in range(1, user_input + 1):

    if is_prime(i):
        print(i)
