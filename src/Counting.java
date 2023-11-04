public class Counting {

    public static void countingSort(int[] arr) {
        int max = getMaxValue(arr);
        int min = getMinValue(arr);

        int range = max - min + 1;

        int[] countArray = new int[range];

        for (int num : arr) {
            countArray[num - min]++;
        }

        int k = 0;

        for (int i = 0; i < range; i++) {
            while (countArray[i] > 0) {
                arr[k] = i + min;
                k++;
                countArray[i]--;
            }
        }
    }

    private static int getMaxValue(int[] arr) {
        int max = arr[0];
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
        }
        return max;
    }

    private static int getMinValue(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr ={4, 2, 2, 8, 3, 3, 1};
        System.out.print("Array sebelum diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        countingSort(arr);

        System.out.println("\nArray yang setelah diurutkan:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }



}
