package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nВведите номер задания (или 0 для выхода):");
            int taskNumber = scan.nextInt();

            switch (taskNumber) {
                case 0:
                    System.out.println("Выход из программы.");
                    isRunning = false;
                    break;

                case 1:
                    System.out.println("Задание 1");
                    String filePathString = "E:\\Java\\Лр14\\src\\main\\java\\org\\example\\myFavMusic.txt";
                    File musicFile = new File(filePathString);

                    System.out.println("Название файла: " + musicFile.getName());
                    System.out.println("Размер: " + musicFile.length() + " Bytes");
                    System.out.println("Вывод содержимого:");

                    try {
                        List<String> lines = Files.readAllLines(Path.of(filePathString));
                        for (String line : lines) {
                            System.out.println(line);
                        }
                    } catch (IOException e) {
                        System.out.println("Ошибка чтения файла: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Задание 2");
                    FileWriter writer2 = new FileWriter("f.txt");
                    System.out.println("Введите 10 целых чисел:");
                    for (int i = 0; i < 10; i++) {
                        int inputNum = scan.nextInt();
                        writer2.write(inputNum + "\n");
                    }
                    writer2.close();
                    Scanner readF = new Scanner(new File("f.txt"));
                    System.out.println("\nЧисла из файла:");
                    int sum2 = 0;
                    while (readF.hasNextInt()) {
                        int fileNum = readF.nextInt();
                        System.out.print(fileNum + " ");
                        sum2 = sum2 + fileNum;
                    }
                    readF.close();
                    System.out.println("\nСреднее арифметическое: " + (sum2 / 10.0));
                    break;
                case 3:
                    System.out.println("Задание 3");
                    FileWriter writer3F = new FileWriter("f_random.txt");
                    for (int i = 0; i < 15; i++) {
                        int randomNum = (int) (Math.random() * 100) + 1;
                        writer3F.write(randomNum + "\n");
                    }
                    writer3F.close();

                    Scanner readRandom = new Scanner(new File("f_random.txt"));
                    FileWriter writerG = new FileWriter("g.txt");
                    FileWriter writerH = new FileWriter("h.txt");

                    while (readRandom.hasNextInt()) {
                        int num = readRandom.nextInt();
                        if (num % 10 == 0) {
                            writerG.write(num + "\n");
                        } else {
                            writerH.write(num + "\n");
                        }
                    }
                    readRandom.close();
                    writerG.close();
                    writerH.close();
                    System.out.println("Числа успешно разделены на файлы g.txt и h.txt!");
                    break;
                case 4:
                    System.out.println("Задание 4");
                    FileWriter writer4 = new FileWriter("noise.txt");
                    System.out.println("Введите 15 чисел уровня шума (через запятую или точку, зависит от ПК):");
                    for (int i = 0; i < 15; i++) {
                        double value = scan.nextDouble();
                        writer4.write(value + "\n");
                    }
                    writer4.close();

                    Scanner readNoise = new Scanner(new File("noise.txt"));
                    double sum4 = 0;
                    while (readNoise.hasNextDouble()) {
                        sum4 = sum4 + readNoise.nextDouble();
                    }
                    readNoise.close();
                    System.out.println("Средний уровень шума: " + (sum4 / 15.0));
                    break;
                case 5:
                    System.out.println("Задание 5");
                    FileWriter writer5 = new FileWriter("f_count.txt");
                    for (int i = 5; i < 15; i++) {
                        writer5.write(i + "\n");
                    }
                    writer5.close();
                    Scanner readCount = new Scanner(new File("f_count.txt"));
                    int count = 0;
                    while (readCount.hasNextInt()) {
                        int num = readCount.nextInt();
                        if (num > 10) {
                            count = count + 1;
                        }
                    }
                    readCount.close();
                    System.out.println("Количество чисел больше 10: " + count);
                    break;
                default:
                    System.out.println("Неверный номер задания. Попробуйте еще раз.");
                    break;
            }
        }
        scan.close();
    }
}
