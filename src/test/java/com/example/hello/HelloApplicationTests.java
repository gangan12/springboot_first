package com.example.hello;

import com.example.hello.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HelloApplicationTests {

    @Autowired
    Student student;

    @Test
    void contextLoads() {
        System.out.println(student);
    }

}
