public class Try5_2{
	public static void main(String[] args){
		email("感謝","yahoomail","いつもありがとう!");
	}
	public static void email(String title,String address,String text){
		System.out.println(address+"に以下のメールを送信しました");
		System.out.println("件名:"+title);
		System.out.println("本文:"+text);
	}
}
