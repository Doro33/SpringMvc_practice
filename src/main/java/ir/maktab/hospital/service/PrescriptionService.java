package ir.maktab.hospital.service;

import ir.maktab.hospital.base.service.BaseService;
import ir.maktab.hospital.entity.Patient;
import ir.maktab.hospital.entity.Prescription;

import java.util.List;

public interface PrescriptionService extends BaseService<Prescription> {
    List<Prescription> findByPatient(Patient patient);
}
