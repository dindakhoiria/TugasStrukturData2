public class BinarySearch {

    public static int binarySearch(int [] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }

        }
        return  -1;

    }

    public static void main(String[] args) {
        int [] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int targetElement = 12;

        int result = binarySearch(data, targetElement);

        if (result != -1) {
            System.out.println("Element " + targetElement + " ditemukan dalam indeks: " + result);
        } else {
            System.out.println("Element " + targetElement + " tidak dapat ditemukan dalam array.");
        }
    }
}
