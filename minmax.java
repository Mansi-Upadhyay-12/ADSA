import java.util.*;

class minmax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


            int N = sc.nextInt();   // size of array
            int[] arr = new int[N];

            // read array
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            // find minimum element
            int minVal = arr[0];
            for (int i = 1; i < N; i++) {
                if (arr[i] < minVal) {
                    minVal = arr[i];
                }
            }

            // count elements greater than minVal
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (arr[i] > minVal) {
                    count++;
                }
            }

            // print result
            System.out.println(count);
        }
    }

