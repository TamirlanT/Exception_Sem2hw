package Java_Exc_Sem_2;

public class HW_3 {
    public static void main(String[] args) /*throws Exception*/ {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 2);
            int[] abc = {1, 2};
            abc[3] = 9;
//        } catch (Throwable ex) {
//            System.out.println("Что-то пошло не так...");
//        }
        }catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!"); // Либо если оставить верхнюю запись будут обрабатываться все Excaption's а эти за комментировать
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }
    public static void printSum(int a, int b) /*throws FileNotFoundException*/ {
        System.out.println(a + b);
    }


}