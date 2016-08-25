public class Invitee {
	private int age;
	private int additionalPeople;
	private String name;
	private int amountPaid;
	
	public Invitee(String name, int age, int additionalPeople, int amountPaid) {
		this.name = name;
		this.age = age;
		this.additionalPeople = additionalPeople;
		this.amountPaid = amountPaid;
	}
	
	public int getAge()
	{
		return age;
	}

	public int getAdditionalPeople() {
		return additionalPeople;
	}

	public void setAdditionalPeople(int additionalPeople) {
		this.additionalPeople = additionalPeople;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(int amountPaid) {
		this.amountPaid = amountPaid;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
