
public class Student implements Comparable<Student> {

  private int roll;
  private String name;
  private String add;
  private String mobile;
  private String email;
  private String course;
  private int fess;
  private int pendingfees;
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public int getFess() {
		return fess;
	}
	public void setFess(int fess) {
		this.fess = fess;
	}
	public int getPendingfees() {
		return pendingfees;
	}
	public void setPendingfees(int pendingfees) {
		this.pendingfees = pendingfees;
	}
	
	
	public Student() {
		super();
	}
	
	
	public Student(int roll, String name, String add, String mobile, String email, String course, int fess,
			int pendingfees) {
		super();
		this.roll = roll;
		this.name = name;
		this.add = add;
		this.mobile = mobile;
		this.email = email;
		this.course = course;
		this.fess = fess;
		this.pendingfees = pendingfees;
	}
	
	
	@Override
	public String toString() {
	//return "Student [roll=" + roll + ", name=" + name + ", add=" + add + ", mobile=" + mobile + ", email=" + email
		//	+ ", course=" + course + ", fess=" + fess + ", pendingfees=" + pendingfees + "]";
		return +  roll + "\t" +  name + "\t" +  add + "\t" + mobile +"\t"+  email+"\t" +    course + "\t" +  fess+"\t"+  pendingfees;
	}
	@Override
	
	public int compareTo(Student s1) {
		// TODO Auto-generated method stub
		if(this.fess >s1.fess) {
			return 1;
		}else if (this.fess < s1. fess) {
			return -1;
		}
		return 0;
	}
	
	
	
	
	
}
