package ru.nsu.fit.manager.controller;

import ru.nsu.fit.manager.service.ManagerService;
import ru.nsu.fit.manager.CrackHashWorkerResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/internal")
public class InternalController {
    private final ManagerService service;

    @Autowired
    public InternalManagerController(ManagerService service) {
        this.service = service;
    }

    @PatchMapping("/api/manager/hash/crack/request")
    public void receiveAnswer(@RequestBody CrackHashWorkerResponse response) {
        service.receiveAnswer(response);
    }

}