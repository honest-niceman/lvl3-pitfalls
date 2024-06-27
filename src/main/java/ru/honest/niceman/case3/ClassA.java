package ru.honest.niceman.case3;

public class ClassA {
    private int aInt;
    protected int bInt;
    public int cInt;

    private int privateMethodFromA() {
        return 1;
    }

    protected int protectedMethodFromA() {
        return 2;
    }

    public int publicMethodFromA() {
        return 3;
    }
}
