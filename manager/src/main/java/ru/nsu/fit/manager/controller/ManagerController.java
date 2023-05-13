package ru.nsu.fit.manager.controller;

import ru.nsu.fit.manager.dto.HashAndLength;
import ru.nsu.fit.manager.dto.RequestId;
import ru.nsu.fit.manager.dto.TaskStatus;
import ru.nsu.fit.manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ManagerController {
    private final ManagerService service;

    @Autowired
    public ManagerController(ManagerService service) {
        this.service = service;
    }

    @PostMapping("/hash/crack")
    public RequestId postMethod(@RequestBody HashAndLength body) {
        return service.getRequestId(body);
    }

    @GetMapping("/hash/status")
    public TaskStatus getMessage(RequestId id) {
        return service.getTaskStatus(id);
    }
}