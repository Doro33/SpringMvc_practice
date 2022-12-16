package ir.maktab.hospital.dao;


import ir.maktab.hospital.entity.Clinic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClinicDao extends JpaRepository<Clinic,Long> {
}
