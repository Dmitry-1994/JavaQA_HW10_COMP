package ru.netology.film;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerWithParameterTest {
    FilmManager manager = new FilmManager(3);

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
    public void findLast() {
        String[] expeced = {"Harry_II", "Harry", "Harry"};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expeced, actual);
    }
}
