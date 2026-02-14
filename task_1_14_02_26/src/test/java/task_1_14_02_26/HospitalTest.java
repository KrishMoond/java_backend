package task_1_14_02_26;

import entity.*;
import service.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

public class HospitalTest {

	@Test
	public void testCompleteHospitalData() {

		HospitalService service = new HospitalService();

		// 1️⃣ Create Patient
		MedicalRecord record = new MedicalRecord();
		record.setBloodGroup("A+");
		record.setAllergies("Dust");

		Patient patient = new Patient();
		patient.setName("Krish");
		patient.setAge(22);
		patient.setContact("9999999999");
		patient.setMedicalRecord(record);

		patient = service.registerPatient(patient);

		// 2️⃣ Create Appointments
		Appointment apt1 = new Appointment();
		apt1.setVisitDate("2026-02-20");
		apt1.setFee(500);
		apt1.setPatient(patient);

		Appointment apt2 = new Appointment();
		apt2.setVisitDate("2026-02-21");
		apt2.setFee(700);
		apt2.setPatient(patient);

		// 3️⃣ Create Doctor
		Doctor doctor = new Doctor();
		doctor.setName("Dr. Smith");
		doctor.setSpecialization("Cardiology");
		doctor.setAppointments(Arrays.asList(apt1, apt2));

		doctor = service.addDoctor(doctor);

		assertTrue(doctor.getId() > 0);
		assertEquals(2, doctor.getAppointments().size());
	}
}
