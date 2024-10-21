package ru.netology.film;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FilmManagerTest {
    FilmManager manager = new FilmManager();

    @BeforeEach
    public void setup() {
        String film1 = "Harry";
        String film2 = "Harry_I";
        String film3 = "Harry";
        String film4 = "Harry";
        String film5 = "Harry_II";

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
    }
    @Test
    public void deleteFilm() {
        manager.deleteFilmsWithName("Harry");
        String[] expeced = {"Harry_I", "Harry_II"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expeced, actual);

    }

    @Test
    public void deleteFilmWithout() {
        manager.deleteFilmsWithName("Potter");
        String[] expeced = {"Harry", "Harry_I", "Harry", "Harry", "Harry_II"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expeced, actual);

    }

    @Test
    public void findAll() {
        String[] expeced = {"Harry", "Harry_I", "Harry", "Harry", "Harry_II"};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expeced, actual);
    }

    @Test
    public void findLast() {
        String[] expeced = {"Harry_II", "Harry", "Harry", "Harry_I", "Harry"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expeced, actual);
    }

}