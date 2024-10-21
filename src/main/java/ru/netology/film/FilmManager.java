package ru.netology.film;
public class FilmManager {
    private String[] films = new String[0];
    private int limit;

    public FilmManager() {
        this.limit = 5;
    }

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public void addFilm(String name) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = name;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int reversLength;
        if (films.length <= limit) {
            reversLength = films.length;
        } else {
            reversLength = limit;
        }

        String[] tmp = new String[reversLength];

        for (int i = 0; i < reversLength; i++) {
            tmp[i] = films[films.length - 1 - i];
        }

        return tmp;
    }

    public void deleteFilmsWithName(String name) {
        int countFilmsDelete = 0;
        for (String filmName : films) {
            if (filmName.equals(name)) {
                countFilmsDelete++;
            }
        }
        String[] tmp = new String[films.length - countFilmsDelete];
        int cnt = 0;
        for (int i = 0; i < films.length; i++) {
            if (!(films[i].equals(name))) {
                cnt++;
                tmp[cnt - 1] = films[i];
//                String[] reverse = new String[tmp.length + 1];
//                reverse[reverse.length - 1] = films[i];
//                tmp = reverse;

            }
        }
        films = tmp;
    }
}
