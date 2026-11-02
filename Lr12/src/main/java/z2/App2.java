package z2;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class App2 {
    public static void searchFilms(List<Film> films, int rating) {
        boolean found = false;
        for (Film film : films) {
            if (film.getRating() == rating) {
                System.out.println(film);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Фильмы с рейтингом " + rating + " не найдены.");
        }
    }
    public static void main(String[] args) {
        List<Film> films = new ArrayList<>();
        films.add(new Film(1, "Интерстеллар", "Фантастика", 3, Arrays.asList(5, 5, 4, 5)));
        films.add(new Film(2, "Бэтмен", "Боевик", 4, Arrays.asList(4, 4, 3, 5)));
        films.add(new Film(3, "Очень плохой фильм", "Комедия", 2, Arrays.asList(2, 1, 3, 2)));
        films.add(new Film(4, "Начало", "Фантастика", 4, Arrays.asList(5, 5, 5, 4)));
        films.add(new Film(4, "Аачало", "Фантастика", 4, Arrays.asList(5, 5, 5, 4)));
        films.add(new Film(5, "Посредственный фильм", "Драма", 3, Arrays.asList(3, 2, 3, 3)));
        System.out.println("Список фильмов");
        films.forEach(System.out::println);
        films.removeIf(film -> film.getAverageScore() < 3);
        for (Film film : films) {
            if (film.getAverageScore() >= 4.0) {
                film.setRating(film.getRating() + 1);
            }
        }
        System.out.println("После удаление и повышения");
        films.forEach(System.out::println);
        System.out.println("Фильмы с рейтингом 5");
        searchFilms(films, 5);
        films.sort(new Comparator<Film>() {
            @Override
            public int compare(Film f1, Film f2) {
                int scoreCompare = Double.compare(f2.getAverageScore(), f1.getAverageScore());
                if (scoreCompare != 0) {
                    return scoreCompare;
                }
                return f2.getTitle().compareTo(f1.getTitle());
            }
        });

        System.out.println("Упорядоченный список фильмов");
        for (Film film : films) {
            System.out.printf("ID: %d Название: %s Средний рейтинг: %.2f\n", film.getId(), film.getTitle(), film.getAverageScore());
        }
    }
}

