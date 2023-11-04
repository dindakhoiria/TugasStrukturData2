public class Merge {
    public static void mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return;
        }

        int mid = arr.length / 2;
        int [] left = new int[mid];
        int [] right = new int[arr.length - mid];

        // memecah array tersebut menjadi 2 bagian
        for ( int i =0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        // nenggabungkan kedua bagian
        mergeSort(left);
        mergeSort(right);

        // menggabungkan 2 bagian yang sudah diurutkan

        merge(arr, left, right);
    }

    public static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            }else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right [j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int [] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Array sebelum diurutkan");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        mergeSort(arr);

        System.out.println("\nArray setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }




}
