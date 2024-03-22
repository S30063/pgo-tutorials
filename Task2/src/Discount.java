import static org.junit.jupiter.api.Assertions.*;

class Discount {

    @org.junit.jupiter.api.Test
    void AgeLessThan10() {
        //Arrange
        int age = 5;
        boolean Thursday = true;
        String NotWarsawCitizen = "Krakow";

        //Act
        double discount = Main.Getdiscount(age, NotWarsawCitizen, Thursday);

        //Assert
        assertEquals(1, discount);
    }
    @org.junit.jupiter.api.Test
    void AgeBetween10and18() {
        //Arrange
        int age = 16;
        boolean Thursday = false;
        String NotWarsawCitizen = "Krakow";
      //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, NotWarsawCitizen, Thursday);


        //Assert
        assertEquals(0.5, discount);
    }
    @org.junit.jupiter.api.Test
    void AgeAfter18() {
        //Arrange
        int age = 19;
        boolean Thursday = false;
        String NotWarsawCitizen = "Krakow";
        //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, NotWarsawCitizen, Thursday);


        //Assert
        assertEquals(0, discount);
    }
    @org.junit.jupiter.api.Test
    void isWarsaw() {
        //Arrange
        int age = 19;
        boolean Thursday = false;
       // String NotWarsawCitizen = "Krakow";
        String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, isWarsawCitizen, Thursday);


        //Assert
        assertEquals(0.1, discount);
    }


    @org.junit.jupiter.api.Test
    void NotWarsaw() {
        //Arrange
        int age = 19;
        boolean Thursday = false;
        String NotWarsawCitizen = "Krakow";
       // String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, NotWarsawCitizen, Thursday);


        //Assert
        assertEquals(0, discount);
    }


    @org.junit.jupiter.api.Test
    void Thursday() {
        //Arrange
        int age = 19;
        boolean Thursday = true;
        String NotWarsawCitizen = "Krakow";
        // String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, NotWarsawCitizen, Thursday);


        //Assert
        assertEquals(1, discount);
    }

    @org.junit.jupiter.api.Test
    void NotThursday() {
        //Arrange
        int age = 19;
        boolean Thursday = false;
        String NotWarsawCitizen = "Krakow";
        // String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, NotWarsawCitizen, Thursday);


        //Assert
        assertEquals(0, discount);
    }



    @org.junit.jupiter.api.Test
    void Warsaw_AgeBetween10And18() {
        //Arrange
        int age = 18;
        boolean Thursday = false;
       // String NotWarsawCitizen = "Krakow";
        String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double discount = Main.Getdiscount(age, isWarsawCitizen, Thursday);


        //Assert
        assertEquals(0.6, discount);
    }


    @org.junit.jupiter.api.Test
    void Discount_100() {
        //Arrange
        int discount = 1;

        double ticket_price = 40;
        // String NotWarsawCitizen = "Krakow";
        String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double FinalDiscount = Main.FinalDiscount(discount, ticket_price);


        //Assert
        assertEquals(0, FinalDiscount);
    }


    @org.junit.jupiter.api.Test
    void Discount_Morethan0() {
        //Arrange
        double discount = 0.5;

        double ticket_price = 40;
        // String NotWarsawCitizen = "Krakow";
        String isWarsawCitizen = "Warsaw";
        //  String Friday = "Friday";

        //Act
        double FinalDiscount = Main.FinalDiscount(discount, ticket_price);


        //Assert
        assertEquals(ticket_price - (ticket_price * discount), FinalDiscount);
    }




}
