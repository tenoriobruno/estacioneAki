package models;
 
import java.util.*;

import javax.persistence.*;

import play.db.jpa.*;
import play.data.validation.*;
 
@Entity
public class User extends Model {
 
    @Required
    public String email;
    
    @Required
    @Password
    public String password;
    
    public String fullname;
    
    public String userType;
    
    public String cpfcnpj;
    
    public User(String email, String password, String fullname) {
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }
    
    public static User connect(String email, String password) {
        return find("byEmailAndPassword", email, password).first();
    }
    
    public String toString() {
        return email;
    }
 
}