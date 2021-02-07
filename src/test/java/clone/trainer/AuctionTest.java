package clone.trainer;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class AuctionTest {

    @Test
    public void testClone() {
        Auction auction = new Auction (5, LocalDateTime.parse("2018-01-01T12:00"),
                new User("Joe"),
                new Product("Computer")
        );

        Auction another = new Auction(auction);

        assertEquals(5, another.getPrice());
        assertEquals(LocalDateTime.parse("2018-01-01T12:00"), another.getStart());


        auction.setPrice(10);
        auction.setStart(LocalDateTime.parse("2018-01-01T15:00"));

        assertEquals(10, auction.getPrice());  //ha az eredeti árát változtatom, az változik, de...
        assertEquals(5, another.getPrice());  //a másolat értéke nem változik.
        assertEquals(LocalDateTime.parse("2018-01-01T15:00"), auction.getStart());
        assertEquals(LocalDateTime.parse("2018-01-01T12:00"), another.getStart());  //ez a módosítás sem hatott a másolatra.

        assertEquals("Joe", another.getUser().getName());
        auction.getUser().setName("Jack");
        assertEquals("Jack", auction.getUser().getName());
        assertEquals("Jack", another.getUser().getName());  //Figyelni kell: a másolatban is megváltozott a név!!

        assertEquals("Computer", another.getProduct().getName());
        auction.getProduct().setName("Computer2");
        assertEquals("Computer2", auction.getProduct().getName());
        assertEquals("Computer", another.getProduct().getName());       //A másolatban nem változott meg a Product. deepClone-t alkalmaztunk!!
    }

}