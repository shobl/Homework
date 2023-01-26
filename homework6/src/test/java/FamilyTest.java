import com.abstract_classes.Pet;
import com.enums.Species;
import com.family.Family;
import com.human.Human;
import com.human.Man;
import com.human.Woman;
import com.pet.Dog;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {
    private Family family;

    private final String[] petHabits = {"клянчить вкусняшки", "прятать носки", "проситься на ручки"};

    private final Woman mother = new Woman("Вика", "Карпенко", 1974);
    private final Man father = new Man("Андрей", "Карпенко", 1965);
    private final Human child = new Human("Роман", "Карпенко", 2001);
    private final Human child2 = new Human("Наташа", "Карпенко", 1985);
    private final Pet pet = new Pet(Species.DOG, "Пулька", 3, 50, petHabits) {
        @Override
        public void respond() {

        }
    };



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

        family.addChild(this.child);
        family.setPet(pet);
        Assertions.assertEquals(family.toString(), "Family{mother=Вика Карпенко, father=Андрей Карпенко, children=[Human{name='Роман', surname='Карпенко', year=2001, iq=0, schedule=null}, null], pet=dog{nickname='Пулька', age=3, trickLevel=50, habits=[клянчить вкусняшки, прятать носки, проситься на ручки], canFly=false, hasFur=true, numberOfLegs=4}}");
    }


    @Test
    public void addChild() {

        family.addChild(child);

        assertEquals(family.getChildren()[0].getFamily(), family);
    }

    @Test
    public void deleteChildIndex() {
        family.deleteChild(1);
        System.out.println(family.countFamily());

    }


    @Test
    public void countFamily() {

        family.addChild(child);
        assertEquals(family.countFamily(), 4);

        family.addChild(child2);
        assertEquals(family.countFamily(), 5);

        family.deleteChild(1);
        family.deleteChild(0);
        assertEquals(family.countFamily(), 3);
    }
}