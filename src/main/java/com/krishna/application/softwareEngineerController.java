package com.krishna.application;

import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("api/v1/software-engineer")
public class softwareEngineerController {

    private softwareEngineerService softwareEngineerService;

    public softwareEngineerController(softwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping
    public List<softwareEngineer> getEngineers() {
        return softwareEngineerService.getSoftwareEngineers();
    }

    @GetMapping("{id}")
    public softwareEngineer getEngineerById(@PathVariable Integer id) {
        return softwareEngineerService.getSoftwareEngineerById(id);
    }

    @DeleteMapping("{id}")
    public void deleteSoftwareEngineer(@PathVariable Integer id) {
        softwareEngineerService.deleteSoftwareEngineer(id);
    }

    public String postMethodName(@RequestBody String entity) {
        // TODO: process POST request

        return entity;
    }

    @PostMapping
    public void addNewsoftwareEngineer(@RequestBody softwareEngineer softwareEngineer) {
        softwareEngineerService.insertSoftwareEngineer(softwareEngineer);
    }
}