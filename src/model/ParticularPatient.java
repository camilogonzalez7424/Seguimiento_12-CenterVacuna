package model;

public class ParticularPatient extends Patient{

    //Attributes 

    private String contactPhone;

    //Relationship

    private Doctor personalDoctor;

    //Constructor

    public ParticularPatient(String name, String lastName, int age, String identification, String contactPhone,Doctor personalDoctor){
        super(name,lastName,age,identification);
        this.contactPhone = contactPhone;
        this.personalDoctor = personalDoctor;

    }

    //Getters and Setters

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public Doctor getPersonalDoctor() {
        return personalDoctor;
    }

    public void setPersonalDoctor(Doctor personalDoctor) {
        this.personalDoctor = personalDoctor;
    }

    @Override
    public String getInfo(){
    String message = "";
     message =   "\n"+"***** Tipo de paciente particular: *****"+"\n"+
                "Nombre del paciente: " + getName() +"\n"+
                "Apellido del paciente: "+getLastName()+"\n"+
                "Edad del paciente: "+getAge()+"\n"+
                "Identificación  paciente: "+getIdentification()+"\n"+
                "Telefono del paciente: " +contactPhone+"\n"+
                "Nombre del doctor(a): "+ personalDoctor.ToString();

    return message;

    }

}
