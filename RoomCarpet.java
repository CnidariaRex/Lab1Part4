public class RoomCarpet
{

	public RoomDimension size;
	public double carpetCost;
        public String material;

	public RoomCarpet(RoomDimension dim, double cost, String carpet_material)
	{
		size = dim;
		carpetCost = cost;
                material = carpet_material;
	}

	public double getTotalCost()
	{
		return (carpetCost * size.getArea());
	}

	public String toString()
	{
		return "Size: " + this.size.toString() + "Carpet Cost: " + this.carpetCost + "using material: " + this.material;
	}
}