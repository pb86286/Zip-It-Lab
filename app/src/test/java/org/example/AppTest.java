package org.example;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {

    @Test
    void testZipWithIntegers() {
        List<Integer> list1 = List.of(1, 3, 5);
        List<Integer> list2 = List.of(2, 4, 6, 8, 10);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 8, 10);
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    void testZipWithStrings() {
        List<String> list1 = List.of("a", "b", "c");
        List<String> list2 = List.of("x", "y");
        List<String> expected = List.of("a", "x", "b", "y", "c");
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    void testZipWithEmptyLists() {
        List<String> list1 = List.of();
        List<String> list2 = List.of();
        List<String> expected = List.of();
        assertEquals(expected, App.zip(list1, list2));
    }

    @Test
    void testZipWithOneEmptyList() {
        List<String> list1 = List.of("hello", "world");
        List<String> list2 = List.of();
        List<String> expected = List.of("hello", "world");
        assertEquals(expected, App.zip(list1, list2));
    }
}