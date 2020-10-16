"""

author : oloop

Circular merge

"""

import sys


def get_test_case():
    n = input()
    case = [int(i) for i in input().split(" ")]
    return case


def add(l,i):
    # l is list, n is the index for addition
    #modified list
    if i >= len(l) :
        return "wrong index"

    if( i == len(l) - 1):
        last = l[i-1] + l[i]
        ml = [last] + l[1:i]
    else:
        ml = l[:i] + [(l[i] + l[i+1])] + l[i+2:]
    return ml



def penalty(a,d):
    # a is the circular list, d is the dictionary for values
    n = len(a)
    if d.get(tuple(a)) != None:
        return d.get(tuple(a))
    elif n == 2:
        d[tuple(a)] = a[0] + a[1]
        return d[tuple(a)]
    else : 
        penal_list = []
        for i in range(len(a)):
            x = add(a,i)
            if ( i == len(a) - 1 ):
                p = x[0]
            else :
                p = x[i]
            y = p + penalty(x,d)
            penal_list.append(y)
        m = min(penal_list)
        d[tuple(a)] = m
        return m

def print_penalty(a):
    d = {}
    p = penalty(a,d)
    print(p)

def _main():
    
    t = sys.stdin.readline()
    n = int(t)
    for i in range(n):
        case = get_test_case()
        print_penalty(case)


if __name__ == "__main__":
    _main()