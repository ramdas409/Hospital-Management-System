package listhospital;

import java.util.ArrayList;

public class HospitalManagement {

	
	public  static ArrayList<Patient> patientInfo() {
		ArrayList<Patient> list=new ArrayList<Patient>();
		Patient ali=new Patient(10,"alfvis",25,"heart",9014484452l,30090); 
		Patient ram=new Patient(9,"radcvm",22,"codfgugh",8790876534l,20000);
		Patient ravindra=new Patient(60,"ravdhdinsdddra",23,"fever",8886922183l,27999);
		Patient loki=new Patient(34,"loki",23,"malaria",9347394783l,34520);
		Patient ravi=new Patient(232,"ravi",21,"fever",8142836165l,7362);
		
		list.add(ali);
		list.add(ravindra);
		list.add(ravi);
		list.add(loki);
		list.add(ram);
		
		return  list;
	}
	
	
	
	
	

}
