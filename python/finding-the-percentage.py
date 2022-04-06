if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        name, *line = input().split()
        scores = list(map(float, line))
        student_marks[name] = scores
    query_name = input()
    std = student_marks.get(query_name)
    avg = sum(std)/len(std)
    print("{:.2f}".format(avg))
