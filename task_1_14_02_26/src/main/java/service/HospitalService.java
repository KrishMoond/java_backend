package service;

import dao.*;
import entity.*;

public class HospitalService {

	private PatientDAO patientDAO = new PatientDAO();
	private DoctorDAO doctorDAO = new DoctorDAO();

	public Patient registerPatient(Patient patient) {
		return patientDAO.savePatient(patient);
	}

	public Doctor addDoctor(Doctor doctor) {
		return doctorDAO.saveDoctor(doctor);
	}
}
