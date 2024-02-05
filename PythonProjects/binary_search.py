def binary_searchs(arr, target):
    low, high = 0, len(arr) - 1
    while low <= high:
        mid = (low + high) // 2
        mid_value = arr[mid]
        print(f"low {low} , mid {mid} , mid_number {mid_value}")
        if mid_value == target:
            return mid
        elif mid_value < target:
            low = mid + 1
        else:
            high = mid - 1
    return -1


sortedArray = [8,8,6,6,6,6,6,6,3,2,2,0,0,0]
target_value = 6
result = binary_searchs(sortedArray, target_value)
print(result)
