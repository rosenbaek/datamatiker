import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ObjectsTest {

    @Test
    void getName() {
        Objects obj = new Objects("Christian", 26);
        String expected = "Christian";
        String actual = obj.getName();
        assertEquals(expected,actual);
    }


    @Test
    void getAge() {
        Objects obj = new Objects("Christian", 26);
        int expected = 25;
        int actual = obj.getAge();
        assertNotEquals(expected,actual);
    }

}