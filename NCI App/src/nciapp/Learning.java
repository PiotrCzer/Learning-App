/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author Robbie
 */
public class Learning {
    private String subject, name, studentnum;
    private int count;
    
    public Learning(){
   
        subject = new String();
        name = new String();
        studentnum = new String();
        count = 0;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setStudentnum(String studentnum) {
        this.studentnum = studentnum;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getSubject() {
        return subject;
    }

    public String getName() {
        return name;
    }

    public String getStudentnum() {
        return studentnum;
    }

    public int getCount() {
        return count;
    }

    
    
    
}
