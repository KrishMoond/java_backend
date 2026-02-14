package task_1_14_02_26;

import entity.*;
import service.HospitalService;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class CompleteHospitalTest {

    @Test
    public void testCompleteHospitalData() {
        HospitalService service = new HospitalService();

        // 1. Create Patient with MedicalRecord
        MedicalRecord record = new MedicalRecord();
        record.setBloodGroup("B+");
        record.setAllergies("Peanuts");

        Patient patient = new Patient();
        patient.setName("John");
        patient.setAge(30);
        patient.setContact("8888888888");
        patient.setMedicalRecord(record);

        service.registerPatient(patient);

        // 2. Create Appointments
        Appointment apt1 = new Appointment();
        apt1.setVisitDate("2026-02-15");
        apt1.setFee(500.0);
        apt1.setPatient(patient);

        Appointment apt2 = new Appointment();
        apt2.setVisitDate("2026-02-20");
        apt2.setFee(700.0);
        apt2.setPatient(patient);

        // 3. Create Doctor with Appointments
        Doctor doctor = new Doctor();
        doctor.setName("Dr. Smith");
        doctor.setSpecialization("Cardiology");
        doctor.setAppointments(Arrays.asList(apt1, apt2));

        service.addDoctor(doctor);

        System.out.println("✅ All data inserted successfully!");
    }
}
