import org.junit.jupiter.api.Test;

import com.company.Dog;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SampleTest {

    @Test
    public void shouldSayDogsAreEqual() {

        Dog dog1 = new Dog();
        dog1.setAge(3);
        dog1.setColor("Brown");
        dog1.setFavToy("Squeaky");

        Dog dog2 = new Dog();
        dog2.setAge(3);
        dog2.setColor("Brown");
        dog2.setFavToy("Squeaky");

        assertEquals(dog1, dog2);

    }

}