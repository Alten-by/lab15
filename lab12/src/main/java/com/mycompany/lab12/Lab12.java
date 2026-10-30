/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Timofey
 */
public class Lab12 {
    
    public static void printFilms(List<Film> films, int rating){
        for(Film f : films){
            if(rating==f.getRating())
                System.out.println(f);
        }
    }
    
    public static void main(String[] args) {
        /*задание 1
        5. Фигуры
Базовый класс: “Shape”
- Поля: “name”, “id”, “area”
Наследники:
1. “Circle” – поле: “radius”
2. “Rectangle” – поля: “width”, “height”
3. “Triangle” – поля: “base”, “height”
Задание: Создайте “Map<String, Shape>“ с именем как ключом, добавьте 3
Circle, 3 Rectangle, 2 Triangle, выведите все ключи и значения.
        */
        Map<String, Shape> mapik = new HashMap<String, Shape>();
        
        mapik.put("Круг 1", new Circle("Круг 1", 1, 78.5, 5));
        mapik.put("Круг 2", new Circle("Круг 2", 2, 28.26, 3));
        mapik.put("Круг 3", new Circle("Круг 3", 3, 12.56, 2));
        mapik.put("Прямоугольник 1", new Rectangle("Прямоугольник 1", 4, 24, 4, 6));
        mapik.put("Прямоугольник 2", new Rectangle("Прямоугольник 2", 5, 50, 10, 5));
        mapik.put("Прямоугольник 3", new Rectangle("Прямоугольник 3", 6, 18, 3, 6));
        mapik.put("Треугольник 1", new Triangle("Треугольник 1", 7, 12, 6, 4));
        mapik.put("Треугольник 2", new Triangle("Треугольник 2", 8, 20, 10, 4));

        mapik.forEach((key, shape) -> System.out.println("key="+key+" "+shape));
        /*задание 2
        Класс: “Film”
- Поля: “id”, “title”, “genre”, “rating”, “criticScores” (List<Integer>)
- Методы: “getAverageScore()”, “getRating()”, “setRating()”
Операции:
1. Удалить фильмы со средним рейтингом < 3
2. Повысить рейтинг фильмов со средним рейтингом >= 4
3. “printFilms(List<Film> films, int rating)” – печать фильмов с рейтингом
4. Упорядочить все фильмы по убыванию среднего рейтинга. При совпадении
– в алфавитном порядке по названию. Вывести ID, название и средний
рейтинг.
        */
        
        List<Film> films = new ArrayList<Film>() {{
            add(new Film(1, "День радио", "Комедия", 7,
                new ArrayList<>(List.of(7, 8, 6, 9))));
            add(new Film(2, "Хэллоуин", "Ужасы", 8,
                new ArrayList<>(List.of(6, 9, 10, 8))));
            add(new Film(3, "Побег из Шоушенка", "Драма", 9,
                new ArrayList<>(List.of(10, 9, 9, 10))));
            add(new Film(4, "Интерстеллар", "Фантастика", 8,
                new ArrayList<>(List.of(9, 8, 9, 8))));
            add(new Film(5, "Матрица", "Фантастика", 8,
                new ArrayList<>(List.of(9, 9, 8, 8))));
            add(new Film(6, "Криминальное чтиво", "Криминал", 8,
                new ArrayList<>(List.of(9, 10, 9, 8))));
            add(new Film(7, "Комната", "Драма", 3,
                new ArrayList<>(List.of(1, 2, 3, 1))));
            add(new Film(8, "Форрест Гамп", "Драма", 8,
                new ArrayList<>(List.of(9, 9, 8, 9))));
            add(new Film(9, "Начало", "Фантастика", 8,
                new ArrayList<>(List.of(8, 9, 9, 9))));
        }};
        
        Iterator<Film> iterator = films.iterator();
        
        while (iterator.hasNext()){
            Film f = iterator.next();
            if (f.getAverageScore()<3){
                iterator.remove();
                continue;
            }     
            else if(f.getAverageScore()>=4 && f.getAverageScore()!=10){
                f.setRating(f.getRating()+1);
            }
            
        }
        System.out.println("ZADANIE 2.3");
        printFilms(films, 10);
        System.out.println("ZADANIE 2.4");
        films.sort(
        Comparator.comparing(Film::getAverageScore).thenComparing(Film::getTitle).reversed()
        );
        for (Film f : films) {
            System.out.printf("ID: %d | %s | %.2f%n",
                    f.getId(), f.getTitle(), f.getAverageScore());
        }
    }
}
