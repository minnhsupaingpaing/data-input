package com.fbb.data.repository;

import com.fbb.data.entity.PackageDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PackageDetailRepository extends JpaRepository<PackageDetail, Long> {
    @Query(value = "SELECT \n" +
            "    id,\n" +
            "    bandwidth_range,\n" +
            "    cat,\n" +
            "    charge_amount,\n" +
            "    charge_cycle,\n" +
            "    charge_name,\n" +
            "    charge_type,\n" +
            "    currency,\n" +
            "    package_creation,\n" +
            "    package_name,\n" +
            "    package_type,\n" +
            "    percent,\n" +
            "    plan,\n" +
            "    speed,\n" +
            "    speed_unit,\n" +
            "    tax_amount,\n" +
            "    total_amount\n" +
            "FROM \n" +
            "    data.package_detail\n" +
            "WHERE \n" +
            "    package_name LIKE %:packageName%;\n", nativeQuery = true)
    List<PackageDetail> findByPackageName(String packageName);
}
