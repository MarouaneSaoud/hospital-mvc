package ma.emsi.hospitalmvc;

import ma.emsi.hospitalmvc.entities.Patient;
import ma.emsi.hospitalmvc.repository.PatientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HospitalMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(PatientRepository patientRepository){
        return args -> {
            /*patientRepository.save(
                    new Patient(null , "Mohamed" , new Date(),false , 2));
            patientRepository.save(
                    new Patient(null , "khalid" , new Date(),false , 132));
            patientRepository.save(
                    new Patient(null , "Samir" , new Date(),true , 4));
            patientRepository.save(
                    new Patient(null , "Marouane" , new Date(),false , 2));*/

            patientRepository.findAll().forEach(patient -> {
                System.out.println(patient.getNom() +" "+ patient.getDateNaissance()+" "+patient.getScore());
            });

        };

    }
}
