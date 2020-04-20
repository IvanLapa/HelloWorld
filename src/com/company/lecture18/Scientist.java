package com.company.lecture18;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
public class Scientist extends Thread {
    Dump dump;
    private Map<PartOfRobot, Integer> map_ScientistDetails = new HashMap<>();

    Scientist(Dump dump) {
        map_ScientistDetails.put(PartOfRobot.HEAD, 0);
        map_ScientistDetails.put(PartOfRobot.BODY, 0);
        map_ScientistDetails.put(PartOfRobot.LEFT_HAND, 0);
        map_ScientistDetails.put(PartOfRobot.RIGHT_HAND, 0);
        map_ScientistDetails.put(PartOfRobot.LEFT_FOOT, 0);
        map_ScientistDetails.put(PartOfRobot.RIGHT_FOOT, 0);
        map_ScientistDetails.put(PartOfRobot.CPU, 0);
        map_ScientistDetails.put(PartOfRobot.RAM, 0);
        map_ScientistDetails.put(PartOfRobot.HDD, 0);
        this.dump = dump;
    }

    public void addScientistDetails(PartOfRobot detail) {
        map_ScientistDetails.put(detail, map_ScientistDetails.get(detail) + 1);
    }

    public Map<PartOfRobot, Integer> getMap_ScientistDetails() {
        return map_ScientistDetails;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) dump.getDumpDetails(i, this);
        System.out.println("Scientist details: " + getMap_ScientistDetails() + "\n" + "We have " + countOfRobots() + " robots");
    }

    private int countOfRobots() {
        return map_ScientistDetails.values().stream()
                .mapToInt(i -> i)
                .min()
                .orElseThrow(NoSuchElementException::new);
    }

}
