public class SequentialSearch {

    public static int sequentialSearch(int [] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {10, 9, 7, 6, 2, 1};
        int targetElement = 8;

        int result = sequentialSearch(data, targetElement);

        if(result !=-1) {
            System.out.println("Element " + targetElement + " ditemukan pada indeks : " + result);
        } else {
            System.out.println("Element " +targetElement + " tidak ditemukan dalam array.");
        }

    }
}
