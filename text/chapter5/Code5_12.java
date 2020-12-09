public class Code5_12{
	public static void main(String[] args){
		int[] test = {1,2,3};
		int[] tester = printArray(test);
		for(int a : tester){
			System.out.print(a);
		}
		System.out.println();
		for(int b :test){
			System.out.print(b);
		}
		System.out.println();
	}
	public static int[] printArray(int[] test){
		for(int i = 0;i < test.length; i++){
				test[i] += 1;
		}
		return test;
	}
}
