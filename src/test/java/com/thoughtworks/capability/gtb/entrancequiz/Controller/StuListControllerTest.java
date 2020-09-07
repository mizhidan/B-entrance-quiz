package com.thoughtworks.capability.gtb.entrancequiz.Controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.thoughtworks.capability.gtb.entrancequiz.Domain.StuList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
public class StuListControllerTest {
    @Autowired
    MockMvc mockMvc;
    ObjectMapper objectMapper;


    @BeforeEach
    public void Setup() {
        StuList stuList = new StuList();
    }

    @Test
    public void should_return_student_list_when_get_method() throws Exception {
        mockMvc.perform(get("/students/list"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$",hasSize(35)));
    }

}
