package Java_Exc_Sem_2;

//Если необходимо, исправьте данный код
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

import java.util.Scanner;

public class HW_2 {
    public static void main(String[] args) {
        var1();
        var2();
    }

    public static void var1() { //Divide by zero
        try {
            int[] Array = new int[]{11, 3, 5, 7, 9, 54, 65, 5, 7, 3};
            int d = 0;
            double catchedRes1 = Array[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void var2() {
        try {
            int[] intArray = new int[]{1, 2, 3};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e);
        }

    }
}

