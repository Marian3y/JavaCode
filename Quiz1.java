public class Quiz1 {
    public static void main(String[] args) {
       float deliveryCost;
        deliveryCost = test(100,true , "US");
        System.out.println(deliveryCost);
        deliveryCost = test(100,true , "Mexico");
        System.out.println(deliveryCost);
        deliveryCost = test(100,true , "Canada");
        System.out.println(deliveryCost);
   }


    static float test(float orderValue, boolean saturdayDelivery, String destination) {
        float deliveryCost=0;

        if ( destination.equals("US") ) {
            deliveryCost = 20.0f;
        }
        if ( destination.equals("Mexico") ) {
            deliveryCost = 32.0f;
        }
        if (destination.equals("Canada")){     // Assume that the country is Canada
            deliveryCost = 25.0f;
        }
        if(orderValue>100) {
            if (destination.equals("US")) {
                deliveryCost -= 5.0f;
            }
            if (destination.equals("Mexico")) {
                deliveryCost -= 7.0f;
            }
            if (destination.equals("Canada")) {     // Assume that the country is Canada
                deliveryCost -= 7.0f;
            }

        }

        if (saturdayDelivery) {
            if (destination.equals("US")) {
                deliveryCost += 10;
            }

            if (destination.equals("Mexico")) {
                deliveryCost += 20;
            }
            if (destination.equals("Canada")) {
                deliveryCost += 12;
            }
        }
        return deliveryCost;
    }

}