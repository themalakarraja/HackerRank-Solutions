n = int(input())
string_list = []
for i in range(n):
    string_list.append(input())

new_list = []
for word in string_list:
    str_e = ""
    str_o = ""
    for i, c in enumerate(word):
        if i%2 == 0:
            str_e += c
        else:
            str_o += c
    new_list.append(str_e + " "  + str_o)

for l in new_list:
    print(l)
