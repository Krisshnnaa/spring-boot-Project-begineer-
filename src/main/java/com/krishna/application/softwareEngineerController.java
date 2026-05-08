package com.krishna.application;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/v1/software-engineer")
public class softwareEngineerController {

    @GetMapping
    public List<softwareEngineer> getEngineers() {
        return List.of(
                new softwareEngineer(1, "Krishna", "JS, Node, React, TailWind"),
                new softwareEngineer(2, "Manu", "Java, SpringBoot, Bootstrap"));
    }
}