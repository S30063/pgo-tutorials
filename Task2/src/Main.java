public class Main {
    public static void main(String[] args) {
        int age = 18;
        double ticket_price = 40;
        boolean isThursday = false;
        String isWarsaw = "Warsaw";
//        if (age < 10) {
//            ticket_price = 0;
//        } else if (age >= 10 && age <= 18) {
//            ticket_price = ticket_price * 0.5;
//
//        }
//        if (isWarsaw) {
//            ticket_price = ticket_price - (ticket_price * 0.1);
//
//
//        }
//        if (isThursday) {
//            ticket_price = 0;
//
//        }
        double discount =Getdiscount(age, isWarsaw, isThursday);
        double FinalPrice =FinalDiscount(discount, ticket_price);


        System.out.println("Ticket price: " + FinalPrice);
        System.out.println("Data: " + isWarsaw + ", " + age +" years old, weekday ticket price: " + ticket_price + "PLN");
        System.out.println("Discount:" + discount*100  + "%");
    }
    public static double Getdiscount(int age, String isWarsaw, boolean isThursday) {
        if (age < 10) return 1;
        if (isThursday) return 1;
        double discount = 0;
        if (age<=18){
            discount =0.5;
        }
        if (isWarsaw.equals("Warsaw")){
            discount =discount+0.1;
        }
        return discount;
    }


    public static double FinalDiscount(double discount, double ticket_price) {
        double final_price;

        if (discount==1.0){
            ticket_price=0;
        }
        if (discount>0){
            ticket_price = ticket_price - (ticket_price * discount);
        }
        final_price = ticket_price;
        return final_price;
    }
}
