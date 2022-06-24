public class Rectangle {

	private int l;				
	private int b;		
	
	
	public int getL() {
		return l;
	}
	public void setL(int l) {

		if(l<10 || l>50)
		{
			
			System.out.println("Please enter length between 10 & 50");
		}
		
		this.l=l;
	}
	
	
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		
		if(b< 5|| b> 20)
		{
		
			System.out.println("Please enter breadth between 5 & 20");
		}
		
		this.b = b;
	}
	
	
	
	public Rectangle(int l, int b) {
		setL( l);
		setB( b);
		
	}
	
	
	@Override
	public String toString() {
		return "Rectangle [Length= " + getL() + ", Breadth= " + getB() + "]" + "[AREA = " + getL()*getB() +"]";
		
	}
	
	
	
	
	
	
}