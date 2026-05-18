# 1. Initialize array to -1
arr = [-1] * 10
unique_count = 0

print("Enter ten numbers between 10 and 100 inclusive:")

for i in range(10):
    num = int(input(f"Number {i+1}: "))

    # Range check
    if 10 <= num <= 100:
        # 2. Check for duplicates
        is_duplicate = False
        for j in range(unique_count):
            if arr[j] == num:
                is_duplicate = True
                break

        # 3. Store if not a duplicate
        if not is_duplicate:
            arr[unique_count] = num
            unique_count += 1
    else:
        print("Invalid range. Number must be between 10 and 100.")

# 4. Display result (excluding -1)
print("\nUnique numbers entered:")
for val in arr:
    if val != -1:
        print(val, end=" ")
