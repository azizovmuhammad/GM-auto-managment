package com.example.GMautomanagment.service;

import com.example.GMautomanagment.Dto.RegionDto;
import com.example.GMautomanagment.entity.Region;

import java.util.List;

public interface RegionService {

    Region save(RegionDto dto);

    Region findById(Long id) throws ClassNotFoundException;

    List<Region> findAll() throws ClassNotFoundException;

    String deleteById(Long id) throws ClassNotFoundException;

    Region editById(Long id, RegionDto dto) throws ClassNotFoundException;
}
