package com.company.lecture16;

import java.io.*;

public class Mission2 {
    public static void main(String[] args) {
    Computer computer1 = new Computer(1,"Apple");
    Computer computer2 = new Computer(2, "Asus");
    Computer computer3 = new Computer (3, "AOC");

    try {
        FileOutputStream fos = new FileOutputStream("for_lecture16_2_can_delete.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(computer1);
        oos.writeObject(computer2);
        oos.writeObject(computer3);
        fos.close();
    } catch (IOException e){
        e.printStackTrace();
    }
    try {
            FileInputStream fis = new FileInputStream("for_lecture16_2_can_delete.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Computer computer1input = (Computer) ois.readObject();
            Computer computer2input = (Computer) ois.readObject();
            Computer computer3input = (Computer) ois.readObject();
            fis.close();
        System.out.println(computer1input);
        System.out.println(computer2input);
        System.out.println(computer3input);
        System.out.println();
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
class Computer implements Serializable{
    private int id;
    private String model;

    public Computer(int id, String model) {
        this.id = id;
        this.model = model;
    }
    public int getId (){
        return id;
    }
    public String getModel (){
        return model;
    }
    public String toString(){
        return id+" : "+model;
    }
}
