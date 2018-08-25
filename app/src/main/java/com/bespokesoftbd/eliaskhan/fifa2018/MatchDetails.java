package com.bespokesoftbd.eliaskhan.fifa2018;

public class MatchDetails {
    private int leftFlag;
    private  int RightFlag;
    private String vs;
    private  String matchDate;
    private  String bdTime;
    private String indianTime;
    private String vanue;
    private String group;


    public int getLeftFlag() {
        return leftFlag;
    }

    public int getRightFlag() {
        return RightFlag;
    }

    public String getVs() {
        return vs;
    }

    public String getMatchDate() {
        return matchDate;
    }

    public String getBdTime() {
        return bdTime;
    }

    public String getIndianTime() {
        return indianTime;
    }

    public String getVanue() {
        return vanue;
    }

    public String getGroup() {
        return group;
    }

    public MatchDetails(int leftFlag, int rightFlag, String vs, String matchDate, String bdTime, String indianTime, String vanue, String group) {
        this.leftFlag = leftFlag;
        RightFlag = rightFlag;
        this.vs = vs;
        this.matchDate = matchDate;
        this.bdTime = bdTime;
        this.indianTime = indianTime;
        this.vanue = vanue;
        this.group = group;
    }
}
