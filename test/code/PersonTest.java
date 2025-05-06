package code;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person jack;
    Person arson;
    Person jared;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        jack = new Person(0 , "Jack");
        arson = new Person(0 , "Arson");
        jared = new Person(0 , "Jared");
    }

    @org.junit.jupiter.api.Test
    void addCharge() {
    }

    @org.junit.jupiter.api.Test
    void removeCharge() {
    }

    @org.junit.jupiter.api.Test
    void getTotalDebt() {
    }

    @org.junit.jupiter.api.Test
    void setTotalDebt() {
    }

    @org.junit.jupiter.api.Test
    void getCharge() {
        jack.addCharge(new Money(1.0));
        assertEquals(1.0 , jack.getTotalDebt());
    }

    @org.junit.jupiter.api.Test
    void setCharge() {
    }

    @org.junit.jupiter.api.Test
    void getName() {
        assertEquals("Jack" , jack.getName());
        assertEquals("Arson" , arson.getName());
        assertEquals("Jared" , jared.getName());
    }

    @org.junit.jupiter.api.Test
    void setName() {
    }
}