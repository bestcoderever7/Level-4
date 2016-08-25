import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventPlanning {

	List<Invitee> invitees = new ArrayList<Invitee>();
	
	public void addInvitee(Invitee person) {
		invitees.add(person);
	}
	
	public int getAverageAge() {
		int averageAge = 0;
		if(invitees.size() != 0)
		{
		for(Invitee i : invitees)
		{
			averageAge = averageAge + i.getAge();
		}
		averageAge = averageAge / invitees.size();
		}
		return averageAge;
	}
	
	public int getTotalMoneyCollected() {
		int totalCollected = 0;
		for(Invitee i : invitees)
		{
			totalCollected = totalCollected + i.getAmountPaid();
		}
		return totalCollected;
	}
	
	public int getTotalNumberOfExpectedPeople() {
		int numOfPeople = 0;
		for(Invitee i : invitees)
		{
			numOfPeople = numOfPeople + i.getAdditionalPeople() + 1;
		}
		return numOfPeople;
	}
	
	public void removeMinors() {
		int size = invitees.size();
		for(int i = 0; i < size - 1; i++)
		{
			if(invitees.get(i).getAge() < 18)
			{
				invitees.remove(i);
				i--;
			}
		}
	}
	
	public Map<String, Integer> groupByNames() {
		Map<String, Integer> groups = new HashMap<String, Integer>();
		int instancesOf = 0;
		for(Invitee i : invitees)
		{
			if(groups.get(i.getName()) == null)
			{
				groups.put(i.getName(), 1);
			} else
			{
				groups.put(i.getName(), groups.get(i.getName()) + 1);
			}
		}
		return groups;
	}
}
