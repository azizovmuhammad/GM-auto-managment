package com.example.GMautomanagment.service.impl;

import com.example.GMautomanagment.Dto.RegionDto;
import com.example.GMautomanagment.entity.Region;
import com.example.GMautomanagment.repository.RegionRepository;
import com.example.GMautomanagment.service.RegionService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegionServiceImpl implements RegionService {

    private final RegionRepository regionRepository;

    public RegionServiceImpl(RegionRepository regionRepository) {
        this.regionRepository = regionRepository;
    }

    @Override
    public Region save(RegionDto dto) {

        Region region = new Region(
                dto.getName(),
                dto.getArea(),
                dto.getPopulation()
        );
        return regionRepository.save(region);
    }

    @Override
    public Region findById(Long id) throws ClassNotFoundException {
        Optional<Region> optionalRegion = regionRepository.findById(id);

        if (optionalRegion.isEmpty())
            throw new ClassNotFoundException("This Region Id Not Found");
        return optionalRegion.get();
    }

    @Override
    public List<Region> findAll() throws ClassNotFoundException {
        List<Region> regionList = regionRepository.findAll();
        if (regionList.isEmpty())
            throw new ClassNotFoundException("Region Not Added Yet");
        return regionList;
    }

    @Override
    public String deleteById(Long id) throws ClassNotFoundException {
        Optional<Region> optionalRegion = regionRepository.findById(id);
        if (optionalRegion.isEmpty())
            throw new ClassNotFoundException("This Region Id Not Found");
        regionRepository.deleteById(id);
        return "Successfully Deleted";
    }

    @Override
    public Region editById(Long id, RegionDto dto) throws ClassNotFoundException {
        Optional<Region> optionalRegion = regionRepository.findById(id);
        if (optionalRegion.isEmpty())
            throw new ClassNotFoundException("This Region Id Not Found");
        Region region = optionalRegion.get();

        if (!(region.getName().equals(dto.getName())))
            region.setName(dto.getName());
        if (!(region.getArea().equals(dto.getArea())))
            region.setArea(dto.getArea());
        if (!(region.getPopulation().equals(dto.getPopulation())))
            region.setPopulation(dto.getPopulation());

        return regionRepository.save(region);
    }
}
