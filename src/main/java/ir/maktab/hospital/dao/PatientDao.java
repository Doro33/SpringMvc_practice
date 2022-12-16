package ir.maktab.hospital.dao;


import ir.maktab.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientDao extends JpaRepository<Patient,Long> {
    boolean existsByNationalCode(String nationalCode);

    Patient findByNationalCode(String nationalCode);
}
