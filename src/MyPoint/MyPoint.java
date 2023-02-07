package MyPoint;

public class MyPoint {
	
	private int x;
	private int y;
	
	//cobnstructeur sans parametres

	public MyPoint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	//constructeur avec parametres
	
	public MyPoint(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	//getter and setter


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	//les methodes de la classe
	
	public int[] getXY(){
		int xyArray[] = new int[2];
		
		xyArray[0] =getX();
		xyArray[1] =getY();
		
		return xyArray;
		
	} 
	
	public void setXY(int x, int y) {
		 setX(x);
		 setY(y);
	}


	@Override
	public String toString() {
		return "(x=" + x + ", y=" + y + ")";
	}
	
	//calcul de distance
	
	public double distance(int x, int y) {
	 double Distance;
	 
	 Distance = Math.sqrt((Math.pow((x - this.x),2)) + (Math.pow((y - this.y),2)));
	 
	 return Distance;
	}
	
	//distance entre MyPoint en parametre
	
	public double distance(MyPoint point) {
		
		 double Distance;
		 
		 Distance = Math.sqrt((Math.pow((x - getX()),2)) + (Math.pow((y - getY()),2)));
		
		 return Distance;
	}
	
	//distance d'un seul point
	
	public double distance() {
		
		double Distance;
		 
		 Distance = Math.sqrt((Math.pow(( this.x),2)) + (Math.pow((this.y),2)));
		
		 return Distance;
		
		}
	}
	

