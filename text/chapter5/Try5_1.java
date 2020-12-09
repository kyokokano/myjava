public class Try5_1{
	public static void main(String[] args){
		introduceOneself();
	}
	public static void introduceOneself(){
		String name = "前田";
		int age = 30;
		double height = 168.0;
		char eto = '午';
		System.out.printf("%sさん(%d)は%.1fcmで干支は%sです%n",name,age,height,eto);
	}
}
