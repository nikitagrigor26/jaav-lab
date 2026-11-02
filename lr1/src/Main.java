import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean prod = true;
        while (prod) {
            System.out.print("Введите чиско от 1 до 3, 4-зверешение программы - " );
            Scanner scan = new Scanner(System.in);
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Задание 1");
                    System.out.print("Введите число 1 - ");
                    int num1 = scan.nextInt();
                    System.out.print("Введите число 2 - ");
                    int num2 = scan.nextInt();
                    System.out.printf("Их разность : %d \n",num1-num2);
                    break;
                case 2:
                    System.out.println("Задание 2");
                    System.out.print("Введите число 1 - ");
                    int nums1 = scan.nextInt();
                    System.out.print("Введите число 2 - ");
                    int nums2 = scan.nextInt();
                    if (nums1 > nums2) {
                        System.out.println("Число 1 больше");
                    } else if (nums2 > nums1) {
                        System.out.println("Число 2 больше");
                    } else {
                        System.out.println("Они равны");
                    }
                    break;
                case 3:
                    System.out.println("Задание 3");
                    int n=0;
//                    System.out.print("Введите диапозон - ");
//                    int n = scan.nextInt();
//                    while (n <= 0) {
//                        System.out.println("n не может быть отрицательным и равным 0, Введите еще раз");
//                        n = scan.nextInt();
//                    }
                    do{
                        System.out.print("Введите диапозон - ");
                        n= scan.nextInt();
                    }
                    while(n<=0);
                    int sum = 0;
                    for (int i = 1; i <= n; i++) {
                        sum += i;
                    }
                    System.out.println("Сумма цифр в диапозоне : " + sum);
                    break;
                case 4:
                    System.out.println("Конец программы");
                    prod=false;
                    scan.close();
                    break;
                default:
                    System.out.print("такого задания нету \n");
                    break;
            }
        }

    }
}