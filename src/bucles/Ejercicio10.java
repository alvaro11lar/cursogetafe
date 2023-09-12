package bucles;

public class Ejercicio10 {
	
	public static void main(String[] args) {
		System.out.println();
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=8;j++) {
				if(i==3 || i==5) {
					System.out.print("* ");
				}else{
					if(j==3 || j==6) {
						System.out.print("  * ");
					}else {
						System.out.print(" ");
					}
				}
				
			}
			System.out.println();
		}
	}

}
