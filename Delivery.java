public class Delivery {
    
    public enum DeliveryType{
        TWODAY("Two day", 11.65), THREEDAY("Three day", 16.54), SUPERSAVER("Supersaver", 0.00), NORMAL("Normal", 5.43);

        public String deliv;
        public double deliv_cost;

            private DeliveryType(String deliv, double deliv_cost) {
                    this.deliv = deliv;
                    this.deliv_cost = deliv_cost;
            }
        
            @Override
            public String toString() {
                switch (this) {
                  case TWODAY:
                      return " Two day delivery cost: " + deliv_cost;
                  case THREEDAY:
                      return " Three day delivery cost: "  + deliv_cost;
                  case SUPERSAVER:
                      return " Supersaver delivery cost: "  + deliv_cost;
                  case NORMAL:
                      return " Normal delivery cost: "  + deliv_cost;
                 }
                return "Completed.";
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
    
    public String toString()
    {
        return new_delivery.toString();
    }
}
