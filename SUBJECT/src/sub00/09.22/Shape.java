abstract class Shape
{
	private double area;
	private String name;

	public Shape(){}

	public Shape(String name){
		this.name = name;
	}

	public double getArea(){
		return area;
	}

	public String getName(){
		return name;
	}

	public void setArea(double area){
		this.area = area;
	}

	public void setName(String name){
		this.name = name;
	}

	public void print(){
		System.out.println(name+"�� ������ "+area);
	}

	abstract public void calculationArea();
}