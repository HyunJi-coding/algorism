T = int(input())

for test_case in range(1, T + 1):
    n,p = map(int,input().split())
    floor = 0
    for i in range(1,n+1):
        floor += i
        if floor == p:
            floor -= 1
    print(floor)
        
        
    