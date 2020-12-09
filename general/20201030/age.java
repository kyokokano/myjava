import java.util.*;
public class age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("あなたの年齢を入力>");
		int age = sc.nextInt();
		boolean ans =  ageCheck(age);
		if(ans){
			System.out.println("あなたは大人です");
		}else{
			System.out.println("あなたは子供です");
		}
	}
	public static boolean ageCheck(int age){
		boolean ans = age >= 20 ? true : false;
		return ans;
	}
}
