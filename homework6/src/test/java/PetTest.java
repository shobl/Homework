import com.abstract_classes.Pet;
import com.enums.Species;

import com.pet.Bird;
import com.pet.Spider;

import com.pet.DomesticCat;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PetTest {
    private final String[] catHabits = {"ловить мышей", "дряпать диван", "воровать еду"};
    private final String[] birdHabits = {"постоянно болтать", "рассыпать еду", "нецензурно выражаться"};
    private final String[] spiderHabits = {"убегать из банки", "пугать соседей"};

    private  final String[] pitonHabits = {"есть раз в неделю", "вить гнездо под кроватью", "пробовать съесть кота"};

    private final DomesticCat catPet = new DomesticCat(Species.DOMESTIC_CAT, "Помпон", 5, 90, catHabits);
    private final Bird birdPet = new Bird(Species.BIRD, "Пират", 7, 95, birdHabits);
    private final Spider spiderPet = new Spider(Species.SPIDER, "Монстр", 1, 30, spiderHabits);

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void testToString() {
        assertEquals(catPet.toString(), "cat{nickname='Помпон', age=5, trickLevel=90, habits=[ловить мышей, дряпать диван, воровать еду], canFly=false, hasFur=true, numberOfLegs=4}");
        assertEquals(birdPet.toString(), "bird{nickname='Пират', age=7, trickLevel=95, habits=[постоянно болтать, рассыпать еду, нецензурно выражаться], canFly=true, hasFur=false, numberOfLegs=2}");
        assertEquals(spiderPet.toString(), "spider{nickname='Монстр', age=1, trickLevel=30, habits=[убегать из банки, пугать соседей], canFly=false, hasFur=false, numberOfLegs=8}");
    }

}