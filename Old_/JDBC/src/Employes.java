
public class Employes {
	
		int id;
		String name;
		int age;
		
		//getter setter methods
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
		
		//default constructor
		public Employes() {
			super();
		}
		
		//parameterised constructor
		public Employes(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}
		
		//toString method
		@Override
		public String toString() {
			return "Employes [id=" + id + ", name=" + name + ", age=" + age + "]";
		}
		
		
		
		
		
		
		
}
