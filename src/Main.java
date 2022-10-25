import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        Random random = new Random();
//        int[] array = new int[20];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(1, 99);
//            ;
//            if (array[i] % array[0] == 0) {
//                System.out.print(array[i] + " ");
//            }
//        }
//        System.out.println();
//        System.out.println(Arrays.toString(array));

        Random random = new Random();
        int[] numb = new int[20];
//        int counter = 0;
        for (int i = 0; i < numb.length; i++) {
            numb[i] = random.nextInt(-50, 50);
//            counter = numb [i];
            System.out.print(numb[i] + " ");


        }


        System.out.println();
        methodMax(numb);
        methodMin(numb);


    }

    public static void methodMax(int[] numb) {
        int maxNumber = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (maxNumber < numb[i]) {
                maxNumber = numb[i];
            }
        }

        System.out.println("maxNumber = " + maxNumber);

    }

    public static void methodMin(int[] numb) {
        int minNumber = numb[0];
        for (int i = 0; i < numb.length; i++) {
            if (minNumber > numb[i]) {
                minNumber = numb[i];
            }

        }
        System.out.println(" MinNumber = " + minNumber);

    }
}
