package com.amin.restdemo.repository;

import com.amin.restdemo.entity.CloudVendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CloudVendorRepository extends JpaRepository<CloudVendorEntity,Integer> {
    CloudVendorEntity findByVendorId(int vendorId);

    public void deleteByVendorId(int vendorId);
}
