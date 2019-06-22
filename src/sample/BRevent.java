package sample;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class BRevent {

    String title, frequency, chair, location, purpose;
    LocalTime time;
    ArrayList<String> members, inputs, outputs, agenda;

    public BRevent(String title,
                   String time,
                   String frequency,
                   String location,
                   String purpose,
                   String chair,
                   ArrayList<String> members,
                   ArrayList<String> inputs,
                   ArrayList<String> outputs,
                   ArrayList<String> agenda){
        this.title = title;
        this.time = LocalTime.of(Integer.parseInt(time.substring(0, time.length()-2)),
                Integer.parseInt(time.substring(time.length()-2,time.length())));
        this.frequency = frequency;
        this.location = location;
        this. purpose = purpose;
        this.chair = chair;
        this.members = members;
        this.inputs = inputs;
        this.outputs = outputs;
        this.agenda = agenda;

    }

    public String toString(){
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm");
        String strTime = this.time.format(timeFormat);

        String membersString = "";
        for (String s : this.members) {
            membersString += s + "\t";
        }

        String inputsString = "";
        for (String s : this.inputs) {
            inputsString += s + "\t";
        }

        String outputsString = "";
        for (String s : this.outputs) {
            outputsString += s + "\t";
        }

        String agendaString = "";
        for (String s : this.agenda) {
            agendaString += s + "\t";
        }

        return String.format("%s \n" +
                        "Time:      %s\n" +
                        "Frequency: %s\n" +
                        "Location:  %s\n" +
                        "Purpose:   %s\n" +
                        "Chair:     %s\n" +
                        "Members:   %s\n" +
                        "Inputs:    %s\n" +
                        "Outputs:   %s\n" +
                        "Agenda:    %s\n",
                this.title, strTime, this.frequency, this.location, this.purpose, this.chair, membersString, inputsString, outputsString, agendaString);
    }

}
