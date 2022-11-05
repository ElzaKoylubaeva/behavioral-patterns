package ru.netology.koylubaevaem;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Randoms randoms = new Randoms(50, 100);
        for (int r : randoms) {
            System.out.println(r);
            if (r == 100) {
                System.out.println("Выпало число 100, давайте на этом закончим");
                break;
            }
        }
    }
}
