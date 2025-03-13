public class Sorter {

    private int[] data;

    public Sorter() {
        this(null);
    }

    public Sorter(int[] data) {
        this.data = data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    // helper method which calls the recursive mergesort
    public void mergesort() {
        mergesort(0, data.length - 1);
    }

    // merge method to merge two sorted halves
    public void merge(int f, int m, int l) {
        // allocate a temp array for the merge
        int[] temp = new int[l - f + 1];

        // create the indexes for both array halves
        int f1 = f, l1 = m, f2 = m + 1, l2 = l, i = 0;

        // merge into the temp array as long as both halves have elements
        while (f1 <= l1 && f2 <= l2) {
            if (data[f1] < data[f2]) {
                temp[i++] = data[f1++];
            } else {
                temp[i++] = data[f2++];
            }
        }

        // finish the remaining elements of the half that has elements left
        while (f1 <= l1) {
            temp[i++] = data[f1++];
        }

        while (f2 <= l2) {
            temp[i++] = data[f2++];
        }

        // copy from temp array into the permanent array
        i = 0;
        for (int j = f; j <= l; i++, j++) {
            data[j] = temp[i];
        }
    }

    // recursive code to mergesort
    private void mergesort(int lo, int hi) {
        // base case: do nothing when the number of elements is 0 or 1
        if (lo >= hi) {
            return;
        }

        // recursive case: when there are 2+ elements in indexes lo to hi
        int mid = (lo + hi) / 2;
        mergesort(lo, mid);
        mergesort(mid + 1, hi);
        merge(lo, mid, hi);
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < data.length - 1; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println(data[data.length - 1] + "]");
    }

    void display(int n) {
        System.out.print("[");
        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.print(" ... ");
        for (int i = data.length - 1 - n; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println(data[data.length - 1] + "]");
    }

    // Bubble sort implementation
    public void bubbleSort() {
        int n = data.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    swap(j, j + 1);
                }
            }
        }
    }

    // Swap elements at indices m and n
    void swap(int m, int n) {
        int temp = data[m];
        data[m] = data[n];
        data[n] = temp;
    }

    // Binary search implementation
    public int binarySearch(int key) {
        int lo = 0;
        int hi = data.length - 1;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (data[mid] == key) {
                return mid;
            } else if (data[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1; // key not found
    }
}
