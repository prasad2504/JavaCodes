// object -> throwable -> exception -> 1) Exception Handling              2) Error
//                                     a)cheaked Ex b) Unchecked Ex
//  a)cheaked Ex (compile)-> fileNotFound , IoException , sqlException , classnotfound
//  b)Uncheaked Ex(runtime) -> ArrayIndexoutofbound , ArithmathicException , nullpointer 
// try , catch , finally
// try with resource
//custom (imp)



//custom

package exceptionRevision;

public class first {
	
	
	
	public static void main(String[] args) throws overPriceException, lessPriceException {
		
		User user = new User(456);
		
		try {
		user.cheakPrice();
		}catch(overPriceException e) {
			//System.out.println(e);
		}catch(lessPriceException p) {
			//System.out.println(p);
		}
		
	}

}


class overPriceException extends Exception{

	public overPriceException() {
		super();
		System.out.println("price is ok");
		
		
	}
	
	
}


class lessPriceException extends Exception{
	
	public lessPriceException() {
		super();
		System.out.println("price is too less");
	}
}


class User{
	
	int price;
	
	public User(int price) {
		this.price=price;
	}
	
	public void cheakPrice() throws overPriceException, lessPriceException {
		
		
		if(price>500) {
			throw new overPriceException();
		}
		else if(price<500) {
			throw new lessPriceException();
		}
		
		
	}
	
}
