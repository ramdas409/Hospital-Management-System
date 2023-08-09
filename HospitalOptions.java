package listhospital;

import java.util.ArrayList;
import java.util.Collections;

public class HospitalOptions {
	static ArrayList<Patient>lis=HospitalManagement.patientInfo();
	
	
	
	public void addPatient(Patient p){

boolean b=false;
for(Patient pp:lis) {
	if(pp.getId()==p.getId()) {
		b=true;
		System.out.println("detgggails alrvuvuzzddeady exists");
		break;
	}
}

if(b==false) {
	lis.add(p);
	System.out.println("details addhjjgued sucessfully");
}

	}
	
public 	void removePatient(int id,String name) {
	boolean b=false;
	for(Patient p1:lis) {
		if((p1.getId()==id)&&(p1.getName().equals(name))) {
			b=true;
			lis.remove(p1);
			System.out.println("removed data sucessfully");
			break;
		}
	}
	if(b==false) {
		System.err.println("id : "+id+"name:  "+name+"does not exists in the databasae");
		
	}
	
}
	
	
public void getPatient(int id,String name) {
	boolean b=false;
	for(Patient p1:lis) {
		if((p1.getId()==id)&&(p1.getName().equals(name))) {
			System.out.println(p1.toString());
			b=true;
			break;
		}
	}
	if(b==false) {
		System.err.println("patient having name : "+name+" id :"+id+" does not exists");
	}
}
	
public void getAllPatients() {
Collections.sort(lis);
	for(Patient p1:lis) {
		System.out.println(p1.toString());
	}
}
public void getBillDetails(int id,String name) {
	boolean b=false;
	for(Patient pp:lis) {
	if((pp.getId()==id)&&(pp.getName().equals(name))){
		System.out.println("bill of  "+name+"  is : "+pp.getBill());
		b=true;
		break;
	}
	}
	if(b==false) {
		System.err.println("data not found to get the bill of"+name);
	}
	}
public void PayBill(int id,String name,int bill) {
	boolean b=false;
	for(Patient p:lis) {
		if((p.getId()==id)&&(p.getName().equals(name))) {
			p.setBill(p.getBill()+bill);
			b=true;
			break;
		
		}
	}
	if(b==false) {
		System.out.println("bill cannot be paid due to patient with id  :  "+id+"  name: "+name+"cannot exists in database");
	}
}

}
