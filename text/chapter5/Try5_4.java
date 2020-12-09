public class Try5_4{
	public static void main(String[] args){
		double bottom = 10.0;
		double height = 5.0;
		System.out.println("底辺:"+bottom+"cm,高さ:"+height+"cm:面積:"+calcTriangleArea(bottom,height));
		double radius = 5.0;
		System.out.println("半径:"+radius+":面積:"+calcCircleAreas(radius));
	}
	public static double calcTriangleArea(double bottom,double height){
		return bottom*height/2;
	}
	public static double calcCircleAreas(double radius){
		return radius*radius*3.14;
	}
}
