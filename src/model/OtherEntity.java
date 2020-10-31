package model;

public class OtherEntity extends PrepaidMedicine{

    //Attributes

    private String entityName;
    private String entityPhone;

    //Constructor

    public OtherEntity(String name, String lastName, int age, String identification, String membershipNumber,String entityName, String entityPhone){
        super(name, lastName, age, identification, membershipNumber);
        this.entityName = entityName;
        this.entityPhone = entityPhone;

    }

    //Getters and Setters
    
    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getEntityPhone() {
        return entityPhone;
    }

    public void setEntityPhone(String entityPhone) {
        this.entityPhone = entityPhone;
    }

    @Override
    public String getInfo(){
    String message = "";
     message =   "\n"+"***** Tipo de paciente Prepagado Otra Entidad: *****"+"\n"+
                "Nombre del paciente: " + getName() +"\n"+
                "Apellido del paciente: "+getLastName()+"\n"+
                "Edad del paciente: "+getAge()+"\n"+
                "Identificación  paciente: "+getIdentification()+"\n"+
                "Número de socio: "+ getMembershipNumber() +"\n"+
                "Nombre de la entidad: "+ entityName +"\n"+
                "Número de contacto de la entidad: "+ entityPhone +"\n"+
                "**********          Paciente          ***********"+"\n";

    return message;

    }    

    
    
}
