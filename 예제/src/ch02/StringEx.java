package ch02;

class StringEx {
	
	public static void main(String[] args) {
		String name = "Ja" + "va";
		String str  = name + 8.0;
		
		// 문자열 + any type = 문자열
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + "");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
	
}
