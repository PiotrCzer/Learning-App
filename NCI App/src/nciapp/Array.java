/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author Conor / Sean 
 */
public class Array {
    //conor
    private String day;    
    private int hour;
    private int min;
    private String ampm;
    private String details;    
    
    //sean
    private String subjectText;
    private String noteText;
    
    public Array(){
       
        //conor
        day = new String();        
        details = new String();
        //sean
        subjectText = " ";
        noteText = " ";
    }
         //conor
    public void setDay(String day) {
        this.day = day;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setAmpm(String ampm) {
        this.ampm = ampm;
    }
   

    public int getHour() {
        return hour;
    }

    public int getMin() {
        return min;
    }

    public String getAmpm() {
        return ampm;
    }

    public String getDay() {
        return day;
    }


    public String getDetails() {
        return details;
    }
       
    
    //sean
    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;
    }

    public String getSubjectText() {
        return subjectText;
    }

    public void setSubjectText(String subjectText) {
        this.subjectText = subjectText;
    }
   
}