package com.krishna.application;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public final class softwareEngineerService {
    private softwareEngineerService softwareEngineerService;

    public List<softwareEngineer> getSoftwareEngineers() {
        return softwareEngineerRepo.findAll();
    }

}
