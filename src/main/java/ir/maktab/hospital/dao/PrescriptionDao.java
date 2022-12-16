package ir.maktab.hospital.dao;

import ir.maktab.hospital.entity.Patient;
import ir.maktab.hospital.entity.Prescription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PrescriptionDao extends JpaRepository<Prescription,Long> {
    List<Prescription> findByPatient(Patient patient);
}
