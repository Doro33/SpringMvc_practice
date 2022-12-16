package ir.maktab.hospital.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Clinic  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String phoneNumber;
    @OneToMany(mappedBy = "clinic",fetch = FetchType.EAGER)
    private Set<Doctor> doctors;

    public Clinic(String name) {
        this.name = name;
        this.doctors = new HashSet<>();
    }
}