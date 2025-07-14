package org.example;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static <T> List<T> zip(List<T> list1, List<T> list2) {
        List<T> zipped = new ArrayList<>();
        int size1 = list1.size();
        int size2 = list2.size();
        int minSize = Math.min(size1, size2);

        for (int i = 0; i < minSize; i++) {
            zipped.add(list1.get(i));
            zipped.add(list2.get(i));
        }

        if (size1 > minSize) {
            zipped.addAll(list1.subList(minSize, size1));
        }
        if (size2 > minSize) {
            zipped.addAll(list2.subList(minSize, size2));
        }

        return zipped;
    }

    public static void main(String[] args) {
        List<Integer> nums1 = List.of(1, 3, 5, 7);
        List<Integer> nums2 = List.of(2, 4, 6, 8);
        List<Integer> mergedNumbers = zip(nums1, nums2);
        System.out.println(mergedNumbers);

        List<String> colors1 = List.of("Red", "Green", "Blue");
        List<String> colors2 = List.of("White", "Black", "Orange", "Pink", "Fuschia");
        List<String> mergedWords = zip(colors1, colors2);
        System.out.println(mergedWords);
    }
}