package pl.sda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class EmbeddedSort {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        generateNumbers();
        sort(numbers);
        System.out.println(numbers);
    }

    private static void sort(List<Integer> numbers) {
        Collections.sort(numbers);
    }

    private static void generateNumbers() {
    }
}
