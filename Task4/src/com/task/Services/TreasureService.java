package com.task.Services;

import com.task.Treasure;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreasureService {
    private List<Treasure> treasures = new ArrayList<Treasure>();

    public TreasureService() {
        final String cave = "H:\\treasures.txt";
        String line;
        String[] subLine;
        try {
            File file = new java.io.File(cave);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((line = reader.readLine()) != null) {
                subLine = line.split(";", 2);
                treasures.add(new Treasure(subLine[0], Double.parseDouble(subLine[1])));
            }
            reader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewTreasure() {
        for (Treasure treasure : this.treasures) {
            System.out.println(treasure);
        }
    }

    public void viewTreasure(List<Treasure> treasures) {
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }

    public Treasure getMostExpensiveTreasure() {
        return Collections.max(this.treasures);
    }

    public List<Treasure> getTreasuresBySum(double sum) {
        List<Treasure> selectedTreasures = new ArrayList<Treasure>();
        for (Treasure treasure : this.treasures) {
            if (treasure.getCostTreasure() <= sum)
                selectedTreasures.add(treasure);
        }
        return selectedTreasures;
    }
}
