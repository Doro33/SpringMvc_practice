package ir.maktab.hospital.service.Impl;

import ir.maktab.hospital.base.service.BaseServiceImpl;
import ir.maktab.hospital.dao.PrescriptionDao;
import ir.maktab.hospital.entity.Patient;
import ir.maktab.hospital.entity.Prescription;
import ir.maktab.hospital.service.PrescriptionService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PrescriptionServiceImpl extends BaseServiceImpl<Prescription, PrescriptionDao>
        implements PrescriptionService {
    public PrescriptionServiceImpl(PrescriptionDao repository) {
        super(repository);
    }

    @Override
    public List<Prescription> findByPatient(Patient patient) {
        return repository.findByPatient(patient);
    }
}
