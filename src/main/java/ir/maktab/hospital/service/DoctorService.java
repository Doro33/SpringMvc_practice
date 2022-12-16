package ir.maktab.hospital.service;

import ir.maktab.hospital.base.service.BaseService;
import ir.maktab.hospital.entity.Clinic;
import ir.maktab.hospital.entity.Doctor;

import java.util.List;

public interface DoctorService extends BaseService<Doctor> {
    List<Doctor> findByClinic(Clinic clinic);
}
