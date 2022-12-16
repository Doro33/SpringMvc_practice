package ir.maktab.hospital.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne()
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private LocalDate date;
    private String hour;

    public Appointment(Doctor doctor, LocalDate date, String hour) {
        this.doctor = doctor;
        this.date = date;
        this.hour = hour;
    }

    public String toString() {
        String patientName = "_ ";
        if (patient != null)
            patientName = this.getPatient().getFullName();
        return "Appointment(patient: " + patientName
                + ", doctor: " + this.getDoctor().getFullName()
                + ", date: " + this.getDate()
                + ", hour: " + this.hour + ")";
    }
}