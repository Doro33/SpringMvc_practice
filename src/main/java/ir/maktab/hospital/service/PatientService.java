package ir.maktab.hospital.service;

import ir.maktab.hospital.base.service.BaseService;
import ir.maktab.hospital.entity.Patient;

public interface PatientService extends BaseService<Patient> {
    boolean isNationalCodeExist(String nationalCode);

    Patient findByNationalCode(String nationalCode);

    void showPatientInfo(Patient patient);
}
