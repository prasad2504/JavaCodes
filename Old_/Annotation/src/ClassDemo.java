import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassDemo {
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		//Class is a built in class in java 
		
		Class c1= e1.getClass();
		
		
		
		Method [] m1 = c1.getDeclaredMethods();
		System.out.println("methods of employye class");
			for(int i=0; i<m1.length ; i++) {
			System.out.println(m1[i]);
		}
		
		
		Field [] f1 = c1.getDeclaredFields();
		System.out.println("\nFields of employye class");
		for(int i=0; i<f1.length ; i++) {
			System.out.println(f1[i]);
		}
		
		Constructor [] a1 =c1.getDeclaredConstructors();
		System.out.println("\nConstructor of employye class");
		for(int i=0; i<a1.length ; i++) {
			System.out.println(a1[i]);
		}
		
		Annotation [] p1 =c1.getDeclaredAnnotations();
		System.out.println("\nAnnotation of employye class");
		for(int i=0; i<p1.length ; i++) {
			System.out.println(p1[i]);
		}
		
	}

}
