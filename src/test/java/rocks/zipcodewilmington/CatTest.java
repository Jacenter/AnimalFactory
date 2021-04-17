package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        //given
        String givenName = "Marko";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        String actualName = cat.getName();
        //then
        Assert.assertEquals(givenName, actualName);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //given
        String givenName = "Mr.Mittens";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        String expectedSpeak = "meow!";
        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        //then
        Assert.assertEquals(cat.speak(), expectedSpeak);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDayTest() {
        //given
        String givenName = "Fluffy";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //when
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Date expectedBirthDate = cat.getBirthDate();
        //then
        Assert.assertEquals(givenBirthDate, expectedBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //given
        String givenName = "Paul";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //when
        Cat cat = new Cat(givenName,givenBirthDate,givenId);
        cat.eat(new Food());
        int expectedMealsEaten = 1;
        int actualMealsEaten = cat.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expectedMealsEaten, actualMealsEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        String givenName = "Paul";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //when
        Cat cat = new Cat(givenName,givenBirthDate,givenId);
        Integer expectedId = cat.getId();
        //then
        Assert.assertEquals(givenId,expectedId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        String givenName = "Paul";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //when
        Cat cat = new Cat(givenName,givenBirthDate,givenId);
        //then
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        String givenName = "Paul";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        //when
        Cat cat = new Cat(givenName,givenBirthDate,givenId);
        //then
        Assert.assertTrue(cat instanceof Mammal);
    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
