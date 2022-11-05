package ru.netology.koylubaevaem;

import java.util.*;

public class Randoms implements Iterable<Integer> {

    private final int min;
    private final int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new IteratorInt(min, max);
    }
}