package com.companyJD1.lecture16_serialization;

import java.io.*;

/**Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad
 * - также созданного класса со своими полями.
 * Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
 * Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
 */

public class Mission3 {
    public static void main(String[] args) {
        NoteBook noteBook1 = new NoteBook(1, "Apple","2019");
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16_3.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(noteBook1);
            fos.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Иван\\IdeaProjects\\HelloWorld\\src\\com\\companyJD1\\lecture16_serialization\\resources\\for_lecture16_3.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            NoteBook noteBookInput = (NoteBook) ois.readObject();
            fis.close();
            System.out.println(noteBookInput);
        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
class NoteBook extends Computer implements Serializable {
    private String production_year;
    private Touchpad touchpad;

    public NoteBook(int id, String model, String production_year) {
            super(id, model);
            this.production_year = production_year;
            this.touchpad = touchpad;
    }

    public String toString(){
        return production_year + " : " + touchpad;
    }
}

class Touchpad implements Serializable{
    private int screen_size;
    private boolean touch_screen;
    private transient int price;

    public Touchpad(int screen_size, boolean touch_screen){
        this.screen_size=screen_size;
        this.touch_screen=touch_screen;
    }
}

