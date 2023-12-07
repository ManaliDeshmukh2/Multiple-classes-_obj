package oops;

public class ChatApplication {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
				int i =10;
				int j=20;
				
				Human h1=new Human();
				h1.name	="Ram";
				h1.age=24;
				h1.gender="Male";
				
				Human h2=new Human();
				h2.name="Siya";
				h2.age=24;
				h2.gender="Female";
				
				System.out.println(h1.name);
				System.out.println(h1.age);
				System.out.println(h1.gender);
				
				System.out.println(h2.name);
				System.out.println(h2.age);
				System.out.println(h2.gender);
				
				Car c1=new Car();
				c1.model="fortuner";
				c1.color="white";
				c1.price=4000000;
				c1.year=2023;
				
				System.out.println(c1.model);
				System.out.println(c1.color);
				System.out.println(c1.price);
				System.out.println(c1.year);
				
				
				Book b1=new Book();
				b1.title="radheya";
				b1.author="ranjit desai";
				b1.pages=560;
				b1.price=360;
				
				System.out.println(b1.author);
				System.out.println(b1.title);
				System.out.println(b1.pages);
				System.out.println(b1.price);
				
	}
		
	}


