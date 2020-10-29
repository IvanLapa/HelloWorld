package com.companyJD1.lecture16_serialization;

import java.io.*;

/**Создать класс Computer. Добавить ему несколько полей,
 * создать объект этого класса, сериализовать в файл.
 * Десериализовать объект из того же файла, вывести значения полей в консоль.
 */
public class Mission2 {
    public static void main(String[] args) {
    Computer computer1 = new Computer(1,"Apple");
    Computer computer2 = new Computer(2, "Asus");
    Computer computer3 = new Computer (3, "AOC");

    try {
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16_2.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(computer1);
        oos.writeObject(computer2);
        oos.writeObject(computer3);
        fos.close();
    } catch (IOException e){
        e.printStackTrace();
    }
    try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16_2.txt");
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
    @Override
    public String toString() {
        return "ID: " + this.id + ". model: " + this.model + ".";
    }
}
