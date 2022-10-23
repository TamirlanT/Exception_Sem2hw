package Java_Exc_Sem_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HW_1 {
    public static void main(String[] args){
        System.out.println(checkFloat());

    }
        public static float checkFloat(){
        float num = 0;
        boolean check;
       do {
           check = true;
           Scanner scanner = new Scanner(System.in);
           System.out.println("Введите число float формата: ");
           try{
               num = scanner.nextFloat();
           } catch (NumberFormatException | InputMismatchException e){
               System.out.println("Введеные данные не являются float форматом");
               check = false;
           }
       }while (!check);
       return num;
    }
}
