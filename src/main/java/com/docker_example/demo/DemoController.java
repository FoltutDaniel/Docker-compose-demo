package com.docker_example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {
    private final DemoRepo demoRepo;

    @Autowired
    public DemoController(DemoRepo demoRepo) {
        this.demoRepo = demoRepo;
    }

    @GetMapping
    public List<DemoEntity> findAll(){
        return demoRepo.findAll();
    }


    @GetMapping("/{id}")
    public DemoEntity getById(@PathVariable Integer id){
        return demoRepo.findById(id).get();
    }
}
