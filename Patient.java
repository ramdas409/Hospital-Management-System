package listhospital;

public class Patient  implements Comparable{
private int id;
private String name;
private int age;
private String issue;
private long mobile_number;
private int bill;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getIssue() {
	return issue;
}
public void setIssue(String issue) {
	this.issue = issue;
}
public long getMobile_number() {
	return mobile_number;
}
public void setMobile_number(long mobile_number) {
	this.mobile_number = mobile_number;
}
public int getBill() {
	return bill;
}
public void setBill(int bill) {
	this.bill = bill;
}
public Patient(int id, String name, int age, String issue, long mobile_number,int bill) {
	
	this.id = id;
	this.name = name;
	this.age = age;
	this.issue = issue;
	this.mobile_number = mobile_number;
	this.bill=bill;
}
@Override
public int hashCode() {
	
	return this.id+this.age+this.name.hashCode()+this.issue.hashCode()+(int)this.mobile_number+(int)this.bill;
}
@Override
public String toString() {
	return "name: "+this.name+" id :"+this.id+"  age : "+this.age+" issue : "+this.issue+"  mobile number : "+this.mobile_number+" bill : "+this.bill;
}
@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Patient pp=(Patient)o;
	if(this.id>pp.id) {
		return 1;
	}
	else if(this.id<pp.id) {
		return -1;
	}
	else {
		return 0;
	}
}

}
