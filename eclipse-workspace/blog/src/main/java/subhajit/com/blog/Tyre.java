package subhajit.com.blog;

//import org.springframework.stereotype.Component;


public class Tyre {
	
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	/*public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;	
	}
	*/

	String brand;

	@Override
	public String toString() {
		return "Tyre [ brand="+brand+"]";
	}
	

}
