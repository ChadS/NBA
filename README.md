Given are the partial java source codes for NBATeam and NBA classes. NBATeam class is the class for a basketball team. The class sets the name of the team and assigns members name (name is input by the user). NBA class creates two teams Heats and Spurs using NBATeam class. It asks for the number of players in each team, then asks the name of the members. Members are added to the respective team using addAPlayer(String newPlayerName) method in NBATeam class. Write the code for the method addAPlayer(String newPlayerName)in NBATeam class. You may also create other supporting methods which you think might we required.

After adding the team players, the NBA class will simulate a game series between Heats and Spurs. The series will have 7 games and each game is a random play. For each game, you need to generate a random number, if the random number is bigger than 0.5, Heat wins; otherwise Heat losses a game.  As soon as one of the team wins 4 games, the series is over. Announce who wins game along with the player names in each team and the score of each team. Write code to simulate this game play in NBA class.
Finish the programs for both classes to produce an output screen similar to the following figure.   

How many players Heats own: 5
Enter the name of Player #1: Heats1
Enter the name of Player #2: Heats2
Enter the name of Player #3: Heats3
Enter the name of Player #4: Heats4
Enter the name of Player #5: Heats5
How many players Spurs own: 5
Enter the name of Player #1: Spurs1
Enter the name of Player #2: Spurs2
Enter the name of Player #3: Spurs3
Enter the name of Player #4: Spurs4
Enter the name of Player #5: Spurs5

Spurs ***WIN the series***
Heats[ Heats1 Heats2 Heats3 Heats4 Heats5 ] win #: 3 los : 4
Spurs[ Spurs1 Spurs2 Spurs3 Spurs4 Spurs5 ] win #: 4 los : 3

Note:
1.	Submit both NBATeam.java and NBA.java files.
2.	Add your code on top of the existing code of the given java files (but do not change the existing code).
3.	 Your output must be as required in the java file. 
4.	The output is random. So the number of win and loss may be different in your result but the output must should be same.
5.	The final array output can be produced by toString() method.
