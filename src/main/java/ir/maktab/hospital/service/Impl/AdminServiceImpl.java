package ir.maktab.hospital.service.Impl;

import com.google.common.base.Strings;
import ir.maktab.hospital.entity.Appointment;
import ir.maktab.hospital.entity.Doctor;
import ir.maktab.hospital.entity.Patient;
import ir.maktab.hospital.service.AdminService;
import ir.maktab.hospital.service.AppointmentService;
import ir.maktab.hospital.service.PatientService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminServiceImpl implements AdminService {
    private final PatientService patientService;
    private final AppointmentService appointmentService;

    public AdminServiceImpl(PatientService patientService, AppointmentService appointmentService) {
        this.patientService = patientService;
        this.appointmentService = appointmentService;
    }

    @Override
    public void showPatientInfo(Patient patient) {
        patientService.showPatientInfo(patient);
    }

    @Override
    public List<Appointment> findDoctorAppointments(Doctor doctor) {
        return appointmentService.findDoctorAppointments(doctor);
    }

    @Override
    public Appointment addAppointment(Appointment appointment) {
        if (appointment.getDoctor()==null)
            throw new NullPointerException("doctor cannot be null");
        if (appointment.getDate()==null)
            throw new  NullPointerException("date cannot be null");
        if (Strings.isNullOrEmpty(appointment.getHour()))
            throw new NullPointerException("hour cannot be null");
        return appointmentService.saveOrUpdate(appointment);
    }

    @Override
    public List<Appointment> findAllAppointments() {
        return appointmentService.findAll();
    }
}
