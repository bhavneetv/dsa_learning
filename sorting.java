public class sorting {
    static void displayArray(int arr[]) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        //testimng

        // bubble sorting
        // time complexity = O(n^2)
        int arr[] = { 4, 5, 2, 7, 8, 1, 55 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        displayArray(arr);



        // Selection Sorting
        // Time Complexity = O(n^2)
        int sel[] = { 7, 8, 23, 3, 1, 2, 55 };

        for (int i = 0; i < sel.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < sel.length - 1; j++) {
                if (sel[small] > sel[j]) {
                    small = j;
                }

            }

            int temp = sel[small];
            sel[small] = sel[i];
            sel[i] = temp;

        }

        displayArray(sel);

    }

}
