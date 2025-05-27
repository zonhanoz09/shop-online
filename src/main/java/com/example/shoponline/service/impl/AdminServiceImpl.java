package com.example.shoponline.service.impl;

import com.example.shoponline.domain.Perfume;
import com.example.shoponline.repository.PerfumeRepository;
import com.example.shoponline.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService
{
    private final PerfumeRepository perfumeRepository;

    @Override
    public List<Perfume> getPerfumes() {
        return this.perfumeRepository.findAll();
    }
}
