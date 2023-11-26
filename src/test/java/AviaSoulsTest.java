import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class AviaSoulsTest {

    @Test
    public void sortByFlightTime() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("MSK", "SPB", 800, 150, 1);
        Ticket ticket2 = new Ticket("MSK", "SPB", 700, 91, 58);
        Ticket ticket3 = new Ticket("MSK", "UFA", 2000, 100, 160);
        Ticket ticket4 = new Ticket("MSK", "SPB", 5400, 425, 9);
        Ticket ticket5 = new Ticket("UFA", "SPB", 454, 50, 5);
        Ticket ticket6 = new Ticket("MSK", "SPB", 252, 63, 4);
        Ticket ticket7 = new Ticket("NEW", "LA", 9564, 39, 8);
        Ticket ticket8 = new Ticket("MSK", "SPB", 361, 80, 6);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);
        manager.add(ticket8);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.search("MSK", "SPB", comparator);
        Ticket[] expected = {ticket1, ticket2, ticket4, ticket6, ticket8};
    }
        @Test
        public void shouldTestSort () {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket("MSK", "SPB", 800, 150, 1);
            Ticket ticket2 = new Ticket("MSK", "SPB", 700, 91, 58);
            Ticket ticket3 = new Ticket("MSK", "UFA", 2000, 100, 160);
            Ticket ticket4 = new Ticket("MSK", "SPB", 5400, 425, 9);
            Ticket ticket5 = new Ticket("UFA", "SPB", 454, 50, 5);
            Ticket ticket6 = new Ticket("MSK", "SPB", 252, 63, 4);
            Ticket ticket7 = new Ticket("NEW", "LA", 9564, 39, 8);
            Ticket ticket8 = new Ticket("MSK", "SPB", 361, 80, 6);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            manager.add(ticket5);
            manager.add(ticket6);
            manager.add(ticket7);
            manager.add(ticket8);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] actual = manager.search("MSK", "SPB");
            Ticket[] expected = {ticket2, ticket1, ticket6, ticket4, ticket8};

            Assertions.assertArrayEquals(expected, actual);
        }
        @Test
        public void findOneFlight () {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket("MSK", "SPB", 800, 150, 1);
            Ticket ticket2 = new Ticket("MSK", "SPB", 700, 91, 58);
            Ticket ticket3 = new Ticket("MSK", "UFA", 2000, 100, 160);
            Ticket ticket4 = new Ticket("MSK", "SPB", 5400, 425, 9);
            Ticket ticket5 = new Ticket("UFA", "SPB", 454, 50, 5);
            Ticket ticket6 = new Ticket("MSK", "SPB", 252, 63, 4);
            Ticket ticket7 = new Ticket("NEW", "LA", 9564, 39, 8);
            Ticket ticket8 = new Ticket("MSK", "SPB", 361, 80, 6);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            manager.add(ticket5);
            manager.add(ticket6);
            manager.add(ticket7);
            manager.add(ticket8);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] actual = manager.search("UFA", "SPB", comparator);
            Ticket[] expected = {ticket5};

            Assertions.assertArrayEquals(expected, actual);

        }
        @Test
        public void nothingFound () {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket("MSK", "SPB", 800, 150, 1);
            Ticket ticket2 = new Ticket("MSK", "SPB", 700, 91, 58);
            Ticket ticket3 = new Ticket("MSK", "UFA", 2000, 100, 160);
            Ticket ticket4 = new Ticket("MSK", "SPB", 5400, 425, 9);
            Ticket ticket5 = new Ticket("UFA", "SPB", 454, 50, 5);
            Ticket ticket6 = new Ticket("MSK", "SPB", 252, 63, 4);
            Ticket ticket7 = new Ticket("NEW", "LA", 9564, 39, 8);
            Ticket ticket8 = new Ticket("MSK", "SPB", 361, 80, 6);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            manager.add(ticket5);
            manager.add(ticket6);
            manager.add(ticket7);
            manager.add(ticket8);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            Ticket[] actual = manager.search("MSK", "Ekaterinburg", comparator);
            Ticket[] expected = {};

            Assertions.assertArrayEquals(expected, actual);

        }
        @Test
        public void compareToTicketLess () {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket("MSK", "SPB", 800, 150, 1);
            Ticket ticket2 = new Ticket("MSK", "SPB", 700, 91, 58);
            Ticket ticket3 = new Ticket("MSK", "UFA", 2000, 100, 160);
            Ticket ticket4 = new Ticket("MSK", "SPB", 5400, 425, 9);
            Ticket ticket5 = new Ticket("UFA", "SPB", 454, 50, 5);
            Ticket ticket6 = new Ticket("MSK", "SPB", 252, 63, 4);
            Ticket ticket7 = new Ticket("NEW", "LA", 9564, 39, 8);
            Ticket ticket8 = new Ticket("MSK", "SPB", 361, 80, 6);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            manager.add(ticket5);
            manager.add(ticket6);
            manager.add(ticket7);
            manager.add(ticket8);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            int actual = ticket1.compareTo(ticket4);
            int expected = -1;

            Assertions.assertEquals(expected, actual);
        }
        @Test
        public void compareToTicketMore () {
            AviaSouls manager = new AviaSouls();
            Ticket ticket1 = new Ticket("MSK", "SPB", 800, 150, 1);
            Ticket ticket2 = new Ticket("MSK", "SPB", 700, 91, 58);
            Ticket ticket3 = new Ticket("MSK", "UFA", 2000, 100, 160);
            Ticket ticket4 = new Ticket("MSK", "SPB", 5400, 425, 9);
            Ticket ticket5 = new Ticket("UFA", "SPB", 454, 50, 5);
            Ticket ticket6 = new Ticket("MSK", "SPB", 252, 63, 4);
            Ticket ticket7 = new Ticket("NEW", "LA", 9564, 39, 8);
            Ticket ticket8 = new Ticket("MSK", "SPB", 361, 80, 6);
            manager.add(ticket1);
            manager.add(ticket2);
            manager.add(ticket3);
            manager.add(ticket4);
            manager.add(ticket5);
            manager.add(ticket6);
            manager.add(ticket7);
            manager.add(ticket8);
            Comparator<Ticket> comparator = new TicketTimeComparator();

            int actual = ticket4.compareTo(ticket1);
            int expected = 1;

            Assertions.assertEquals(expected, actual);
        }
    }
