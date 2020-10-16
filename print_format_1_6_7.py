"""

author : oloop

"""

import sys


def formatter(line):
    list_of_numbers = line.split(" ")
    list_of_numbers = list_of_numbers[1:]
    list_of_numbers[-1] = list_of_numbers[-1][:-1]

    for i in range(len(list_of_numbers)):
        info = "| {:2} - {:8.5} |".format(i,float(list_of_numbers[i]))
        print(info, end = " ")
        if (i%5 == 4) :
            print(" ")



line = sys.stdin.read()
formatter(line)