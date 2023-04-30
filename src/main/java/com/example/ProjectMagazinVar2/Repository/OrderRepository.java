package com.example.ProjectMagazinVar2.Repository;

import com.example.ProjectMagazinVar2.DTO.OrderDTO;
import com.example.ProjectMagazinVar2.model.Orderer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends CrudRepository<Orderer,Integer> {
    OrderDTO findById(int id);
}
