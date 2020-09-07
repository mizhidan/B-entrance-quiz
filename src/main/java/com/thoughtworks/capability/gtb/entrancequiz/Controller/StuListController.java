package com.thoughtworks.capability.gtb.entrancequiz.Controller;

import com.thoughtworks.capability.gtb.entrancequiz.Domain.StudentName;
import com.thoughtworks.capability.gtb.entrancequiz.Service.StuListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class StuListController {

    @Autowired
    StuListService stuListService;

    @CrossOrigin
    @GetMapping("/students/list")
    public ResponseEntity<List<StudentName>> getStudentList() {
        return ResponseEntity.ok(stuListService.getStudentList());
    }

    @CrossOrigin
    @GetMapping("/students/sort")
    public ResponseEntity<List<StudentName>> getSortedList() {
        return ResponseEntity.ok(stuListService.getSortedList());
    }

}
