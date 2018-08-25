package com.bespokesoftbd.eliaskhan.fifa2018;

public class WorldCupDetails {
    private int leftFlag1;
    private int rightFlag1;
    private String worldCupYear;
    private String vs;
    private String winnerTeam;
    public int getFlagLeft() {
        return leftFlag1;
    }

    public int getFlagRight() {
        return rightFlag1;
    }

    public String getWorldCupYear() {
        return worldCupYear;
    }

    public String getVs() {
        return vs;
    }

    public String getWinnerTeam() {
        return winnerTeam;
    }


    public WorldCupDetails(int leftFlag1, int rightFlag1, String worldCupYear, String vs, String winnerTeam) {
        this.leftFlag1 = leftFlag1;
        this.rightFlag1 = rightFlag1;
        this.worldCupYear = worldCupYear;
        this.vs = vs;
        this.winnerTeam = winnerTeam;
    }
}
