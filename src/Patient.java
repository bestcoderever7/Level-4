
public class Patient {

	boolean pulseChecked = false;
	boolean isAlive = true;
	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return pulseChecked;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		pulseChecked = true;
	}

	public void kill() {
		// TODO Auto-generated method stub
		isAlive = false;
	}

	public Object isAlive() {
		// TODO Auto-generated method stub
		return isAlive;
	}

}
