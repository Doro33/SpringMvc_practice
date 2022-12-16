package ir.maktab.hospital.service;

import ir.maktab.hospital.base.service.BaseService;
import ir.maktab.hospital.entity.Appointment;
import ir.maktab.hospital.entity.Doctor;
import ir.maktab.hospital.entity.Patient;

import java.util.List;

public interface AppointmentService extends BaseService<Appointment> {
    List<Appointment> findPatientAppointments(Patient patient);

    List<Appointment> findDoctorAppointments(Doctor doctor);

    List<Appointment> findDoctorFreeAppointments(Long doctorId);

    void addPatientToAppointment(Long appointmentId, Long patientId);
}