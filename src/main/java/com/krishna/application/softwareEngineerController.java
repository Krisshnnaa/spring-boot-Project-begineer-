package com.krishna.application;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("api/v1/software-engineer")
public class softwareEngineerController {

    private softwareEngineerRepo softwareEngineerRepo;

    public softwareEngineerService(com.krishna.application.softwareEngineerRepo softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }

    @GetMapping
    public List<softwareEngineer> getEngineers() {
        return softwareEngineerService.getSoftwareEngineers();
    }
}