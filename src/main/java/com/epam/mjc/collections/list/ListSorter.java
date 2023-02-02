package com.epam.mjc.collections.list;

import java.util.Comparator;
import java.util.List;

public class ListSorter {
    public void sort(List<String> sourceList) {
        sourceList.sort(new ListComparator());
    }
}

class ListComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        int first = Integer.parseInt(a);
        int second = Integer.parseInt(b);

        int firstResult = ((5 * (first * first)) + 3);
        int secondResult = ((5 * (second * second)) + 3);

        return firstResult > secondResult ? 1 : 
                    firstResult < secondResult ? -1 : 
                        first < second ? first : second;
    }
}
