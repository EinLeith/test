import java.util.Scanner;
import java.util.Random;
import java.util.regex.*;




public class simgame {
    public static void main(String[] args) {
        System.out.println("Your Career");

        System.out.println("Please choose a Position: Goalkeeper, Defender, Midfielder, Winger, Striker");
        System.out.println(" ");

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String input = sc.nextLine();


        Pattern gk = Pattern.compile("(Goalkeeper|goalkeeper|GK|gk)");
        Pattern defender = Pattern.compile("(Defender|defender)");
        Pattern mid = Pattern.compile("(Midfielder|midfielder)");
        Pattern forward = Pattern.compile("(Winger|winger)");
        Pattern striker = Pattern.compile("(Striker|striker)");

        Matcher gkMatch = gk.matcher(input);
        Matcher defenderMatch = defender.matcher(input);
        Matcher midMatch = mid.matcher(input);
        Matcher forwardMatch = forward.matcher(input);
        Matcher strikerMatch = striker.matcher(input);


        if (gkMatch.find()) {
            System.out.println("You are a Goalkeeper");
        } else if (defenderMatch.find()) {
            System.out.println("You are a Defender");
        } else if (midMatch.find()) {
            System.out.println("You are a Midfielder");
        } else if (forwardMatch.find()) {
            System.out.println("You are a Winger");
        } else if (strikerMatch.find()) {
            System.out.println("You are a Striker");
        } else {
            System.out.println("Invalid Input");
        }

        String[] footballAcademyTeams = {
                // German Football Academy Teams
                "Bayern München U19",
                "Borussia Dortmund U19",
                "Schalke 04 U19",
                "Bayer 04 Leverkusen U19",
                "Hamburger SV U19",
                "Borussia Mönchengladbach U19",
                "VfB Stuttgart U19",
                "RB Leipzig U19",
                "Eintracht Frankfurt U19",
                "Werder Bremen U19",

                // English Football Academy Teams
                "Manchester United Academy",
                "Chelsea FC Academy",
                "Liverpool FC Academy",
                "Arsenal FC Academy",
                "Manchester City Academy",
                "Southampton FC Academy",
                "Tottenham Hotspur Academy",
                "Everton FC Academy",
                "West Ham United Academy",
                "Aston Villa Academy",

                // Dutch Football Academy Teams
                "Ajax Amsterdam Youth Academy",
                "PSV Eindhoven Youth Academy",
                "Feyenoord Rotterdam Youth Academy",
                "AZ Alkmaar Youth Academy",
                "FC Utrecht Youth Academy",
                "Vitesse Arnhem Youth Academy",
                "FC Twente Youth Academy",
                "SC Heerenveen Youth Academy",
                "NAC Breda Youth Academy",
                "NEC Nijmegen Youth Academy",

                // Spanish Football Academy Teams
                "La Masia (FC Barcelona)",
                "Real Madrid Youth Academy (La Fábrica)",
                "Atlético Madrid Academy",
                "Sevilla FC Academy",
                "Valencia CF Academy",
                "Real Sociedad Academy",
                "Villarreal CF Academy",
                "Getafe International Madrid Football Academy"
        };
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You have been scouted by: " + footballAcademyTeams[rand.nextInt(footballAcademyTeams.length)]);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You scored" + " " + rand.nextInt(70) + " " + "goals this Season");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("You provided " + " " + rand.nextInt(50) + " " + "assists this Season");

        System.out.println("---------------------------------");

        "You have received an offer from: " + footballAcademyTeams[rand.nextInt(footballAcademyTeams.length)] + " " + "to join their Academy";


    }
}
