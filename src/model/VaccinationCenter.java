package model;

public class VaccinationCenter {

    public final static int PATIENTSIZE = 300;
    public final static int VACCINATIONSIZE = 30; 
    private int numPatient; 

    //Relationship

    private Patient[] patient;
    private Vaccination[] diferentVaccination;

    //Constructor

    public VaccinationCenter(){
        patient = new Patient[PATIENTSIZE];
        diferentVaccination = new Vaccination[VACCINATIONSIZE];
        numPatient  = 0;
    }
    
    public boolean hasPatient() {
        return numPatient < PATIENTSIZE;
    }

    //Sobre carga de metodos; aunque tienen el mismo nombre se diferencian por el tipo y la cantidad de parametros recibidos.

    public void createPatient(String name, String lastName, int age, String identification, String contactPhone,String doctorName, String phone, String licenseNumber){
        Doctor personalDoctor = new Doctor(doctorName, phone, licenseNumber);
        boolean space = false;
        for(int i=0; i<PATIENTSIZE && !space; i++){
            if(patient[i] == null){
                patient[i] = new ParticularPatient(name,lastName,age,identification,contactPhone,personalDoctor);
                space = true;
                numPatient++;
        
            }

        }
    }

    public void createPatient(String name, String lastName, int age, String identification,String epsName,double orderNumber){
        boolean space = false;
        for(int i=0; i<PATIENTSIZE && !space; i++){
            if(patient[i] == null){
                patient[i] = new EpsPatient(name, lastName, age, identification, epsName, orderNumber);
                space = true;
                numPatient++;
        
            }

        }
    }

    public void createPatient(String name, String lastName, int age, String identification, String membershipNumber,String category){
        boolean space = false;
        for(int i=0; i<PATIENTSIZE && !space; i++){
            if(patient[i] == null){
                patient[i] = new CoomevaPatient(name, lastName, age, identification, membershipNumber, category);
                space = true;
                numPatient++;
        
            }

        }
    }

    public void createPatient(String name, String lastName, int age, String identification, String membershipNumber,int minimunValue,int maximumValue){
        boolean space = false;
        for(int i=0; i<PATIENTSIZE && !space; i++){
            if(patient[i] == null){
                patient[i] = new SuraPatient(name, lastName, age, identification, membershipNumber, minimunValue, maximumValue);
                space = true;
                numPatient++;
        
            }

        }
    }

    public void createPatient(String name, String lastName, int age, String identification, String membershipNumber,String entityName, String entityPhone){
        boolean space = false;
        for(int i=0; i<PATIENTSIZE && !space; i++){
            if(patient[i] == null){
                patient[i] = new OtherEntity(name, lastName, age, identification, membershipNumber, entityName, entityPhone);
                space = true;
                numPatient++;
        
            }

        }

    }
    
    //Metodo que llama la sobre escritura de datos
    public String getPatient(){
        String message = "";
        for(int i = 0; i<PATIENTSIZE;i++){
            if(patient[i]!=null){
                message += patient[i].getInfo()+"\n";
            }
        }

        return message;

    }

    //Metodo con contadores que calcula la cantidad de pacientes y retorna un mesaje
    //concatenando cada tipo de paciente

    public String showNumPatients(){
		int contParticularPatients = 0;
		int contEPSPatients = 0;
		int contPrepaidPatients = 0;
		int contCoomevaPatients = 0;
		int contSURAPatients = 0;
		int contOtherEntitiesPatients = 0;
        String numPatients = "**********  Centro de vacunación  **********"+"\n"+
                            "Pacientes en el centro de vacunación: ";
		for(int i=0; i<PATIENTSIZE; i++) {
			if(patient[i] != null) {
				if(patient[i] instanceof ParticularPatient){
					contParticularPatients++;
				}
				else if(patient[i] instanceof EpsPatient){
					contEPSPatients++;
				}
				else if(patient[i] instanceof CoomevaPatient){
					contCoomevaPatients++;
					contPrepaidPatients++;
				
				}
				else if(patient[i] instanceof SuraPatient){
					contSURAPatients++;
					contPrepaidPatients++;
				}
				else if(patient[i] instanceof OtherEntity){
					contOtherEntitiesPatients++;
					contPrepaidPatients++;
				}
			}
		}
		
		int contPatientsCenter = contParticularPatients+contEPSPatients+contPrepaidPatients;
		numPatients += contPatientsCenter+"\n"+"Pacientes particulares "+contParticularPatients+"\n"+"Pacientes de EPS "+contEPSPatients+"\n"+"Pacientes prepagados "+contPrepaidPatients+"\n";
		numPatients += "Pacientes de Coomeva "+contCoomevaPatients+"\n"+"Pacientes de SURA "+contSURAPatients+"\n"+"Pacientes de otras entidades "+contOtherEntitiesPatients+"\n";
		return numPatients;
	}

    public Patient findPatient (String name){
        Patient objSearch=null;
        boolean findPa=false;
        for (int i=0;i< PATIENTSIZE && !findPa;i++){
            if (patient[i]!=null && patient[i].getName().equalsIgnoreCase(name)){
                objSearch=patient[i];
                findPa=true;
            }
        }
        return objSearch;

    }
    
    public String showPatient(String name){
		Patient objsearch = findPatient(name);
		String message = objsearch.getInfo();

	return message;
    }
    
    public String showInfo(){
		String message = "";
		message += showNumPatients();
		for(int i = 0; i<PATIENTSIZE; i++){

			if(patient[i] != null){
				message += patient[i].getInfo();

			}
        }
        message += "\n"+createVaccine();
		return message;
    }
    
    public String createVaccine(){
        boolean space = false;
        String message = "Vacunas disponibles: VACIO"+"\n"+
                            "Dosis disponibles: VACIO";
        for(int i=0; i<VACCINATIONSIZE && !space; i++){
            if(diferentVaccination[i] == null){ 
                space = true;
                numPatient++;
        
            }

        }
        return message;
    }

}
