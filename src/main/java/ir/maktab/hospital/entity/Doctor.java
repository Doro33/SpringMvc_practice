package ir.maktab.hospital.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Doctor  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fullName;
    private String phoneNumber;
    private String major;
    @ManyToOne
    private Clinic clinic;
    @OneToMany(mappedBy = "doctor")
    private Set<Prescription> prescriptions;
    @OneToMany(mappedBy = "doctor")
    private Set<Appointment> appointments;

    public Doctor(String fullName, Clinic clinic) {
        this.fullName = fullName;
        this.clinic = clinic;
        this.prescriptions = new HashSet<>();
        this.appointments = new HashSet<>();
    }

    public String toString() {
        return "Doctor(name: " + this.getFullName() +
                ", phoneNumber: " + this.getPhoneNumber() +
                ", major: " + this.getMajor() +")";
    }
}