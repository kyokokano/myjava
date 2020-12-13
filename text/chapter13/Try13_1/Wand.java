public class Wand{
	private String name;
	private double power;
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		if(name == null ||name.lenth() < 3){
			throw new IllegalArgumentException
			("名前は3文字以上です。処理を中断します。");
		}
		this.name = name;
	}
	public double getPower(){
		return this.power;
	}
	public void setPower(double power){
		if(power < 0.5 || power > 100.0){
			throw new IllegalArgumentException
			("0.5以上100以下で設定してください。処理を中断します。");
		}
		this.power = power;
	}
}
