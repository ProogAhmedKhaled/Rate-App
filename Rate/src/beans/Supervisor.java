/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author pc
 */
public class Supervisor {
    
    int id ;
    String fName , lName , email , type;

    public Supervisor() {
    }

    public Supervisor(int id, String fName, String lName, String email, String type) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.email = email;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
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

    @Override
    public String toString() {
        return "Supervisor: " + " id: " + id + " Name : " + fName +" "+ lName 
                + " Email : " + email + " Type: " + type ;
    }
    
    
    
    
    
    
}
