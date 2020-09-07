package com.thoughtworks.capability.gtb.entrancequiz.Domain;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

public class SortedList {
    private List<StudentName> sortedList;

    public SortedList() {
        StuList stuList = new StuList();
        sortedList = stuList.convertToList();
    }

    public List<StudentName> getRandomList() {
        int size = sortedList.size();
        Random random = new Random();

        for(int index = 0; index < size; index++) {
            int randomPos = random.nextInt(size);

            StudentName temp = sortedList.get(index);
            sortedList.set(index, sortedList.get(randomPos));
            sortedList.set(randomPos, temp);
        }
        return sortedList;
    }

    public List<StudentName> getSortedList() {
        return sortedList;
    }

    public void setSortedList(List<StudentName> sortedList) {

        this.sortedList = sortedList;
    }
}
