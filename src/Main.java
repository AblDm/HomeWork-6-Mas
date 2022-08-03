public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Задание 1");

        int [] ints = new int [3];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;

        double[] counts2 = { 1.57, 7.654, 9.986 };

        boolean[] booleans = {true, false};
        System.out.print("\n");
        System.out.println("Задание 2");

        //task 2
        //2.1

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i!= ints.length - 1) {
                System.out.print(", ");
            }
        }
        //2.2
        System.out.print("\n");
        for (int i1 = 0; i1 < counts2.length; i1++) {
            System.out.print(counts2[i1]);
            if (i1!= counts2.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.print("\n");
        for (int i1 = 0; i1 < booleans.length; i1++) {
            System.out.print(booleans[i1]);
            if (i1!= booleans.length - 1) {
                System.out.print(", ");
            }
        }

        //3.1

        System.out.print("\n\n");
        System.out.println("Задание 3");
        //task 3

        for (int i = (ints.length - 1); i >= 0; i--) {
            System.out.print(ints[i]);
            if (i!=  0 ) {
                System.out.print(", ");
            }
        }
        //3.2
        System.out.print("\n");
        for (int i = (counts2.length - 1); i >= 0; i--) {
            System.out.print(counts2[i]);
            if (i!=  0 ) {
                System.out.print(", ");
            }
        }
        //3.3
        System.out.print("\n");
        for (int i = booleans.length -1; i >= 0; i--) {
            System.out.print(booleans[i]);
            if (i!=  0 ) {
                System.out.print(", ");
            }
        }
        System.out.print("\n\n");
        System.out.println("Задание 4");
        //task 4
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 == 1 ) {
                ints[i]++;
            }
            System.out.print(ints[i]);
            if (i!= ints.length - 1) {
                System.out.print(", ");
            }
        }






    }

}