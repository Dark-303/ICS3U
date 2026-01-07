package day2;

public class Scoreboard {
    private String team1;
    private String team2;

    private int team1Score;
    private int team2Score;
    private boolean team1Active;

    public Scoreboard(String team1, String team2) {
        this.team1 = team1;
        this.team2 = team2;
        team1Score = 0;
        team2Score = 0;
        team1Active = true;
    }

    public String toString() {
        return team1Score + " - " + team2Score + " - " + (team1Active ? team1:team2);
    }

    public void recordPlay(int points) {
        if (team1Active && points != 0) team1Score++;
        else team2Score++;
        if (points == 0) team1Active = !team1Active;
    }

    public void getScore() {
        System.out.println(this.toString());
    }
}
