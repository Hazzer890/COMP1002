#
# Data Structures and Algorithms COMP1002
#
# Python file to hold all sorting methods
#

import numpy as np
import sys

sorted = False
passVar = 0
tempVar = 0

def bubbleSort(A):
    if sorted:
            pass
    else:
        for i in range(len(A)-1-passVar):
            if (A[i] > A[i+1]):
                tempVar = A[i]
                A[i] = A[i+1]
                A[i+1] = tempVar
                sorted = False
        pass


def insertionSort(A):
    ...

def selectionSort(A):
    ...

def mergeSort(A):
    """ mergeSort - front-end for kick-starting the recursive algorithm
    """
    ...

def mergeSortRecurse(A, leftIdx, rightIdx):
    ...

def merge(A, leftIdx, midIdx, rightIdx):
    ...

def quickSort(A):
    """ quickSort - front-end for kick-starting the recursive algorithm
    """
    ...

def quickSortRecurse(A, leftIdx, rightIdx):
    ...

def doPartitioning(A, leftIdx, rightIdx, pivotIdx):
    ...


