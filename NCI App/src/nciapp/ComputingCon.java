/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;

/**
 *
 * @author x12488942
 */
public class ComputingCon extends ContactInfo {
    ComputingCon(){
        super();
        name = "Frances Sheridan";
        number = "(01) 6599 260";
        email = "computingsupport@ncirl.ie";     
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
