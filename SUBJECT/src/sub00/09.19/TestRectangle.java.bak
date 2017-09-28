import java.util.Scanner;
//import c.modeling.ex01.ans.Rectangle;

class Rectangle
{
	private String color;
	private int width;
	private int length;


	public void setColor(String color){
		this.color = color;
	}

	public String getColor(){
		return color;
	}

	public void setWidth(int width){
		this.width = width;
	}

	public int getWidth(){
		return width;
	}

	public void setLength(int length){
		this.length = length;
	}

	public int getLength(){
		return length;
	}

	public int area(){
		return width*length;
	}

	public int perimiter(){
		return 2*width + 2*length;
	}
}

public class TestRectangle 
{
	public static void main(String[] args) 
	{
		Scanner keyboard = new Scanner(System.in);

		Rectangle rec1 = new Rectangle();
		System.out.println("첫 번째 직사각형의 색깔 :");
		rec1.setColor(keyboard.next());

		System.out.println("첫 번째 직사각형의 가로 :");
		rec1.setWidth(keyboard.nextInt());

		System.out.println("첫 번째 직사각형의 세로 :");
		rec1.setLength(keyboard.nextInt());

		Rectangle rec2 = new Rectangle();
		System.out.println("두 번째 직사각형의 색깔 :");
		rec2.setColor(keyboard.next());

		System.out.println("두 번째 직사각형의 가로 :");
		rec2.setWidth(keyboard.nextInt());

		System.out.println("두 번째 직사각형의 세로 :");
		rec2.setLength(keyboard.nextInt());

		System.out.println(rec1.getColor() + " 직사각형의 넓이는 "+rec1.area()+"이고 둘레는 "+rec1.perimiter() + "입니다.");
		System.out.println(rec2.getColor() + " 직사각형의 넓이는 "+rec2.area()+"이고 둘레는 "+rec2.perimiter() + "입니다.");

		if(rec1.area()>rec2.area()){
			System.out.println("넓이는 "+rec1.getColor()+" 직사각형이 더 큽니다.");
		}
		else if(rec1.area()<rec2.area()){
			System.out.println("넓이는 "+rec2.getColor()+" 직사각형이 더 큽니다.");
		}
		else
			System.out.println("넓이는 같습니다.");

		if(rec1.perimiter()>rec2.perimiter()){
			System.out.println("둘레는 "+rec1.getColor()+" 직사각형이 더 깁니다.");
		}
		else if(rec1.perimiter()<rec2.perimiter()){
			System.out.println("둘레는 "+rec2.getColor()+" 직사각형이 더 깁니다.");
		}
		else
			System.out.println("둘레는 같습니다.");
	}
}