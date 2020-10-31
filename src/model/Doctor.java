package model;

public class Doctor {

    //Attributes

    private String doctorName;
    private String phone;
    private String licenseNumber;

    //Constructor

    public Doctor(String doctorName, String phone, String licenseNumber){
        this.doctorName = doctorName;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
    }

    //Getters and Setters

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String ToString(){
        String out = "Información de doctor(a)"+"\n"+
                    "Nombre del doctor(a): "+doctorName+"\n"+
                    "Número de contacto del doctor(a): "+phone+"\n"+
                    "Número de licencia del doctor(a): "+licenseNumber+"\n"+
                    "**********          Paciente          **********"+"\n";

        return out;
    }

    
    
}
