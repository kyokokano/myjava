public class Main{
	public static void main(String[] args){
		Account kouza1 = new Account();
		kouza1.accountNumber = "2345";
		kouza1.balance = 1000;
		Account kouza2 = new Account();
		kouza2.accountNumber = " 1234";
		kouza2.balance = 1000;
		if(kouza1.equals(kouza2)){
			System.out.println("正しい口座番号です");
		}else{
			System.out.println("口座番号が違います");
		}
	}
}

