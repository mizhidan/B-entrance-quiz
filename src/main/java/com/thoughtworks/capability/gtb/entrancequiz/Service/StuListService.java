package com.thoughtworks.capability.gtb.entrancequiz.Service;

import com.thoughtworks.capability.gtb.entrancequiz.Domain.StuList;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StuListService {
    private final StuList stuList = new StuList();
    public List<String> getStudentList() {
        return stuList.convertToList();
    }
}
