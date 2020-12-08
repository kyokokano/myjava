import java.util.*;
public class age{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("あなたの年齢を入力>");
		int age = sc.nextInt();
		ageCheck(age);
	}
	public static void ageCheck(int age){
		String ans = (age < 20 ? "あなたは子供です":"あなたは大人です");
		System.out.println(ans);

	}
}
