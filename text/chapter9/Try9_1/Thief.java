public class Tief{
	String name;
	int hp;
	int mp;
	public Tief(String name,int hp,int mp){
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}
	public Tief(String name,int hp){
		Tief(name,hp,5);
	}
	public Tief(String name){
		Tief(name,40);
	}
}
