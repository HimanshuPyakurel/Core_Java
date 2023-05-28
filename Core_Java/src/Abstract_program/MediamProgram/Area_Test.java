package Abstract_program.MediamProgram;

import java.util.Scanner;

public class Area_Test {

	public static void main(String[] args) {
		
		int count = 1;
		Area area[] = new Area[4];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<4 ;i++) {
			
			Area a1 = new Area();
			
			System.out.println("\t"+count+" Iteratiton");
			System.out.println("-------------------------------");
			
			System.out.println("Enter Length and breadth : ");
			a1.RectangleArea(sc.nextInt(),sc.nextInt());
			System.out.println("-------------------------------");
			
			System.out.println("Enter a side : ");
			a1.SquareArea(sc.nextInt());
			System.out.println("-------------------------------");
			
			System.out.println("Enter Radius : ");
			a1.CircleArea(sc.nextFloat());
			System.out.println("-------------------------------");
			
			area[i] = a1;
			count ++;
		}
		
		
	}
}
