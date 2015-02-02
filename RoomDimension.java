public class RoomDimension
{

	public double length;
	public double width;

	public RoomDimension(double x, double y)
	{
		length = x;
		width = y;
	}

	public double getArea()
	{

		return (length*width);
	}

	public String toString()
	{
		return " Length: " + this.length + " Width: " + this.width;
	}
	
}