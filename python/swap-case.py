def swap_case(s):
    str1 = ""
    for i in s:
        if i.islower():
            str1 += i.upper()
        else:
            str1 += i.lower()
    return str1

