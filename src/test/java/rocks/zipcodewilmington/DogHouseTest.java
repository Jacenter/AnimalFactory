package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testAddDog() {
        DogHouse.add(new Dog("Milo", new Date(), 0));
        Integer dogsBefore = DogHouse.getNumberOfDogs() + 1;
        DogHouse.add(new Dog("Rocky", new Date(), 1));
        Assert.assertEquals(dogsBefore, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogByIdTest() {
        DogHouse.add(new Dog("Milo", new Date(), 0));
        DogHouse.add(new Dog("Rocky", new Date(), 1));
        Integer dogsBefore = DogHouse.getNumberOfDogs() - 1;
        DogHouse.remove(0);
        Assert.assertEquals(dogsBefore, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogTest() {
        Dog dog = new Dog("Joey", new Date(), 7);
        DogHouse.add(new Dog("Milo", new Date(), 0));
        DogHouse.add(new Dog("Rocky", new Date(), 1));
        DogHouse.add(dog);
        Integer dogsBefore = DogHouse.getNumberOfDogs() -1;
        DogHouse.remove(dog);
        Assert.assertEquals(dogsBefore, DogHouse.getNumberOfDogs());
    }

    @Test
    public void getDogByIdTest() {
        Dog dog = new Dog("Joey", new Date(), 7);
        DogHouse.add(new Dog("Milo", new Date(), 0));
        DogHouse.add(new Dog("Rocky", new Date(), 1));
        DogHouse.add(dog);
        Assert.assertEquals(dog, DogHouse.getDogById(dog.getId()));
    }

    @Test
    public void getNumberOfDogsInDogHouseTest() {
        DogHouse.add(new Dog("Milo", new Date(), 0));
        Integer dogsBefore = DogHouse.getNumberOfDogs() + 1;
        DogHouse.add(new Dog("Rocky", new Date(), 1));
        Assert.assertEquals(dogsBefore, DogHouse.getNumberOfDogs());
    }


    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
