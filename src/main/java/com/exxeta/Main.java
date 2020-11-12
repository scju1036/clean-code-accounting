package com.exxeta;


import com.exxeta.domain.*;
import com.exxeta.ui.UserInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {
//        Consumer<String> fileNameConsumer = fileName -> {
//            LOCStat locStat = FileAnalyser.analyseFile(fileName);
//            total.incrementLinesOfCode(locStat.getLinesOfCode());
//            total.incrementLines(locStat.getTotalLines());
//            UserInterface.printLocCount(locStat);
//        };
        Consumer<String> fileNameConsumer = new FilenameConsumer();
        LOCStart.start(args, fileNameConsumer);
    }

    public static class FilenameConsumer implements Consumer<String> {
        long lines = 0;
        long linesOfCode = 0;

        @Override
        public void accept(String s) {
            if(s == null){
                UserInterface.printFinal(lines,linesOfCode);
            }else{
                LOCStat locStat = FileAnalyser.analyseFile(s);
                linesOfCode += locStat.getLinesOfCode();
                lines += locStat.getTotalLines();
                UserInterface.printLocCount(locStat);
            }
        }
    }
}
