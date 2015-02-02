import java.util.Scanner;

public class CarpetDriver
{
	public static void main(String args[])
	{
		double l, w, c = 0;  //length width and cost
                String carpet_material;
                
                Scanner in = new Scanner(System.in);

                System.out.println("Please enter the material of the carpet: ");
                carpet_material = in.nextLine();
                
		System.out.println("Please enter in the length of the carpet: ");

		l = in.nextDouble();

		System.out.println("Please enter in the width of the carpet: ");

		w = in.nextDouble();

		System.out.println("Please enter in the cost of the carpet: ");

		c = in.nextDouble();
                
                

		RoomDimension newRoom = new RoomDimension(l, w);

		RoomCarpet newCarpet = new RoomCarpet(newRoom, c, carpet_material);

		double totalCost = newCarpet.getTotalCost();

		System.out.println("The total cost of the carpet is " + totalCost);
	}
}