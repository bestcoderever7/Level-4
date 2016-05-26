import java.util.ArrayList;
import java.util.List;

public class Doctor{
	ArrayList<Patient> patients = new ArrayList<Patient>();

	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) throws Exception{
		// TODO Auto-generated method stub
		patients.add(patient);
		if(patients.size() > 3)
		{
			while(patients.size() > 3)
			{
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
		for(Patient p : patients)
		{
			p.checkPulse();
			
		}
	}

}
