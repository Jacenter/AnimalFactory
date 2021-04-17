package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testConstructor() {
        //given
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        //when
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String expectedName = dog.getName();
        Date expectedBirthDate = dog.getBirthDate();
        Integer expectedId = dog.getId();
        //then
        Assert.assertEquals(givenName, expectedName);
        Assert.assertEquals(givenBirthDate, expectedBirthDate);
        Assert.assertEquals(givenId, expectedId);

    }

    // TODO - Create tests for `speak`
    @Test
    public void testDogSpeak() {
        //given
        String expectedSpeak = "bark!";
        //when
        Dog dog = new Dog(null,null,null);
        //then
        Assert.assertEquals(dog.speak(), expectedSpeak);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDay() {
        //given
        Date givenBirthDate = new Date();
        //when
        Dog dog = new Dog(null,null,null);
        dog.setBirthDate(givenBirthDate);
        Date expectedBirthDate = dog.getBirthDate();
        //then
        Assert.assertEquals(givenBirthDate, expectedBirthDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testDogEat() {
        //when
        Dog dog = new Dog(null,null,null);
        dog.eat(new Food());
        int expectedMealsEaten = 1;
        int actualMealsEaten = dog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expectedMealsEaten,actualMealsEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        //given
        Integer givenId = 1;
        //when
        Dog dog = new Dog(null,null,givenId);
        Integer actualId = dog.getId();
        //then
        Assert.assertEquals(givenId,actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        //when
        Dog dog = new Dog(null,null,null);
        //then
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        //when
        Dog dog = new Dog(null,null,null);
        //then
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
