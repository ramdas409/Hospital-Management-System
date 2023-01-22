package listhospital;
import java .util.Scanner;
public class Hospitallogin {

	public static void getOpen() {
		boolean b=false;
		while(!b) {
			System.out.println("Select option");
			System.out.println("1. Add Patient              2.Remove Patient ");
			System.out.println("3.Get Patient               4.All Patients Information");
			System.out.println("5.Get bill                  6. pay bill   ");
			System.out.println("7.Exit");
			Scanner sc=new Scanner(System.in);
			
			int num=sc.nextInt();
			sc.nextLine();
			
			HospitalOptions hos=new HospitalOptions();
			switch(num) {
			case 1:{
				try {
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter age");
				int age=sc.nextInt();
				System.out.println("enter mobile");
				long mobile=sc.nextLong();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("Enter issue");
				String issue=sc.nextLine();
				System.out.println("enter bill");
				int bill=sc.nextInt();
				Patient p1=new Patient(id,name,age,issue,mobile,bill);
				hos.addPatient(p1);
				
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
				
			}
			
			case 2:{
				try {
					System.out.println("enter id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("enter name");
					String name=sc.nextLine();
				hos.removePatient(id, name);
					
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			}
			
			
			case 3:{
				try {
					System.out.println("enter id");
					int id=sc.nextInt();
					sc.nextLine();
					System.out.println("enter name");
					String name=sc.nextLine();
					hos.getPatient(id, name);
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			}
			
			case 4 :{
				try {
					hos.getAllPatients();
					System.out.println("\n");
				}
				catch(Exception e) {
					e.printStackTrace();
				}
				break;
			}
			case 5:{
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				hos.getBillDetails(id, name);
				break;
			}
			case 6:{
				System.out.println("enter id");
				int id=sc.nextInt();
				sc.nextLine();
				System.out.println("enter name");
				String name=sc.nextLine();
				System.out.println("enter bill to pay");
				int bill=sc.nextInt();
				hos.PayBill(id, name, bill);
				break;
				
			}
			case 7:{
				b=true;
				break;
			}
			default:{
				System.out.println("Entered a invalid  option");
				
			}
			
			
			}
			
		}
		
		
	}
}
