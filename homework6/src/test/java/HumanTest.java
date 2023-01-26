import com.human.*;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HumanTest {
    private final Woman mother = new Woman("Mom", "Family", 2000);
    private final Human child = new Human("Baby", "Family", 2023);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testToString() {
        assertEquals(mother.toString(), "Woman{name='Mom', surname='Family', year=2000, iq=0, schedule=null}");
        assertEquals(child.toString(), "Human{name='Baby', surname='Family', year=2023, iq=0, schedule=null}");
    }


}