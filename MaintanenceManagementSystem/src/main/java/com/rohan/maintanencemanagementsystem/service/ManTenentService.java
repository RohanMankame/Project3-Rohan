package com.rohan.maintanencemanagementsystem.service;

import com.rohan.maintanencemanagementsystem.entity.ManTenent;
//import com.rohan.maintanencemanagementsystem.entity.Tenent;

import java.util.List;


public interface ManTenentService {
    List<ManTenent> getAllTenents();

    ManTenent saveTenent(ManTenent manTenent);

    ManTenent getTenentById(long id);
    ManTenent updateTenent(ManTenent manTenent);

    void deleteTenentById(long id);

    //get find requests by keyword
    List<ManTenent> findByKeyword(String keyword);
}
