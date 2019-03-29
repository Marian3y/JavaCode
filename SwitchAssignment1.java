public class SwitchAssignment1 {
    public static void main(String[] args) {
        float deliveryCost;
        deliveryCost = test(110, true, "US");
        System.out.println(deliveryCost);
        deliveryCost = test(100, true, "Mexico");
        System.out.println(deliveryCost);
        deliveryCost = test(100, true, "Canada");
        System.out.println(deliveryCost);
    }


    static float test(float orderValue, boolean saturdayDelivery, String destination) {
        float deliveryCost;
        switch (destination) {
            case "US":
                deliveryCost = 20.0f;
                break;
            case "Mexico":
                deliveryCost = 32.0f;
                break;
           // case "Canada":     // Assume that the country is Canada
            default:
                deliveryCost = 25.0f;
                break;
        }
        if (orderValue > 100) {
            switch (destination) {
                case "US":
                    deliveryCost -= 5.0f;
                    break;
                case "Mexico":
                    deliveryCost -= 7.0f;
                    break;
                case "Canada":
                    deliveryCost -= 7.0f;
                    break;
            }
        }

        if (saturdayDelivery) {
            switch (destination) {
                case "US":
                    deliveryCost += 10;
                    break;
                case "Mexico":
                    deliveryCost += 20;
                    break;
                case "Canada":
                    deliveryCost += 12;
                    break;
            }
        }
        return deliveryCost;
    }

}
