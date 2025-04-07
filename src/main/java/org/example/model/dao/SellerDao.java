package org.example.model.dao;

import org.example.model.entities.Seller;

import java.util.List;

public interface SellerDao {
    void insert(Seller Seller);

    void update(Seller Seller);

    void deleteById(int id);

    Seller findById(int id);

    List<Seller> findAll();
}
