class NBATeam
{

	// instance variables
	private String Team_Name;
	private int Win;
	private int Loss;
	private String [] array = new String[10];
	private int number=0;
	
	//Your code here
	// constructor
	public NBATeam(String s)
	{
		Team_Name = s;
		Win = 0;
		Loss = 0;
		number = 0;
		}
	
	// Instance method
	public String get_TeamName()
	{
		return Team_Name;
		}
	public void set_TeamName(String s)
	{
		Team_Name = s;
		}
	public void winAgame(NBATeam teamB)
	{
		Win++;
		teamB.lossAgame();
		}
	public void lossAgame(NBATeam teamB)
	{
		Loss++;  
		teamB.winAgame();
		}
	public void winAgame()
	{
		Win++;
		}
	public void lossAgame()
	{
		Loss++;
		}
	public void addAPlayer(String Name)
	{
		if(number== 10)
			System.out.println("Array is FULL!!!");
		else
		{
			array[number] = Name;
			number++;
			}
		}
	
	public String toString()
	{
		String s=Team_Name+" win #: " + Win + " los : " +Loss;
		return s;
		}
	}