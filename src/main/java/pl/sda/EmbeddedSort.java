package pl.sda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbeddedSort {
    public static void main(String[] args) {

        List<Integer> numbers = generateNumbers();
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private static List<Integer> generateNumbers() {
        List<Integer> numbers = new ArrayList<>();

        return numbers;
    }
}
