package com.krishna.application;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public final class softwareEngineerService {
    private final softwareEngineerRepo softwareEngineerRepo;

    public softwareEngineerService(softwareEngineerRepo softwareEngineerRepo) {
        this.softwareEngineerRepo = softwareEngineerRepo;
    }

    public List<softwareEngineer> getSoftwareEngineers() {
        return softwareEngineerRepo.findAll();
    }

    public void insertSoftwareEngineer(softwareEngineer softwareEngineer) {
        softwareEngineerRepo.save(softwareEngineer);
    }

    public softwareEngineer getSoftwareEngineerById(Integer id) {
        return softwareEngineerRepo.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void deleteSoftwareEngineer(Integer id) {
        boolean exists = softwareEngineerRepo.existsById(id);
        if (!exists) {
            throw new IllegalStateException(
                    id + " not found");
        }
        softwareEngineerRepo.deleteById(id);
    }
}
