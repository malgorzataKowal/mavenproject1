
package model;

public class Pacjenci {
    
    private String name;
    private String surname;
   
    
    public Pacjenci(){}
    public Pacjenci(String name, String surname) {
        this.name = name;
       this.surname = surname;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Pacjenci{" + "name=" + name + ", surname=" + surname + '}';
    }
    
}
