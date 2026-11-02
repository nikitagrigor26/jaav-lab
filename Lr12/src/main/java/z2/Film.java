package z2;


import java.util.List;

public class Film {
    private int id;
    private String title;
    private String genre;
    private int rating;
    private List<Integer> criticScores;

    public Film(int id, String title, String genre, int rating, List<Integer> criticScores) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.criticScores = criticScores;
    }
    public double getAverageScore() {
        if (criticScores == null || criticScores.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (int score : criticScores) {
            sum += score;
        }
        return sum / criticScores.size();
    }

    public int getRating() {
        return rating;
    }
    public void setRating(int rating) {
        this.rating = rating;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    @Override
    public String toString() {
        return String.format("ID: %d  Название: \"%s\"  Жанр: %s Текущий рейтинг: %d Средний балл: %.2f", id, title, genre, rating, getAverageScore());
    }
}
