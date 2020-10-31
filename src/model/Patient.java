package model;

public abstract class Patient {

    //Attributes

    private String name;
    private String lastName;
    private int age;
    private String identification;

    //Relationship

    private VaccinationRegister appliedDoses;

     //constructor

    public Patient(String name, String lastName, int age, String identification) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.identification = identification;
    }

    //Getter and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public VaccinationRegister getAppliedDoses() {
        return appliedDoses;
    }

    public void setAppliedDoses(VaccinationRegister appliedDoses) {
        this.appliedDoses = appliedDoses;
    }
   
  public String getInfo(){
      String message = "";
      message = "Nombre del paciente: "+name+"\n"+
                "Apellido del paciente: "+lastName+"\n"+
                "Identificación del paciente: "+identification+"\n";

                return message;
  }

}
