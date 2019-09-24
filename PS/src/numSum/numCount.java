package numSum;

public class numCount {

	public static void main(String[] args) {
		var q = "fgdfgeg3445546sd023fr";
		var num = q.replaceAll("[^0-9]","");
		
		String numbers[] = {};
		int a = 10; //lowest
		int b = 0; //highest
		
//		System.out.println(num);
		
		numbers = num.split("");
		for(int i = 0; i<numbers.length;i++) {
			int comp = Integer.parseInt(numbers[i]);
			System.out.println(comp);
			if(comp>b) b= comp;
			if(comp<a) a= comp;
		}
//		System.out.println("b="+b);
//		System.out.println("a="+a);
		System.out.println(a+b);
	}

}

