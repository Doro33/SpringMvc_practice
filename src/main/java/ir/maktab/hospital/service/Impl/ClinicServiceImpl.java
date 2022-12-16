package ir.maktab.hospital.service.Impl;

import ir.maktab.hospital.base.service.BaseServiceImpl;
import ir.maktab.hospital.dao.ClinicDao;
import ir.maktab.hospital.entity.Clinic;
import ir.maktab.hospital.service.ClinicService;
import org.springframework.stereotype.Service;

@Service
public class ClinicServiceImpl extends BaseServiceImpl<Clinic, ClinicDao>
implements ClinicService {

    public ClinicServiceImpl(ClinicDao repository) {
        super(repository);
    }
}
