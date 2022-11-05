package ru.netology.koylubaevaem;

import java.util.Iterator;
import java.util.Random;


public class IteratorInt implements Iterator<Integer> {

    private final Random random = new Random();

    private final int min;
    private final int max;

    public IteratorInt(int min, int max) {
        this.min = min;
        this.max = max;
    }

    @Override
    public boolean hasNext() {
       return true;
    }

    @Override
    public Integer next() {
        return min + random.nextInt(max - min + 1);
    }


}
