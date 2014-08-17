/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nciapp;


/**
 *
 * @author x12488942
 */
public class DisabilityCon extends ContactInfo{
    
     DisabilityCon() {
            super();
            name = "Karen Mooney";
            number = "(01) 4498 269";
            email = "karen.mooney@ncirl.ie";
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
