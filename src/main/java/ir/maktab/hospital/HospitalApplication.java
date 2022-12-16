package ir.maktab.hospital;

import ir.maktab.hospital.entity.Clinic;
import ir.maktab.hospital.service.ClinicService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class HospitalApplication {
	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);

	}
	@Component
	public class Farzad implements CommandLineRunner{
		private final ClinicService clinicService;

		public Farzad(ClinicService clinicService) {
			this.clinicService = clinicService;
		}


		@Override
		public void run(String... args) throws Exception {
			clinicService.saveOrUpdate(new Clinic("Heart"));
		}
	}
}