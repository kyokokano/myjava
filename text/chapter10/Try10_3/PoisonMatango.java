public class PoisonMatango extends Matango{
	int poisonPp = 5;
	public PoisonMatango(char suffix){
		super(suffix);
	}
	@Override
	public void attack(Hero h){
		super.attack(h);
		if(this.poisonPp > 0){
			System.out.println("さらに毒の胞子をばらまいた!");
			int damege = h.hp/5
			h.hp -= damege;
			System.out.println(damege+"ポイントのダメージ!");
			this.poisonPp --;
		}
	}
}
