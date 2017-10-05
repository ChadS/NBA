import java.util.Scanner;

class NBA
{
	public static void main(String[] args)
	{
		//construct Team Heat
		NBATeam heat= new NBATeam("Heat");
			System.out.print("How many players Heats own: ");
		Scanner input = new Scanner (System.in);
		int numberOfPlayers = input.nextInt();
		
		// Prompt user to enter players into the Team
		for (int i = 0; i < numberOfPlayers; i++)
		{
			System.out.print("Enter the name of Player #" + (i + 1) + ": ");
			String playerName = input.next();
			heat.addAPlayer(playerName);
			}
		//construct Team Spurs
		//Your code here
		NBATeam spurs= new NBATeam("Spurs");
			System.out.print("\nHow many players Spurs own: ");
		int numberOfPlayer_s = input.nextInt();
		for (int j = 0; j < numberOfPlayer_s; j++)
		{
			System.out.print("Enter the name of Player #" + (j + 1) + ": ");
			String playerName_s = input.next();
			heat.addAPlayer(playerName_s);
			}
		System.out.println();
		
		/*simulate a series of 7 games by generating a random number;
		// if the random number is bigger than 0.5, Heat wins; otherwise Heat losses a game.
		//As soon as team wins 4 games, the series is over. */
		//Your code here
		int series = 7;
		int gamesPlayed=0;
		int heatWins=0;
		int spursWins=0;
		while (series>0)
		{
			if (Math.random() > 0.5)
			{
				heat.winAgame(spurs);
				gamesPlayed++;
				heatWins++;
				}
			else
			{
				heat.lossAgame(spurs);
				spursWins++;
				gamesPlayed++;
				}
			series--;
			}
		if (heatWins==4)
			System.out.println("Heat ***WIN the series***");
		else
			System.out.println("Spurs ***WIN the series***");
		System.out.println(heat);
		System.out.println(spurs);
		}
	}