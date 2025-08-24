
public class Studentt {
	
	private String name;
	private int age;
	
	
	public Studentt(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge(int age) {
return age;
	
	}


	public void setAge(int age) {
		this.age = age;
		if(age>0) {
			this.age= age;
		}else {
			System.out.println("age must be positive");
			
		}
	}
	
	
	public static void main(String[] args) {
		Studentt s1 = new Studentt("yash",23 );
		
		System.out.println("name :" +s1.getName());
		System.out.println("age :" +s1.getAge(23));
		
		s1.setAge(50);
		s1.setName("yash");
		
		System.out.println("name :" +s1.getName());
		System.out.println("age :" +s1.getAge(50));
	}
	

}
