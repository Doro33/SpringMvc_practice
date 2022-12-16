package ir.maktab.hospital.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Prescription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Patient patient;
    @ManyToOne
    private Doctor doctor;
    private LocalDate date;
    private String description;

    public Prescription(Patient patient, Doctor doctor, LocalDate date, String description) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
        this.description = description;
    }

    public String toString() {
        return "Prescription(patient: " + this.getPatient().getFullName()
                + ", doctor: " + this.getDoctor().getFullName()
                + ", date: " + this.getDate()
                + ", description: " + this.getDescription() + ")";
    }
}