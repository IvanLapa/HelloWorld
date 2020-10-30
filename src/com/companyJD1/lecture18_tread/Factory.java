package com.companyJD1.lecture18_tread;

import java.util.HashMap;
import java.util.Map;

public class Factory extends Thread{
    public Map<Integer, PartOfRobot> map_Factory = new HashMap<>();
    Dump dump;
    Factory(Dump dump) {
        map_Factory.put(1, PartOfRobot.HEAD);
        map_Factory.put(2, PartOfRobot.BODY);
        map_Factory.put(3, PartOfRobot.LEFT_HAND);
        map_Factory.put(4, PartOfRobot.RIGHT_HAND);
        map_Factory.put(5, PartOfRobot.LEFT_FOOT);
        map_Factory.put(6, PartOfRobot.RIGHT_FOOT);
        map_Factory.put(7, PartOfRobot.CPU);
        map_Factory.put(8, PartOfRobot.RAM);
        map_Factory.put(9, PartOfRobot.HDD);

        this.dump = dump;
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            generation_part(i, dump);
        }
    }

    public void generation_part (int numberOfNight, Dump dump) {
        numberOfNight++;
        dump.putDumpDetails(map_Factory, numberOfNight);
        try {
            Thread.sleep(150);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}

