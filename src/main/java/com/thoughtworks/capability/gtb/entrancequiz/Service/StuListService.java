package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Domain.SortedList;
import com.thoughtworks.capability.gtb.entrancequiz.Domain.StuList;
import com.thoughtworks.capability.gtb.entrancequiz.Domain.StudentName;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StuListService {
    private final StuList stuList = new StuList();
    private final SortedList sortedList = new SortedList();

    public List<StudentName> getStudentList() {
        return stuList.convertToList();
    }

    public List<StudentName> getSortedList() {
        return  sortedList.getRandomList();
    }
}
