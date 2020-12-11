public class Main{
	public static void main(String[] args){
		Hero hero1 = new Hero();
		hero1.name = "ちゃん";
		hero1.hp = 100;
		hero1.makeS();

		System.out.print(hero1.name+"は"+hero1.sword.name+"を装備した!");
		hero1.attack();
	}
}
