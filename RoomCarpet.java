public class RoomCarpet
{
        public enum CarpetType {
            SILK("Silk"), LINEN("Linen"), WOOL("Wool"), PERSIAN("Persian");
            public String carpet_type;

            private CarpetType(String carpet_type) {
                    this.carpet_type = carpet_type;
            }
        
            public String toString() {
                switch (this) {
                  case SILK:
                       System.out.println("Silk: " + carpet_type);
                       break;
                  case LINEN:
                       System.out.println("Linen: " + carpet_type);
                       break;
                  case WOOL:
                       System.out.println("Wool: " + carpet_type);
                       break;
                  case PERSIAN:
                       System.out.println("Persian: " + carpet_type);
                 }
           return super.toString();
          }
        };   


	public RoomDimension size;
	public double carpetCost;
        public CarpetType Type;
        public Delivery thisDelivery;
 
	public RoomCarpet(RoomDimension dim, String material, Delivery newDelivery)
	{
		size = dim;
                thisDelivery = newDelivery;
                switch(material){
                    case "Silk":
                        Type = CarpetType.SILK;
                        carpetCost = 30;
                        break;
                    case "Linen":
                        Type = CarpetType.LINEN;
                        carpetCost = 8;
                        break;
                    case "Wool":
                        Type = CarpetType.WOOL;
                        carpetCost = 6.5;
                        break;
                    case "Persian":
                        Type = CarpetType.PERSIAN;
                        carpetCost = 45.76;
                        break;
                }
	}

	public double getTotalCost()
	{
		return (carpetCost * size.getArea() + thisDelivery.GetDeliveryCost());
	}

	public String toString()
	{
		return "Carpet type of: " + this.Type.toString() + " Size: " + this.size.toString() + " Carpet Cost: " + this.carpetCost + "With delivery options: " + this.thisDelivery.toString();
	}
}