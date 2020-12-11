public class Hero{
	String name;
	int hp;
	Sword sword = new Sword();

	public void makeS(){
	sword.name = "魔法の剣";
	sword.damege = 50;
}
	public void attack(){
		System.out.println(this.name+"は"+this.sword.name+"で攻撃した");
		System.out.println("敵に５ダメージ!");
	}
}
