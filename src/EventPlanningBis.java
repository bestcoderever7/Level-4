import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventPlanningBis {
	List<Invitee> invitees = new ArrayList<Invitee>();
	Integer totalNumOfPeople = 0;
	Integer averageAge = 0;
	Integer totalCollected = 0;
	Integer instancesOf = 0;

	public void addInvitee(Invitee person) {
		invitees.add(person);
	}

	public int getAverageAge() {
		if (invitees.size() != 0) {
			invitees.forEach(i -> averageAge = averageAge + i.getAge());
			averageAge = averageAge / invitees.size();
		}
		return averageAge;
	}

	public int getTotalMoneyCollected() {
		invitees.forEach(i -> totalCollected = totalCollected + i.getAmountPaid());
		return totalCollected;
	}

	public int getTotalNumberOfExpectedPeople() {
		invitees.forEach(i -> totalNumOfPeople = totalNumOfPeople + i.getAdditionalPeople() + 1);
		return totalNumOfPeople;
	}

	public void removeMinors() {
		invitees.removeIf(i -> i.getAge() < 18);
	}

	public Map<String, Integer> groupByNames() {
		Map<String, Integer> groups = new HashMap<String, Integer>();
		invitees.forEach(i -> groups.put(i.getName(), groups.getOrDefault(i.getName(), 0) + 1));
		return groups;
	}
}
