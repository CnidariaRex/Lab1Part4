import java.util.Scanner;

public class CarpetDriver
{
	public static void main(String args[])
	{
		double l, w = 0;  //length width and cost
                String carpet_material;
                int delivery_time;
                
                Scanner in = new Scanner(System.in);

                System.out.println("Please enter the material of the carpet (Silk, Linen, Wool, or Persian): ");
                carpet_material = in.nextLine();
                
		System.out.println("Please enter in the length of the carpet: ");
		l = in.nextDouble();

		System.out.println("Please enter in the width of the carpet: ");
		w = in.nextDouble();
                
                System.out.println("Please enter your delivery option ((2) for Two day, (3) for Three day, (0) for Supersaver, or (1) for Normal): ");
                delivery_time = in.nextInt();
                
                

		RoomDimension newRoom = new RoomDimension(l, w);
                Delivery newDelivery = new Delivery(delivery_time);
		RoomCarpet newCarpet = new RoomCarpet(newRoom, carpet_material, newDelivery);
                
		double totalCost = newCarpet.getTotalCost();

		System.out.println("The total cost of the carpet is " + totalCost + " with options chosen of " + newCarpet.toString());
	}
}