package model;

public class Vaccination {
    
    //Relationship

    private String diseasePrevent;
    private String laboratoryProduce;
    private int numberDose;
 
    //Constructor

    public Vaccination(String diseasePrevent, String laboratoryProduce, int numberDose) {
        this.diseasePrevent = diseasePrevent;
        this.laboratoryProduce = laboratoryProduce;
        this.numberDose = numberDose;
    }

    //Getters and Setters

    public String getDiseasePrevent() {
        return diseasePrevent;
    }

    public void setDiseasePrevent(String diseasePrevent) {
        this.diseasePrevent = diseasePrevent;
    }

    public String getLaboratoryProduce() {
        return laboratoryProduce;
    }

    public void setLaboratoryProduce(String laboratoryProduce) {
        this.laboratoryProduce = laboratoryProduce;
    }

    public int getNumberDose() {
        return numberDose;
    }

    public void setNumberDose(int numberDose) {
        this.numberDose = numberDose;
    }

}
