package ru.honest.niceman.case4;

/**
 * Всё и сразу
 */
public class Calculator {
    private int value = 0;

    public int add(int number) {
        this.value += number;
        return this.value;
    }

    public int subtract(int number) {
        this.value -= number;
        return this.value;
    }

    public int multiply(int number) {
        this.value *= number;
        return this.value;
    }

    public void reset() {
        this.value = 0;                                                                                                                                                 this.value = 1; //HOLLY MOLLY!
    }
}
