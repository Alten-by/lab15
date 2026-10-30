package com.mycompany.lab14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Timofey
 */
public class Lab14 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nВыберите задание:");
            System.out.println("1 - Файл о любимой музыке");
            System.out.println("2 - Среднее арифметическое 10 чисел");
            System.out.println("3 - Разделить числа на g.txt и h.txt");
            System.out.println("4 - Средний уровень шума");
            System.out.println("5 - Количество чисел больше 10");
            System.out.println("0 - Выход");
            System.out.print("Ваш выбор: ");

            int choice;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next();
                System.out.println("Введите число от 0 до 5.");
                continue;
            }

            switch (choice) {
                case 1: task1(); break;
                case 2: task2(); break;
                case 3: task3(); break;
                case 4: task4(); break;
                case 5: task5(); break;
                case 0:
                    System.out.println("Выход.");
                    return;
                default:
                    System.out.println("Нет такого задания.");
            }
        }
    }

    private static void task1() {
        try (PrintWriter pr = new PrintWriter("music.txt")) {
            pr.println("Исполнитель: Queen");
            pr.println("Альбом: Fat Bottomed Girls");
            pr.println("Год: 1978");
            pr.println("Жанр: Rock");
            pr.println("Любимый трек: Bicycle Race");
            pr.println("Длительность: 3:01");
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
            return;
        }

        File file = new File("music.txt");

        System.out.println("Данные о файле");
        System.out.println("Имя:            " + file.getName());
        System.out.println("Путь:           " + file.getAbsolutePath());
        System.out.println("Существует:     " + file.exists());
        System.out.println("Это файл:       " + file.isFile());
        System.out.println("Размер (байт):  " + file.length());
        System.out.println("Читаемый:       " + file.canRead());
        System.out.println("Записываемый:   " + file.canWrite());
        System.out.println("Последнее изм.: " + new Date(file.lastModified()));
        System.out.println();

        System.out.println("Содержимое файла");
        try (Scanner sc = new Scanner(file)) {
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }

    private static void task2() {
        try (PrintWriter pr = new PrintWriter("f.txt")) {
            System.out.println("Введите 10 чисел:");
            for (int i = 0; i < 10; i++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число, попробуйте снова:");
                    scanner.next();
                }
                pr.println(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
            return;
        }

        try (Scanner sc = new Scanner(new File("f.txt"))) {
            double s = 0;
            int count = 0;
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                System.out.print(a + " ");
                s += a;
                count++;
            }
            System.out.println();
            if (count > 0) {
                System.out.println("Среднее арифметическое = " + (s / count));
            } else {
                System.out.println("Файл пуст");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }

    private static void task3() {
        try (PrintWriter pr = new PrintWriter("f.txt")) {
            Random rnd = new Random();
            for (int i = 0; i < 10; i++) {
                pr.println(rnd.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
            return;
        }

        StringBuilder gs = new StringBuilder();
        StringBuilder hs = new StringBuilder();
        try (Scanner sc = new Scanner(new File("f.txt"))) {
            while (sc.hasNextInt()) {
                String a = String.valueOf(sc.nextInt());
                if (a.endsWith("0")) {
                    gs.append(a).append(" ");
                } else {
                    hs.append(a).append(" ");
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
            return;
        }

        try (PrintWriter g = new PrintWriter("g.txt");
             PrintWriter h = new PrintWriter("h.txt")) {
            g.println(gs.toString().trim());
            h.println(hs.toString().trim());
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
        }
    }

    private static void task4() {
        try (PrintWriter pr = new PrintWriter("l.txt")) {
            System.out.println("Введите 15 вещественных значений уровня шума (от 0 до 200):");
            for (int i = 0; i < 15; i++) {
                double value;
                while (true) {
                    if (!scanner.hasNextDouble()) {
                        System.out.println("Это не число, попробуйте снова (число " + (i + 1) + " из 15):");
                        scanner.next();
                        continue;
                    }
                    value = scanner.nextDouble();
                    if (Double.isNaN(value) || Double.isInfinite(value) || value < 0 || value > 200) {
                        System.out.println("Уровень шума должен быть в [0, 200], попробуйте снова:");
                        continue;
                    }
                    break;
                }
                pr.println(value);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл l.txt: " + e.getMessage());
            return;
        }

        try (Scanner sc = new Scanner(new File("l.txt"))) {
            double s = 0;
            int count = 0;
            while (sc.hasNextDouble()) {
                s += sc.nextDouble();
                count++;
            }
            if (count > 0) {
                System.out.printf("Средний уровень шума = %.2f%n", s / count);
            } else {
                System.out.println("Файл пуст");
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл l.txt не найден: " + e.getMessage());
        }
    }

    private static void task5() {
        try (PrintWriter pr = new PrintWriter("f.txt")) {
            System.out.println("Введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                while (!scanner.hasNextInt()) {
                    System.out.println("Это не число, попробуйте снова:");
                    scanner.next();
                }
                pr.println(scanner.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Не удалось создать файл: " + e.getMessage());
            return;
        }

        try (Scanner sc = new Scanner(new File("f.txt"))) {
            int total = 0;
            int count = 0;
            while (sc.hasNextInt()) {
                int a = sc.nextInt();
                total++;
                if (a > 10) {
                    count++;
                }
            }
            if (total == 0) {
                System.out.println("Файл пуст");
            } else {
                System.out.println("Количество чисел больше 10: " + count);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}