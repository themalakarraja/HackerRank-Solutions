if __name__ == '__main__':
    n = int(input())
    arr = map(int, input().split())
    arr = list(arr)
    arr.sort(reverse=True)
    for idx, i in enumerate(arr):
        if arr[idx] == arr[idx+1]:
            pass
        else:
            print(arr[idx+1])
            break
