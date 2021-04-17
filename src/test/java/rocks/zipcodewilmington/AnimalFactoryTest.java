package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreatingADog() {
        //given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        //when
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);
        //then
        Assert.assertEquals(givenName, dog.getName());
        Assert.assertEquals(givenBirthDate, dog.getBirthDate());
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreatingACat() {
        //given
        String givenName = "Mr.Mittens";
        Date givenBirthDate = new Date();
        //when
        Cat cat = AnimalFactory.createCat(givenName,givenBirthDate);
        //then
        Assert.assertEquals(givenName, cat.getName());
        Assert.assertEquals(givenBirthDate, cat.getBirthDate());
    }
}
