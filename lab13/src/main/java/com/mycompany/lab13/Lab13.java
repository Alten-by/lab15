/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab13;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Timofey
 */
public class Lab13 {
/*
    Сущность: “Employee” 
- Поля: “name”, “position”, “salary”, “department” 
- Конструктор с проверкой: имя не пустое, зарплата > 0 
Исключения: 
- “InvalidSalaryException” – неверная зарплата 
- “DepartmentNotFoundException” – отдел не найден 
- “PromotionException” – ошибка повышения 
Методы:

- “promote(String newPosition)” – повышение 
- “changeDepartment(String newDept)” – смена отдела 
Задание: Создайте штат сотрудников, выполните операции повышения и  перевода. 

    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
            employees.add(new Employee("Егор", "Джуниор", 1000, "Разработка"));
            employees.add(new Employee("Анна", "Старший продавец", 1233, "Продажи"));
            employees.add(new Employee("Игорь", "Бухгалтер", 900, "Бухгалтерия"));
        try{
            System.out.println("Введите имя:");
            String name = scanner.nextLine();
            System.out.println("Введите позицию:");
            String position = scanner.nextLine();
            System.out.println("Введите зарплату:");
            double salary = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введите отдел:");
            String department = scanner.nextLine();
            employees.add(new Employee(name, position, salary, department));
            
            Employee last = employees.get(employees.size()-1);
            System.out.println(last);
            System.out.println("Введите позицию:");
            position = scanner.nextLine();
            last.promote(position);
            System.out.println("Введите новый отдел:");
            department = scanner.nextLine();
            last.changeDepartment(department);
            System.out.println("После изменений");
            System.out.println(last);
            
        }
        catch(InputMismatchException e){
            System.out.println("Ошибка: зарплата должна быть числом");
        }
        catch(InvalidSalaryException e){
            System.out.println("Ошибка зарплаты: " + e.getMessage());
        }
        catch(PromotionException e){
            System.out.println("Ошибка позиции: " + e.getMessage());
        }
        catch(DepartmentNotFoundException e){
            System.out.println("Ошибка отдела: " + e.getMessage());
        }
        catch(IllegalArgumentException e){
            System.out.println("Ошибка данных: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Ошибка:" + e.getMessage());
        }
        finally{
            scanner.close();
        }
    }
}