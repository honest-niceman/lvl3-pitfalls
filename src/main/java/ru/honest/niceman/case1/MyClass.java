package ru.honest.niceman.case1;

public class MyClass {
    private int hashCodeValue;

    public MyClass(int hashCodeValue) {
        this.hashCodeValue = hashCodeValue;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return hashCodeValue;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "hashCodeValue=" + hashCodeValue +
                '}';
    }
}
