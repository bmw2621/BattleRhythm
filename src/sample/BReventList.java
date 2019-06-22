package sample;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BReventList implements Serializable {

    Map<String, BRevent> events = new HashMap<String, BRevent>();

    public BReventList loadData(String filename){

        BReventList object1 = null;

        try {
            // Reading the object from a file
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);

            // Method for deserialization of object
            object1 = (BReventList) in.readObject();

            in.close();
            file.close();
        } catch(Exception e){
            System.out.println("Oops, there was a problem loading data...");
            System.out.println(e);
        }

        return object1;
        }

    public void saveData(String filename){
        try {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(this);

            out.close();
            file.close();

            System.out.println("Event List was saved");
        } catch(IOException e){
            System.out.println("Failed as a result of IOException.");
            System.out.println(e);
        }
    }

    public void add(BRevent newEvent){
        events.put(newEvent.title, newEvent);
    }

    public void remove(String title){
        events.remove(title);
    }

    public ArrayList<String> getEvents(){
        ArrayList<String> titles = new ArrayList<String>();
        for(String key : events.keySet()){
            titles.add(key);
        }
        return titles;
    }



}