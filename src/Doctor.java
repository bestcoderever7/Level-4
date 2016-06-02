import java.util.ArrayList;
import java.util.List;

public class Doctor {
	ArrayList<Patient> patients = new ArrayList<Patient>();
	boolean isEvil = false;
	Hospital h = new Hospital();

	public Doctor(String string, Hospital walkingDeadHospital) {
		// TODO Auto-generated constructor stub
		if(string.equals("666"))
		{
			joinTheDarkSide();
		}
		h = walkingDeadHospital;
	}

	public Doctor() {
		// TODO Auto-generated constructor stub
	}

	public Doctor(String string) {
		// TODO Auto-generated constructor stub
		if(string.equals("666"))
		{
			joinTheDarkSide();
		}
	}

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws Exception {
		// TODO Auto-generated method stub
		patients.add(patient);
		if (patients.size() > 3) {
			while (patients.size() > 3) {
				patients.remove(patients.size() - 1);
			}
			throw new DoctorFullException();
		}
	}

	public List<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		if (isEvil == false) {
			for (Patient p : patients) {
				p.checkPulse();
			}
		} else {
			for (Patient p : patients) {
				p.kill();
			}
		}
	}

	public Object isEvil() {
		// TODO Auto-generated method stub
		return isEvil;
	}

	public void joinTheDarkSide() {
		// TODO Auto-generated method stub
		isEvil = true;
	}

	public Object getHospital() {
		// TODO Auto-generated method stub
		return h;
	}

}
