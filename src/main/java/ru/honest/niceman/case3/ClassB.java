package ru.honest.niceman.case3;

public class ClassB extends ClassA {
    void myMethod() {

    }

    @Override
    protected int protectedMethodFromA() {
        return super.protectedMethodFromA();
    }
}
