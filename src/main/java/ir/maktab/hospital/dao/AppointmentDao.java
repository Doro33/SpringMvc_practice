package ir.maktab.hospital.dao;



import ir.maktab.hospital.entity.Appointment;
import ir.maktab.hospital.entity.Doctor;
import ir.maktab.hospital.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AppointmentDao extends JpaRepository<Appointment,Long> {
    List<Appointment> findByPatient(Patient patient);

    List<Appointment> findByDoctor(Doctor doctor);
@Query("""
        select a from Appointment a
        where a.doctor.id = :doctorId
        and a.patient.id is null
        """)
    List<Appointment> findDoctorFreeAppointments(Long doctorId);

@Query("""
        update Appointment as a 
        set a.patient.id  = :patientId
        where a.id = :appointmentId
        """)
@Modifying
    void addPatientToAppointment(Long appointmentId, Long patientId);
}
