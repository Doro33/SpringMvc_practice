package ir.maktab.hospital.controller;

import ir.maktab.hospital.entity.Clinic;
import ir.maktab.hospital.service.ClinicService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clinic")
public class ClinicController {
    private final ClinicService clinicService;

    public ClinicController(ClinicService clinicService) {
        this.clinicService = clinicService;
    }

    @PostMapping("/save")
    public String save(@RequestBody Clinic clinic) {
        clinicService.saveOrUpdate(clinic);
        return "saved";
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id) {
        Clinic clinic = clinicService.findById(id);
        clinicService.delete(clinic);
        return "deleted";
    }

    @GetMapping("/find/{id}")
    public String find(@PathVariable Long id) {
        return clinicService.findById(id).toString();
    }

    @GetMapping("/findAll")
    public List<Clinic> findAll() {
        return clinicService.findAll();
    }

    @PutMapping("/update")
    public String update(@RequestBody Clinic clinic) {
        clinicService.saveOrUpdate(clinic);
        return "updated";
    }
}
