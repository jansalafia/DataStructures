package Class2;
public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {10, 20, 80, 30, 60, 50, 110, 100, 130, 170};
        int x = 110;
        int result = search(arr, x);
        System.out.println(result);

    }

    public static int search(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

}
