package proj1;

public class Car {
	String name;
	String model;
	static int wheels=4;

	//constructor-1
	public Car(){
		System.out.println("constructor 1");
	}

	//constructor-2
	public Car(String name,String model){
		this.name=name;
		this.model=model;
		System.out.println(name);
		System.out.println(model);
	}
	
	public static void main(String[] args) {
		Car a = new Car();
		a=new Car("sanket","abc");
		

		System.out.println("test123");
		System.out.println("test1");


		System.out.println("test2");
		System.out.println("test25");
		
	}
}

