package com.example.GMautomanagment.controller;

import com.example.GMautomanagment.Dto.RegionDto;
import com.example.GMautomanagment.entity.Region;
import com.example.GMautomanagment.service.RegionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/regions")
public class RegionController {

    private final RegionService regionService;

    public RegionController(RegionService regionService) {
        this.regionService = regionService;
    }

    @PostMapping("/save")
    public Region save(@RequestBody RegionDto dto){
        return regionService.save(dto);
    }

    @GetMapping("/{id}")
    public Region findById(@PathVariable Long id) throws ClassNotFoundException {
        return regionService.findById(id);
    }

    @GetMapping("/all")
    public List<Region> findAll() throws ClassNotFoundException {
        return regionService.findAll();
    }

    @DeleteMapping("/edit/{id}")
    public String deleteById(@PathVariable Long id) throws ClassNotFoundException {
        return regionService.deleteById(id);
    }

    @PutMapping("/{id}")
    public Region editById(@PathVariable Long id, @RequestBody RegionDto dto) throws ClassNotFoundException {
        return regionService.editById(id, dto);
    }
}
