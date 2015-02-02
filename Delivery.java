public class Delivery {
    
    public enum DeliveryType{
        TWODAY("Two day", 11.65), THREEDAY("Three day", 16.54), SUPERSAVER("Supersaver", 0.00), NORMAL("Normal", 5.43);

        public String deliv;
        public double deliv_cost;

            private DeliveryType(String deliv, double deliv_cost) {
                    this.deliv = deliv;
                    this.deliv_cost = deliv_cost;
            }
        
            public String toString() {
                switch (this) {
                  case TWODAY:
                       System.out.println("Two day delivery cost: " + deliv_cost);
                       break;
                  case THREEDAY:
                       System.out.println("Three day delivery cost: "  + deliv_cost);
                       break;
                  case SUPERSAVER:
                       System.out.println("Supersaver delivery cost: "  + deliv_cost);
                       break;
                  case NORMAL:
                       System.out.println("Normal delivery cost: "  + deliv_cost);
                 }
           return super.toString();
          }
        };

    public DeliveryType new_delivery;
    
    public Delivery(int deliv_type)
    {
        switch(deliv_type)
        {
            case 2:
                new_delivery = DeliveryType.TWODAY;
                break;
            case 3:
                new_delivery = DeliveryType.THREEDAY;
                break;
            case 0:
                new_delivery = DeliveryType.SUPERSAVER;
                break;
            case 1:
                new_delivery = DeliveryType.NORMAL;
                break;                
        }
    }
    
    public double GetDeliveryCost()
    {
        return new_delivery.deliv_cost;
    }
}
