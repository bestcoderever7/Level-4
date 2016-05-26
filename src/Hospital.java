import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();

	public void addDoctor(Doctor generalPractitioner) {
		// TODO Auto-generated method stub
		doctorList.add(generalPractitioner);
	}

	// public void addDoctor(Surgeon generalPractitioner) {
	// // TODO Auto-generated method stub
	// list.add(generalPractitioner);
	// }

	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorList;
	}

	public void addPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientList.add(patient);
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	public void assignPatientsToDoctors() throws Exception {
		// TODO Auto-generated method stub
		System.out.println(patientList.size());
		int patientsNotAssignedToDoctors = patientList.size();
		int patient = 0;
		while (patientsNotAssignedToDoctors > 0) {
			for (int i = 0; i < doctorList.size(); i++) {
				doctorList.get(i).assignPatient(patientList.get(patient));
				patient++;
				patientsNotAssignedToDoctors--;
				if(patientsNotAssignedToDoctors == 0)
				{
					break;
				}
			}
		}
	}

	// TODO Auto-generated method stub

}
