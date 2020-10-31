package model;

public class EpsPatient extends Patient{

    //Attributes 

    private String epsName;
    private double orderNumber;

    //Constructor

    public EpsPatient(String name, String lastName, int age, String identification,String epsName,double orderNumber){
        super(name,lastName,age,identification);
        this.epsName = epsName;
        this.orderNumber = orderNumber;

    }

    //Getters and Setters
    
    public String getEpsName() {
        return epsName;
    }

    public void setEpsName(String epsName) {
        this.epsName = epsName;
    }

    public double getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(double orderNumber) {
        this.orderNumber = orderNumber;
    }

    @Override
    public String getInfo(){
    String message = "";
     message =   "\n"+"***** Tipo de paciente EPS: *****"+"\n"+
                "Nombre del paciente: " + getName() +"\n"+
                "Apellido del paciente: "+getLastName()+"\n"+
                "Edad del paciente: "+getAge()+"\n"+
                "Identificación  paciente: "+getIdentification()+"\n"+
                "Nombre de la EPS: "+epsName+"\n"+
                "Número de orden: "+orderNumber+"\n"+
                "**********          Paciente          ***********"+"\n";

    return message;

    }    
    
}
