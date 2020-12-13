public class Matango extends Character{
	@Override
	public void attack(Matango m){
		System.out.println(this.name+"の攻撃!");
		System.out.println(m.name+"に3ポイントのダメージ");
		m.hp -= 3;
	}
}
