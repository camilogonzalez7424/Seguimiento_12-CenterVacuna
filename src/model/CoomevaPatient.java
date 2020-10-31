package model;

public class CoomevaPatient extends PrepaidMedicine{

    //Relationship

    private CoomevaCategories category;

    //Constructor

    public CoomevaPatient(String name, String lastName, int age, String identification, String membershipNumber,String category){
        super(name, lastName, age, identification, membershipNumber);
        this.category = CoomevaCategories.valueOf(category);
    }

    //Getters and Setters

    public CoomevaCategories getCategory() {
        return category;
    }

    public void setCategory(CoomevaCategories category) {
        this.category = category;
    }

    @Override
    public String getInfo(){
    String message = "";
     message =   "\n"+"***** Tipo de paciente Prepagado Coomeva: *****"+"\n"+
                "Nombre del paciente: " + getName() +"\n"+
                "Apellido del paciente: "+getLastName()+"\n"+
                "Edad del paciente: "+getAge()+"\n"+
                "Identificación  paciente: "+getIdentification()+"\n"+
                "Número de socio: "+ getMembershipNumber() +"\n"+
                "Categoria: "+ category+"\n"+
                "**********          Paciente          ***********"+"\n";

    return message;

    }    

    
}
