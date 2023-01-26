import com.enums.Species;
import com.family.Family;
import com.human.Human;
import com.human.Man;
import com.human.Woman;
import com.pet.Dog;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {
    private Family family;

    private final Set<String> petHabits = new HashSet<>(Arrays.asList("клянчить вкусняшки", "прятать носки", "проситься на ручки"));

    private final Woman mother = new Woman("Вика", "Карпенко", 1974);
    private final Man father = new Man("Андрей", "Карпенко", 1965);
    private final Human child1 = new Human("Роман", "Карпенко", 2001);
    private final Human child2 = new Human("Наташа", "Карпенко", 1985);
    private final Dog pet = new Dog(Species.DOG, "Пулька", 3, 50, petHabits);


    @BeforeEach
    void setUp() {
        family = new Family(mother, father);
    }

    @AfterEach
    void tearDown() {
        family = null;
    }

    @Test
    public void testToString() {
        assertEquals(family.toString(), "Family{mother=Вика Карпенко, father=Андрей Карпенко, children=[], pets=[]}");

        family.addPet(this.pet);
        assertEquals(family.toString(), "Family{mother=Вика Карпенко, father=Андрей Карпенко, children=[], pets=[dog{nickname='Пулька', age=3, trickLevel=50, habits=[прятать носки, клянчить вкусняшки, проситься на ручки], canFly=false, hasFur=true, numberOfLegs=4}]}");

    }


    @Test
    public void addChild(Human child1) {

        family.addChild(this.child1);

        assertEquals(family.getChildren().get(0).getFamily(), family);
    }

    @Test
    public void deleteChildIndex() {
        family.deleteChild(1);
        System.out.println(family.countFamily());

    }


    @Test
    public void countFamily() {

        family.addChild(child1);
        assertEquals(family.countFamily(), 3);

        family.addChild(child2);
        assertEquals(family.countFamily(), 4);

        family.deleteChild(1);
        family.deleteChild(0);
        assertEquals(family.countFamily(), 2);
    }
}