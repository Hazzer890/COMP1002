/** 
** Software Technology 152
** Class to hold various static sort methods.
*/
class Sorts
{
    // bubble sort
    public static void bubbleSort(int[] A)
    {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
            if (A[j] > A[j + 1]) {
               
                int temp = A[j];
                A[j] = A[j + 1];
                A[j + 1] = temp;
            }
            }
        }
    }//bubbleSort()

    // selection sort
    public static void selectionSort(int[] A)
    {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
            if (A[j] < A[minIdx]) {
                minIdx = j;
            }
            }
            
            int temp = A[minIdx];
            A[minIdx] = A[i];
            A[i] = temp;
        }
    }// selectionSort()

    // insertion sort
    public static void insertionSort(int[] A)
    {
        int n = A.length;
        for (int i = 1; i < n; ++i) {
            int key = A[i];
            int j = i - 1;

            while (j >= 0 && A[j] > key) {
            A[j + 1] = A[j];
            j = j - 1;
            }
            A[j + 1] = key;
        }
    }// insertionSort()

    // mergeSort - front-end for kick-starting the recursive algorithm
    public static void mergeSort(int[] A)
    {
    }//mergeSort()
    private static void mergeSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//mergeSortRecurse()
    private static void merge(int[] A, int leftIdx, int midIdx, int rightIdx)
    {
    }//merge()


    // quickSort - front-end for kick-starting the recursive algorithm
    public static void quickSort(int[] A)
    {
    }//quickSort()
    private static void quickSortRecurse(int[] A, int leftIdx, int rightIdx)
    {
    }//quickSortRecurse()
    private static int doPartitioning(int[] A, int leftIdx, int rightIdx, int pivotIdx)
    {
		return 0;	// TEMP - Replace this when you implement QuickSort
    }//doPartitioning


}//end Sorts calss
