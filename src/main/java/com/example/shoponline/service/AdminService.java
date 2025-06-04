package com.example.shoponline.service;

import com.example.shoponline.domain.Perfume;
import com.example.shoponline.domain.Product;

import java.util.List;

public interface AdminService {
    List<Perfume> getPerfumes();
    List<Product> getProducts();
}
