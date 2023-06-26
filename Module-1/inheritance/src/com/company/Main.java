package com.company;

import com.company.inheritance.*;

public class Main {
    public static void main(String[] args) {
        Developer praveet = new Developer();
        TeamLead roman = new TeamLead();
        Architect susan = new Architect();

        praveet.estimateStoryPoints();
        roman.estimateStoryPoints();
        susan.estimateStoryPoints();
    }
}
