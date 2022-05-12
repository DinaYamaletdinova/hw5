public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Задание 1.1
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.print(arr[i]);
            }
        }
        System.out.println();


        for (int i = arr.length - 1; i>=0; i--) {
            if (i !=0) {
                System.out.print(arr[i] + ", ");
            } else{
                System.out.print(arr[i] + " ");
            }

        }
        System.out.println();

        // Задание 4.1
        for (int i = 0; i< arr.length; i++){
            if (arr[i]%2 !=0) {
                arr[i]++;
            }
            if (i < arr.length-1){
                System.out.print(arr[i] + ", ");
                }
            else{
                System.out.print(arr[i]);
            }


        }
        System.out.println();

        // Задание 1.2
        double[] ar = {1.57, 7.654, 9.986};
        ar [0] = 1.57;
        ar [1] = 7.654;
        ar [2] = 9.986;
        for (double d = 0; d < ar.length; d++) {
            if (d != ar.length - 1) {
                System.out.print(ar[(int) d] + ", ");
            } else
                System.out.print(ar[(int) d]);
        }

        System.out.println();

        for (int d = ar.length - 1; d>=0; d--) {
            if (d !=0) {
                System.out.print(ar[d] + ", ");
            } else{
                System.out.print(ar[d] + " ");
            }

        }
        System.out.println();

        // Задание 1.3
        short [] badums = new short[5];
        badums [0] = 2;
        badums [1] = 4;
        badums [2] = 6;
        badums [3] = 7;
        badums [4] = 8;
        for (short s = 0; s < badums.length; s++) {
            if (s != badums.length - 1) {
                System.out.print(badums[s] + ", " );
            }else
                System.out.print(badums[s]);
        }
        System.out.println();

        for (int s = badums.length - 1; s>=0; s--) {
            if (s !=0) {
                System.out.print(badums[s] + ", ");
            } else{
                System.out.print(badums[s] + " ");
            }

        }
        System.out.println();





    }
}
