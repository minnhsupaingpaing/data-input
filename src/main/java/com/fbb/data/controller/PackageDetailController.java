package com.fbb.data.controller;


import com.fbb.data.entity.PackageDetail;
import com.fbb.data.service.PackageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/packageDetails")
public class PackageDetailController {

    @Autowired
    private PackageDetailService service;

    @PostMapping("/add")
    public PackageDetail addPackageDetail(@RequestBody PackageDetail packageDetail) {
        return service.savePackageDetail(packageDetail);
    }

    @GetMapping("/all")
    public List<PackageDetail> findAllPackageDetails() {
        return service.getPackageDetails();
    }

    @GetMapping("/{id}")
    public PackageDetail findPackageDetailById(@PathVariable Long id) {
        return service.getPackageDetailById(id);
    }

    @GetMapping("/packageName/{packageName}")
    public List<PackageDetail> findByPackageName(@PathVariable String packageName) {
        return service.findByPackageName(packageName);
    }

    @PutMapping("/update")
    public PackageDetail updatePackageDetail(@RequestBody PackageDetail packageDetail) {
        return service.updatePackageDetail(packageDetail);
    }

    @DeleteMapping("/delete/{id}")
    public String deletePackageDetail(@PathVariable Long id) {
        return service.deletePackageDetail(id);
    }
}

