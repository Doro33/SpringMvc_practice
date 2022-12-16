package ir.maktab.hospital.service.Impl;

import ir.maktab.hospital.base.service.BaseServiceImpl;
import ir.maktab.hospital.dao.AppointmentDao;
import ir.maktab.hospital.entity.Appointment;
import ir.maktab.hospital.entity.Doctor;
import ir.maktab.hospital.entity.Patient;
import ir.maktab.hospital.service.AppointmentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AppointmentServiceImpl extends BaseServiceImpl<Appointment, AppointmentDao>
implements AppointmentService {
    public AppointmentServiceImpl(AppointmentDao repository) {
        super(repository);
    }

    @Override
    public List<Appointment> findPatientAppointments(Patient patient) {
        return repository.findByPatient(patient);
    }

    @Override
    public List<Appointment> findDoctorAppointments(Doctor doctor) {
        return repository.findByDoctor(doctor);
    }

    @Override
    public List<Appointment> findDoctorFreeAppointments(Long doctorId) {
        return repository.findDoctorFreeAppointments(doctorId);
    }

    @Transactional
    @Override
    public void addPatientToAppointment(Long appointmentId, Long patientId) {
        repository.addPatientToAppointment(appointmentId,patientId);
    }
}