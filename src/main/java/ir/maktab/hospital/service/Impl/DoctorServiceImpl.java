package ir.maktab.hospital.service.Impl;

import ir.maktab.hospital.base.service.BaseServiceImpl;
import ir.maktab.hospital.dao.DoctorDao;
import ir.maktab.hospital.entity.Clinic;
import ir.maktab.hospital.entity.Doctor;
import ir.maktab.hospital.service.DoctorService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DoctorServiceImpl extends BaseServiceImpl<Doctor, DoctorDao> implements DoctorService {

    public DoctorServiceImpl(DoctorDao repository) {
        super(repository);
    }

    @Override
    public List<Doctor> findByClinic(Clinic clinic) {
        return repository.findByClinic(clinic);
    }
}
