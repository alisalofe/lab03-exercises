def find_duplicates_nested_loop(l: list) -> list:
    s = set()
    for i in range(len(l) - 1):
        for j in range (i + 1, len(l)):
            if l[i] == l[j]:
                s.add(l[i])
    return list(s)

def find_duplicates_dictionary(l: list) -> list:
    d = {}
    s = set()
    for n in l:
        if n in d:
            s.add(n)
        else:
            d[n] = 0
    return list(s)

# In Python, if __name__ == "__main__" is a conditional check that determines whether 
# a Python file is being run as the main program or imported as a module into another 
# script.
if __name__ == "__main__":
    sample1 = [3, 7, 5, 6, 7, 4, 8, 5, 7, 66]
    sample2 = [3, 5, 6, 4, 4, 5, 66, 6, 7, 6]
    sample3 = [3, 0, 5, 1, 0]
    sample4 = [3]
    
    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))
    print("Sample 1:", find_duplicates_dictionary(sample1))
    print("Sample 2:", find_duplicates_dictionary(sample2))
    print("Sample 3:", find_duplicates_dictionary(sample3))
    print("Sample 4:", find_duplicates_dictionary(sample4))
