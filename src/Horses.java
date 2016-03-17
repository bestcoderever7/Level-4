
public class Horses implements Horse
{
	private String name = "";
	private int weight = 0;
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return weight;
	}
	
	public Horses(String name,int weight)
	{
		this.name = name;
		this.weight = weight;
	}
}
