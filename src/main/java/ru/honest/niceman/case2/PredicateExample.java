package ru.honest.niceman.case2;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Не изобретай велосипед
 */
public class PredicateExample {
    private static ArrayList<Predicate<Integer>> predicates = new ArrayList<>();

    public static void main(String[] args) {
        Predicate<Integer> positiveNumber = new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                return num > 0;
            }
        };

        predicates.add(positiveNumber);

        predicates.forEach(
                predicate -> {
                    System.out.println(predicate.test(10));
                    System.out.println(predicate.test(-10));
                }
        );
    }
}
