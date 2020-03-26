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
        String[] subLines;
        try {
            File file = new java.io.File(cave);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            while ((line = reader.readLine()) != null) {
                subLines = line.split(";", 2);
                treasures.add(new Treasure(subLines[0], Double.parseDouble(subLines[1])));
            }
            reader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void viewTreasures() {
        for (Treasure treasure : this.treasures) {
            System.out.println(treasure);
        }
    }


    public Treasure getMostExpensiveTreasure() {
        return Collections.max(this.treasures);
    }

    public void viewTreasuresBySum(double sum) {
        List<Treasure> selectedTreasures = new ArrayList<Treasure>();
        for (Treasure treasure : this.treasures) {
            if (treasure.getCost() <= sum)
                selectedTreasures.add(treasure);
        }
        viewSelectedTreasure(selectedTreasures);
    }

    private void viewSelectedTreasure(List<Treasure> treasures) {
        for (Treasure treasure : treasures) {
            System.out.println(treasure);
        }
    }
}
