import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        boolean prod=true;
        while(prod) {
            System.out.print("Выберите задание 1,2 или 3 для выхода из программы - ");
            Scanner s = new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice){
                case 1:
                    int[] mass = new int [10];
                    Random rand=new Random();
                    System.out.println("Заполните массив");
                    for(int i=0;i< mass.length;i++){
                        System.out.printf("%d = ", i+1);
                     //   mass[i]=s.nextInt();
                        mass[i]= rand.nextInt(201)-100;

                    }
                    System.out.println("Ваш массив");
                    for(int i=0;i< mass.length;i++){
                        System.out.print(mass[i]);
                    }
                    System.out.println();
                    System.out.println("Поиск минимального элеменита");
                    int min=mass[0];
                    int index=0;
                    for(int i=0;i< mass.length;i++) {
                        if(mass[i]<min){
                            min=mass[i];
                            index=i;
                        }
                    }
                    System.out.printf("Минимальный элемент - %d, его индекс - %d",min,index);
                    break;
                case 2:
                    System.out.print("Введите размер матрицы - ");
                    int size = s.nextInt();
                    int [][] mas = new int[size][size];
                    Random random = new Random();
                    for(int i=0;i<mas.length;i++){
                        for(int j=0;j<mas.length;j++){
                            mas[i][j]=random.nextInt(201) - 100;
                        }
                    }
                    System.out.println("Ваша матрица");
                    for(int i=0;i<mas.length;i++){
                        for(int j=0;j<mas.length;j++){
                            System.out.printf("%-5d", mas[i][j]);
                        }
                        System.out.println();
                    }
                    int sum = 0;
                    int count = 0;
                    for (int i = 1; i < mas.length; i++) {
                        for (int j = 0; j < i; j++) {
                            if (mas[i][j] < 0) {
                                sum += mas[i][j];
                                count++;
                            }
                        }
                    }
                    System.out.printf("Сумма отрицательных элементов - %d, их колличество -%d\n",sum,count);
                    break;
                case 3:
                    System.out.println("Конец программы");
                    prod=false;
                    s.close();
                    break;
                default:
                    System.out.println("Задания с таким номером нету");
                    break;
            }
        }
    }
}