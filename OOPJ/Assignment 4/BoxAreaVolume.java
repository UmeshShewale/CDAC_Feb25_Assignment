/*Q3. Box Area and Volume 
Write a class Box with three member variables: height, width, and breadth. Include appropriate 
constructors to initialize these variables. Also, implement two methods: 
getVolume() to return the volume of the box 
getArea() to return the surface area of the box 
Create two instances of the Box class and display their volumes and surface areas.*/
import java.util.*;

interface Box{
	
	void getArea();
	void getVolume();
}

class BoxDemo implements Box{
	
	private float height;
	private float width;
	private float breadth;
	
	BoxDemo(float height, float width, float breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
		
	}
	
	public void getArea(){
		double area =2*(width*breadth + width*height + breadth*height);
		System.out.println("Surface area of box :"+ area);
		
	}
	
	public void getVolume(){
		double Volume = width*breadth*height;
		System.out.println("Surface area of box :"+ Volume);
		
	}
}

class BoxAreaVolume{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Height of Box: ");
	int height = sc.nextInt();
	System.out.println("Enter the Width of Box: ");
	int width = sc.nextInt();
	System.out.println("Enter the Breadth of Box: ");
	int breadth = sc.nextInt();
	
	Box s1 = new BoxDemo(height, width, breadth);
	s1.getArea();
	s1.getVolume();
	}
}