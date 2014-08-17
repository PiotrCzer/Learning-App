/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author x12488942
 */
public class MathCon extends ContactInfo{
    MathCon(){
        super();
        name = "Jonathan Lambert";
        number = "(01) 4498 650";
        email = "jonathan.lambert@ncirl.ie";    
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
