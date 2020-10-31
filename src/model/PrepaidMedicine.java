package model;

public abstract class PrepaidMedicine extends Patient{

    //Attributes

    private String membershipNumber;

    //Constructor 

    public PrepaidMedicine(String name, String lastName, int age, String identification, String membershipNumber){
        super(name,lastName,age,identification);
        this.membershipNumber = membershipNumber;
    }

    //Getters and Setters
    
    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }
    
    
}
