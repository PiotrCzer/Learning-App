/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package nciapp;

/**
 *
 * @author Piotr Cz.
 */
public class contactArray {
    private String email, type, message;


    public contactArray(){
        email = new String();
        type = new String();
        message = new String();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}