package model;

public class SuraPatient extends PrepaidMedicine{

    //Attributes 

    private int minimunValue;
    private int maximumValue;
    
    //Constructor

    public SuraPatient(String name, String lastName, int age, String identification, String membershipNumber,int minimunValue,int maximumValue){
        super(name, lastName, age, identification, membershipNumber);
        this.minimunValue = minimunValue;
        this.maximumValue = maximumValue;
    }


    @Override
    public String getInfo(){
    String message = "";
     message =   "\n"+"***** Tipo de paciente Prepagado Sura: *****"+"\n"+
                "Nombre del paciente: " + getName() +"\n"+
                "Apellido del paciente: "+getLastName()+"\n"+
                "Edad del paciente: "+getAge()+"\n"+
                "Identificación  paciente: "+getIdentification()+"\n"+
                "Número de socio: "+ getMembershipNumber() +"\n"+
                "Rango minimo : "+ minimunValue +"\n"+
                "Rango maximo: "+ maximumValue+"\n"+
                "**********          Paciente          ***********"+"\n";

    return message;

    }    
}
