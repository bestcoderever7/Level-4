
public class HorseBarn {
	private Horse[] spaces = new Horse[7];
	public Horse[] getSpaces() {
		return spaces;
	}
	public HorseBarn createTestBarn()
	{
		spaces[0] = new Horses("Trigger", 1840);
		spaces[1] = null;
		spaces[2] = new Horses("Silver", 1210);
		spaces[3] = new Horses("Lady", 1575);
		spaces[4] = null;
		spaces[5] = new Horses("Patches", 1350);
		spaces[6] = new Horses("Duke", 1410);
		return new HorseBarn();
	}
}