package com.exxeta.ui;

import com.exxeta.domain.LOCStat;

import java.util.List;

public class UserInterface {

    public static void printLocCount(LOCStat locStat) {
//        long total = 0;
//        long linesOfCode = 0;

//        for (LOCStat locStat : locStats) {
        System.out.println(locStat.getFileName() + " " + locStat.getTotalLines() + " " + locStat.getLinesOfCode());
//            total += locStat.getTotalLines();
//            linesOfCode += locStat.getLinesOfCode();
//        }

//        System.out.println("Total:");
//        System.out.println("\tLines: " + total);
//        System.out.println("\tLOC:   " + linesOfCode);
    }

    public static void printFinal(long lines, long linesOfCode) {
        System.out.println("Total:");
        System.out.println("\tLines: " + lines);
        System.out.println("\tLOC:   " + linesOfCode);
    }
}
