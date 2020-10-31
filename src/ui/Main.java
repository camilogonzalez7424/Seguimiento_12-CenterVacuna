package ui;

import java.util.Scanner;

import model.CoomevaCategories;
import model.VaccinationCenter;

public class Main {

    private static Scanner reader;
	private static VaccinationCenter vCenter;

    public Main(){

        reader = new Scanner(System.in);
        vCenter = new VaccinationCenter();

    }

    public static void main(String [] args) {
		
		System.out.println();
		System.out.println("*************************");
		System.out.println(" Iniciando la aplicación");
		System.out.println("*************************");
		System.out.println("*******  Welcome  *******");
		System.out.println("*************************");
		
		Main ppal= new Main();
		
		int option=0;
		
		do{
			option = ppal.showMenu();
			ppal.executeOperation(option);
			
		}while (option!=0);
		
    }
    
    public int showMenu() {
		int option=0;
		System.out.println();
		System.out.println(
				"Menú principal, seleccione una opción:\n" +
				"(1) Para crear un nuevo paciente \n" +
				"(2) Para calcular la cantidad de pacientes \n"+
				"(3) Para mostrar todos los pacientes o un paciente en especifico \n"+
				"(4) Para mostrar información del centro de vacunación \n" +  
				"(0) Para salir"
				);
		option= reader.nextInt();
		reader.nextLine();
		return option;
	}
	
	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:addPatient();
			break;
		case 2:	System.out.println(vCenter.showNumPatients());
			break;
	
		case 3:	
				System.out.println("Ingrese"+"\n"+
										"(1) Si quiere mostrar todos los pacientes registrados"+"\n"+
										"(2) Si quiere buscar un paciente en especifico"+"\n");
				int election;	
				election = reader.nextInt();					
				if(election == 1){
					System.out.println(vCenter.getPatient());
				}
				reader.nextLine();
				if(election == 2){
				System.out.println("Ingrese el nombre del paciente que solicita la información");
				String name = reader.nextLine();
				System.out.println(vCenter.showPatient(name));
				}
			break;

		case 4:
				System.out.println(vCenter.showInfo());
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}
	
	private void addPatient(){
		if(vCenter.hasPatient()){
			System.out.println("Ingrese el nombre del paciente,por favor:");
			String name = reader.nextLine();
			System.out.println("Ingrese el apellido del paciente : "+ name + ",por favor");
			String lastName = reader.nextLine();
			System.out.println("Ingrese la edad del paciente: "+ name);
			int age = reader.nextInt();
			reader.nextLine();
			System.out.println("Ingrese la identificación del paciente: "+ name);
			String identification = reader.nextLine();
		
		int option=0;
		System.out.println(
				"Menú Paciente:\n" +
				"(1) Si es un paciente particular\n" +
				"(2) Si es un paciente de EPS\n"+
				"(3) Si es un paciente de medicina prepagada\n"+
				"(0) Para volver"
				);
		option= reader.nextInt();
		reader.nextLine();
		
		switch(option) {
		case 1:	
				System.out.println("Ingrese número de contacto del paciente : "+ name );
				String contactPhone = reader.nextLine();
				System.out.println("Ingrese el nombre del doctor(a): ");
				String doctorName = reader.nextLine();
				System.out.println("Ingrese el número de contacto del doctor(a): "+ doctorName);
				String phone = reader.nextLine();
				System.out.println("Ingrese el número de licencia del doctor(a): "+doctorName);
				String licenseNumber = reader.nextLine();

				vCenter.createPatient(name, lastName, age, identification, contactPhone, doctorName, phone, licenseNumber);

		System.out.println("El paciente particular \""+ name +" "+lastName+"\" ha sido creado y registrado con éxito\n");
			break;
		case 2:
				System.out.println("Ingrese el nombre de la EPS: ");
				String epsName = reader.nextLine();
				System.out.println("Ingrese el número de la orden: ");
				double orderNumber = reader.nextDouble();
				
				vCenter.createPatient(name, lastName, age, identification, epsName, orderNumber);
		
				System.out.println("El paciente \""+ name + " " +lastName+"\" ha sido creado y registrado con éxito en una Eps\n");
			break;
		case 3: 
		System.out.println("número de afiliacion");
		String membershipNumber =reader.nextLine();
		System.out.println("Elija el tipo de entidad de medicina de paga: "+"\n"+
							"(1) Si es Coomeva"+"\n"+
							"(2) Si es Sura"+"\n"+
							"(3) Si es Otra");
		int prepaid = reader.nextInt();
		reader.nextLine();

		switch(prepaid){
			case 1:
				
				System.out.println("Escriba la categoria solo existen las que se muestran a continuación: "+"\n"+
									" PLATINUM"+"\n"+
									" GOLD"+"\n"+
									" PLUS_GOLD"+"\n");
				String category=reader.nextLine().toUpperCase();

				vCenter.createPatient(name, lastName, age, identification, membershipNumber, category);

				System.out.println("El paciente \""+ name + " " +lastName+"\" ha sido creado y registrado con éxito en Coomeva\n");
			break;
			case 2:{
				
				System.out.println("Ingrese el valor minimo de la poliza");
				int minimunValue = reader.nextInt();
				System.out.println("Ingrese el valor maximo de la poliza");
				int maximumValue = reader.nextInt();
				
				vCenter.createPatient(name, lastName, age, identification, membershipNumber, minimunValue, maximumValue);
				
				System.out.println("El paciente \""+ name + " " +lastName+"\" ha sido creado y registrado con éxito en Sura\n");
			}break;
			case 3:{
				System.out.println("Ingrese el nombre de la  entidad");
				String entityName = reader.nextLine();
				System.out.println("Ingrese el número entidad");
				String phoneEntity = reader.nextLine();
				
				vCenter.createPatient(name, lastName, age, identification, membershipNumber, entityName, phoneEntity);

				System.out.println("El paciente \""+ name + " " +lastName+"\" ha sido creado y registrado con éxito en Otra Entidad\n");
			}break;
			default:
				System.out.println("Error, opción no válida");
			}

			break;
		default: 
			System.out.println("Error, opción no válida");
		}
		
	}
	else{
		System.out.println("No puede crearse el paciente porque se llegó al límite");
		}
}

}