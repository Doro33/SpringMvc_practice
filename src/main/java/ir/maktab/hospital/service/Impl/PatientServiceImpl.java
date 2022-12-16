package ir.maktab.hospital.service.Impl;

import ir.maktab.hospital.base.service.BaseServiceImpl;
import ir.maktab.hospital.dao.PatientDao;
import ir.maktab.hospital.entity.Patient;
import ir.maktab.hospital.exception.NullIdException;
import ir.maktab.hospital.service.AppointmentService;
import ir.maktab.hospital.service.PatientService;
import ir.maktab.hospital.service.PrescriptionService;
import ir.maktab.hospital.utils.AppContext;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl extends BaseServiceImpl<Patient, PatientDao> implements PatientService {
    private final AppointmentService appointmentService;

    public PatientServiceImpl(PatientDao repository, AppointmentService appointmentService, PrescriptionService prescriptionService) {
        super(repository);
        this.appointmentService = appointmentService;
        this.prescriptionService = prescriptionService;
    }

    private final PrescriptionService prescriptionService;

    @Override
    public boolean isNationalCodeExist(String nationalCode) {
        return repository.existsByNationalCode(nationalCode);
    }

    @Override
    public Patient findByNationalCode(String nationalCode) {
        return repository.findByNationalCode(nationalCode);
    }

    @Override
    public void showPatientInfo(Patient patient) {
        if (patient.getId() == null)
            throw new NullIdException("patient id cannot be null");

        System.out.println("personal info:");
        System.out.println(findById(patient.getId()));

        System.out.println("appointments:");
        AppContext.listPrinter(
                appointmentService.findPatientAppointments(patient)
        );

        System.out.println("prescriptions");
        AppContext.listPrinter(
                prescriptionService.findByPatient(patient)
        );
    }
}
