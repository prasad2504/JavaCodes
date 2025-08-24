import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Documented

/*
@Target(ElementType.CONSTRUCTOR)
//you can add that annotation only above the constructor
///
///

*/

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	
	/*annotation are the piece of information about class
	 * 
	 * */
	
	String name();
	String date();
	String place();
	

}
