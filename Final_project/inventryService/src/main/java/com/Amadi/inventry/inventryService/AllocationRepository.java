package com.Amadi.inventry.inventryService;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllocationRepository extends JpaRepository<AllocationModel,Integer> {

    //List<AllocationModel> getAllData();
}
