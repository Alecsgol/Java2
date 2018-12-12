package ru.goluzov.se.competitors;

public class Team {

    private String teamName;
    private Competitor[] competitors;

    public Team(String teamName, Competitor... competitors) {
        this.teamName = teamName;
        this.competitors = competitors;
    }

    public Competitor[] getCompetitors() {
        return competitors;
    }

    public void showResults() {
        System.out.printf("%s info:\n", teamName);
        for (Competitor competitor : competitors) {
            competitor.result();
        }
    }

    public void positiveInfo() {
        System.out.printf("%s positive info:\n", teamName);
        for (Competitor competitor : competitors) {
            if (competitor.isOnDistance()) competitor.result();
        }
    }
}