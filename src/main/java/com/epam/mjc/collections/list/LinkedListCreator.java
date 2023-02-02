package com.epam.mjc.collections.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListCreator {
    public LinkedList<Integer> createLinkedList(List<Integer> sourceList) {
        LinkedList<Integer> outList = new LinkedList<>();

        for(int i = 0; i < sourceList.size(); i++){
            if(sourceList.get(i) % 2 == 0){
                outList.addLast(sourceList.get(i));
            } else outList.addFirst(sourceList.get(i));
        }

        return outList;
    }
}
