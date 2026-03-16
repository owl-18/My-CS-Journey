
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team: ");
        String team = scan.nextLine();

        ArrayList<Match> matches = new ArrayList<>();
        try (Scanner readFile = new Scanner(Paths.get(fileName))) {
            while (readFile.hasNextLine()) {
                String line = readFile.nextLine();
                String[] splitComma = line.split(",");
                String team1 = splitComma[0];
                String team2 = splitComma[1];
                int scoreTeam1 = Integer.valueOf(splitComma[2]);
                int scoreTeam2 = Integer.valueOf(splitComma[3]);

                matches.add(new Match(team1, team2, scoreTeam1, scoreTeam2));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int countGame = 0, countGameWin = 0;
        boolean isTeam1 = false;
        for (Match m : matches) {
            if (m.getTeam1().equals(team) || m.getTeam2().equals(team)) {
                ++countGame;
                if (m.isTeam1Win()) {
                    ++countGameWin;
                    isTeam1 = true;
                }
            }
        }

        System.out.println("Games: " + countGame);
        if (countGame == 1) {
            if (isTeam1) {
                System.out.println("Wins: " + countGameWin);
                int losses = countGame - countGameWin;
                System.out.println("Losses: " + losses);
            } else {
                int losses = countGame - countGameWin;
                System.out.println("Wins: " + losses);
                System.out.println("Losses: " + countGameWin);
            }
        } else {
            System.out.println("Wins: " + countGameWin);
            int losses = countGame - countGameWin;
            System.out.println("Losses: " + losses);
        }
    }

}
