/**
 * This class calculates the number of soccer teams that a 
 * league may create from the number of available players. Input
 * validation is demonstrated with 'while' loops.
 */

import java.util.Scanner;

public class SoccerTeams 
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner(System.in);

        final int MIN_PLAYERS = 9;  // minimum number of players per team
        final int MAX_PLAYERS = 15; // maximum number of players per team
        int players, teamSize, teams, leftOver;

        // get the number of players per team
        System.out.print("Please enter the number of players per team: ");
        teamSize = kb.nextInt();

        // Validate the number entered (is it 9-15?)
        while (teamSize < MIN_PLAYERS || teamSize > MAX_PLAYERS)
        {
            System.out.println("Invalid input. Team sizes range from " + MIN_PLAYERS + " to " + MAX_PLAYERS);
            System.out.print("Please enter the number of players per team: ");
            teamSize = kb.nextInt();
        }

        // get the number of available players
        System.out.print("Please enter the number of available players: ");
        players = kb.nextInt();

        // Validate the number entered (no negative values)
        while(players < 0)
        {
            System.out.print("Number players must be non-negative. Enter 0 or greater: ");
            players = kb.nextInt();
        }

        // Calculate the number of teams
        teams = players / teamSize;

        // Calculate the number of left over  players
        leftOver = players % teamSize;

        // Display the results
        System.out.println("There will be " + teams + " teams with " + leftOver + " player(s) left over.");

        kb.close();
    }
}
