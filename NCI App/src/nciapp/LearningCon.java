/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author x12488942
 */
public class LearningCon extends ContactInfo {
    LearningCon(){
        super();
        name = "Michael Goldrick";
        number = "(01) 6599 245";
        email = "michael.goldrick@ncirl.ie";    
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
