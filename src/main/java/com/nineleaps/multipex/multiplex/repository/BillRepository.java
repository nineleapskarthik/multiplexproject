package com.nineleaps.multipex.multiplex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nineleaps.multipex.multiplex.entity.Bill;



@Repository
public interface BillRepository extends JpaRepository<Bill, Long>{

}
