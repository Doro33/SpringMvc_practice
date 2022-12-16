package ir.maktab.hospital.dao;

import ir.maktab.hospital.entity.Clinic;
import ir.maktab.hospital.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface DoctorDao extends JpaRepository<Doctor,Long> {
    List<Doctor> findByClinic(Clinic clinic);
}
