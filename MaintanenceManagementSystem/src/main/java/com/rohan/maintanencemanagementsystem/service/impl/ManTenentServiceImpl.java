package com.rohan.maintanencemanagementsystem.service.impl;

import com.rohan.maintanencemanagementsystem.entity.ManTenent;
import com.rohan.maintanencemanagementsystem.repository.ManTenentRepository;
import com.rohan.maintanencemanagementsystem.service.ManTenentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManTenentServiceImpl implements ManTenentService {
    private ManTenentRepository manTenentRepository;

    public ManTenentServiceImpl(ManTenentRepository manTenentRepository) {
        super();
        this.manTenentRepository = manTenentRepository;
    }

    @Override
    public List<ManTenent> getAllTenents(){

        return manTenentRepository.findAll();
    }


    @Override
    public ManTenent saveTenent(ManTenent manTenent) {
        return manTenentRepository.save(manTenent);
    }

    @Override
    public ManTenent getTenentById(long id) {
        return manTenentRepository.findById(id).get();

    }

    @Override
    public ManTenent updateTenent(ManTenent mantenent) {
        return manTenentRepository.save(mantenent);
    }

    @Override
    public void deleteTenentById(long id) {
        manTenentRepository.deleteById(id);
    }

    @Override
    public List<ManTenent> findByKeyword(String keyword) {
        return null;
    }


}
