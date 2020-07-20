package com.companyJD1.lecture18;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Dump {
    private static Map<PartOfRobot, Integer> map_Dump = new HashMap<>();
    private static Map<Integer, PartOfRobot> mapToGet_Dump = new HashMap<>();
    private boolean available = false;
    Random random = new Random();

    Dump() {
        map_Dump.put(PartOfRobot.HEAD, 0);
        map_Dump.put(PartOfRobot.BODY, 0);
        map_Dump.put(PartOfRobot.LEFT_HAND, 0);
        map_Dump.put(PartOfRobot.RIGHT_HAND, 0);
        map_Dump.put(PartOfRobot.LEFT_FOOT, 0);
        map_Dump.put(PartOfRobot.RIGHT_FOOT, 0);
        map_Dump.put(PartOfRobot.CPU, 0);
        map_Dump.put(PartOfRobot.RAM, 0);
        map_Dump.put(PartOfRobot.HDD, 0);

        mapToGet_Dump.put(1, PartOfRobot.HEAD);
        mapToGet_Dump.put(2, PartOfRobot.BODY);
        mapToGet_Dump.put(3, PartOfRobot.LEFT_HAND);
        mapToGet_Dump.put(4, PartOfRobot.RIGHT_HAND);
        mapToGet_Dump.put(5, PartOfRobot.LEFT_FOOT);
        mapToGet_Dump.put(6, PartOfRobot.RIGHT_FOOT);
        mapToGet_Dump.put(7, PartOfRobot.CPU);
        mapToGet_Dump.put(8, PartOfRobot.RAM);
        mapToGet_Dump.put(9, PartOfRobot.HDD);
    }


    public synchronized void getDumpDetails(int nightNumber, Scientist scientist) {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        nightNumber++;
        int ServantGetDetails = random.nextInt(4) + 1;
        System.out.println("[Servant get [" + ServantGetDetails + "] details night number " + nightNumber + " ]");


        for (int i = 0; i < ServantGetDetails; i++) {
            int key = random.nextInt(9) + 1;
            if (map_Dump.get(mapToGet_Dump.get(key)) != 0) {
                scientist.addScientistDetails(mapToGet_Dump.get(key));
            } else i--;

        }


        available = false;
        notifyAll();
    }

    public synchronized void putDumpDetails(Map<Integer, PartOfRobot> map_Factory, int nightNumber) {

        while (available) {
            try {
                wait();
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        int rand = random.nextInt(4) + 1;

        if (nightNumber == 1) {
            System.out.println("[Factory throw [20] details,night number " + nightNumber + " ]");

            for (int i = 0; i < 20; i++) {
                map_Dump.put(map_Factory.get(random.nextInt(9) + 1), map_Dump.get(map_Factory.get(random.nextInt(9) + 1)) + 1);

            }
        } else {
            System.out.println("[Factory throw [" + rand + "] details,night number " + nightNumber + " ]");

            for (int i = 0; i < rand; i++) {
                map_Dump.put(map_Factory.get(random.nextInt(9) + 1), map_Dump.get(map_Factory.get(random.nextInt(9) + 1)) + 1);

            }
        }

        available = true;
        notifyAll();
    }

    public Map<PartOfRobot, Integer> getMap_Dump() {
        return map_Dump;
    }
}

