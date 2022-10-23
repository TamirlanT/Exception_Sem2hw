package Java_Exc_Sem_2;
// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя


import java.util.Scanner;

public class HW_4 {
    public static void main (String[] args){
printStr();
    }

    public static String printStr(){
        String str = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите текст\n");
        str = scanner.nextLine();
        if (str.isEmpty()){
            throw new RuntimeException("Пустые строки вводить нельзя");
        }
        return str;
    }
}
