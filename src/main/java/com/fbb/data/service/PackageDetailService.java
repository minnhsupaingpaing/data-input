package com.fbb.data.service;

import com.fbb.data.entity.PackageDetail;
import com.fbb.data.repository.PackageDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PackageDetailService {

    @Autowired
    private PackageDetailRepository repository;

    public PackageDetail savePackageDetail(PackageDetail packageDetail) {
        return repository.save(packageDetail);
    }

    public List<PackageDetail> getPackageDetails() {
        return repository.findAll();
    }

    public PackageDetail getPackageDetailById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<PackageDetail> findByPackageName(String packageName) {
        return repository.findByPackageName(packageName);
    }

    public String deletePackageDetail(Long id) {
        repository.deleteById(id);
        return "PackageDetail removed !! " + id;
    }

    public PackageDetail updatePackageDetail(PackageDetail packageDetail) {
        PackageDetail existingPackageDetail = repository.findById(packageDetail.getId()).orElse(null);
        if (existingPackageDetail != null) {
            existingPackageDetail.setPackageCreation(packageDetail.getPackageCreation());
            existingPackageDetail.setPackageName(packageDetail.getPackageName());
            existingPackageDetail.setCat(packageDetail.getCat());
            existingPackageDetail.setSpeed(packageDetail.getSpeed());
            existingPackageDetail.setSpeedUnit(packageDetail.getSpeedUnit());
            existingPackageDetail.setPlan(packageDetail.getPlan());
            existingPackageDetail.setChargeName(packageDetail.getChargeName());
            existingPackageDetail.setPackageType(packageDetail.getPackageType());
            existingPackageDetail.setChargeAmount(packageDetail.getChargeAmount());
            existingPackageDetail.setCurrency(packageDetail.getCurrency());
            existingPackageDetail.setChargeCycle(packageDetail.getChargeCycle());
            existingPackageDetail.setChargeType(packageDetail.getChargeType());
            existingPackageDetail.setPercent(packageDetail.getPercent());
            existingPackageDetail.setTaxAmount(packageDetail.getTaxAmount());
            existingPackageDetail.setTotalAmount(packageDetail.getTotalAmount());
            existingPackageDetail.setBandwidthRange(packageDetail.getBandwidthRange());
            return repository.save(existingPackageDetail);
        } else {
            return null;
        }
    }


}

