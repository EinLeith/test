import java.util.Scanner;
import java.util.regex.*;
import java.util.Random;



public class LeithTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String input = sc.nextLine();


        String[] Team = {"Manchester United", "Manchester City",
                "Liverpool", "Chelsea", "Arsenal", "Tottenham",
                "Bayern Munich", "Borussia Dortmund", "Real Madrid",
                "Barcelona", "Paris Saint-Germain", "Juventus",
                "AC Milan", "Inter Milan"};

        String[] EUTrophys = {"UEFA Champions League", "UEFA Europa League", "UEFA Super Cup", "UEFA Conference League"};

        String[] LeagueTitles = {"Premier League", "La Liga", "Bundesliga", "Serie A", "Ligue 1"};

        String[] DomesticCups = {"FA Cup","Copa del Rey", "DFB-Pokal", "Coppa Italia", "Coupe de France",};

        String[] NTrophys = {"FIFA World Cup", "UEFA Euro", "UEFA Nations League"};

        String BallonDor = "Ballon d'Or";

        int Goals = rand.nextInt(1000);
        String[] Position = {"Goalkeeper","Centre Back", "Wing Back", "Defensive Midfielder", "Central Midfielder", "Attacking Midfielder", "Winger", "Striker"};


        String[] NT = {"Germany", "France", "Italy", "Spain", "England", "Portugal",
                "Netherlands", "Belgium","Croatia",
                "Denmark", "Sweden", "Switzerland",
                "Poland", "Austria", "Turkey", };
    }


