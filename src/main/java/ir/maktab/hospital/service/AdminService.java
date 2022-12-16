package ir.maktab.hospital.service;

import ir.maktab.hospital.entity.Appointment;
import ir.maktab.hospital.entity.Doctor;
import ir.maktab.hospital.entity.Patient;

import java.util.List;

public interface AdminService {
    void showPatientInfo(Patient patient);

    List<Appointment> findDoctorAppointments(Doctor doctor);

    Appointment addAppointment(Appointment appointment);

    List<Appointment> findAllAppointments();
}
