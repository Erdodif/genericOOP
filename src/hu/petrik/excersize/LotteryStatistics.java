package hu.petrik.excersize;

import hu.petrik.set.Set;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public final class LotteryStatistics {
    private static Set<Integer> history;

    public static void Run(){
        LotteryStatistics.history = new Set<>();
        try {
            BufferedReader file = new BufferedReader(new FileReader("lottosz.dat"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //TODO befelyezni
    }
}
