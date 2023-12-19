package com.example.date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class MyController {
    @GetMapping("/")
    public String getTodayDate() {
        SimpleDateFormat ft = new SimpleDateFormat("dd-MM-yyyy");

        String str = ft.format(new Date());
        return str;
    }
}
