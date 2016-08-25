import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class EventPlanningBisTest {
private EventPlanningBis eventPlanning;
	
	@Before
	public void setup() {
		eventPlanning = new EventPlanningBis();
		Invitee invitee1 = new Invitee("Arya", 12, 1, 30);
		Invitee invitee2 = new Invitee("Cersei", 36, 3, 90);
		Invitee invitee3 = new Invitee("John", 24, 6, 150);
		eventPlanning.addInvitee(invitee1);
		eventPlanning.addInvitee(invitee2);
		eventPlanning.addInvitee(invitee3);
	}
	

	@Test
	public void testGetAverageAge() {
		assertEquals(24, eventPlanning.getAverageAge());
		eventPlanning = new EventPlanningBis();
		assertEquals(0, eventPlanning.getAverageAge());
	}
	
	@Test
	public void testGetTotalMoneyCollected() {
		assertEquals(270, eventPlanning.getTotalMoneyCollected());
	}

	@Test
	public void testGetTotalNumberOfExpectedPeople() {
		assertEquals(13, eventPlanning.getTotalNumberOfExpectedPeople());
	}
	
	@Test
	public void testRemoveMinors() {
		eventPlanning.removeMinors();
		assertEquals(11, eventPlanning.getTotalNumberOfExpectedPeople());
	}
	
	@Test
	public void testGroupByNames() {
		eventPlanning.addInvitee(new Invitee("Arya", 15, 2, 30));
		Map<String, Integer> groups = eventPlanning.groupByNames();
		assertTrue(2 == groups.get("Arya"));
		assertTrue(1 == groups.get("John"));
	}

}
