package model;

public class VaccinationRegister {
    
    //Attributes

    private int lot;
    private String openDateOfLot;
    private String closeDateOfLot;
    private String vaccineInformation;

    //Constructor

    public VaccinationRegister(int lot, String openDateOfLot, String closeDateOfLot, String vaccineInformation){
        this.lot = lot;
        this.openDateOfLot = openDateOfLot;
        this.closeDateOfLot = closeDateOfLot;
        this.vaccineInformation = vaccineInformation;

    }

    //Getters and Setters
    
    public int getLot() {
        return lot;
    }

    public void setLot(int lot) {
        this.lot = lot;
    }

    public String getOpenDateOfLot() {
        return openDateOfLot;
    }

    public void setOpenDateOfLot(String openDateOfLot) {
        this.openDateOfLot = openDateOfLot;
    }

    public String getCloseDateOfLot() {
        return closeDateOfLot;
    }

    public void setCloseDateOfLot(String closeDateOfLot) {
        this.closeDateOfLot = closeDateOfLot;
    }

    public String getVaccineInformation() {
        return vaccineInformation;
    }

    public void setVaccineInformation(String vaccineInformation) {
        this.vaccineInformation = vaccineInformation;
    }

}
