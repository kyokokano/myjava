public class Wizard extends Character{
	int mp;
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃!");
		System.out.println("敵に3ポイントのダメージ!");
		m.hp -= 3;
	}
}
