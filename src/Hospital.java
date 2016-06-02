import java.util.ArrayList;
import java.util.List;

public class Hospital {
	ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
	ArrayList<Patient> patientList = new ArrayList<Patient>();
	ArrayList<Zombie> zombieList = new ArrayList<Zombie>();

	public ArrayList<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctorList;
	}

	public void add(Object obj) {
		// TODO Auto-generated method stub
		if (obj instanceof Patient) {
			patientList.add((Patient) obj);
		} else if (obj instanceof Doctor){
			doctorList.add((Doctor) obj);
		}
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
				if (patientsNotAssignedToDoctors == 0) {
					break;
				}
			}
		}
	}

	public void makeDoctorsWork() {
		// TODO Auto-generated method stub
		for(Doctor d : doctorList)
		{
			if (d.isEvil == false) {
				for (Patient p : d.getPatients()) {
					p.checkPulse();
				}
			} else {
				for (Patient p : d.getPatients()) {
					p.kill();
					zombieList.add(new Zombie());
					patientList.remove(d.getPatients().size() - 1);
				}
			}
		}
	}

	public List<Zombie> getZombies() {
		// TODO Auto-generated method stub
		return zombieList;
	}
	
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientList;
	}

	// TODO Auto-generated method stub

}
