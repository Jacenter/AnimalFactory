package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void addCatTest() {
        CatHouse.add(new Cat("Mr.Mittens", new Date(), 0));
        Integer catsBefore = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(new Cat("Rocky", new Date(), 1));
        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatByIdTest() {
        CatHouse.add(new Cat("Mr.Mittens", new Date(), 0));
        CatHouse.add(new Cat("Rocky", new Date(), 1));
        Integer catsBefore = CatHouse.getNumberOfCats() - 1;
        CatHouse.remove(0);
        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatTest() {
        Cat cat = new Cat("Joey", new Date(), 7);
        CatHouse.add(new Cat("Mr.Mittens", new Date(), 0));
        CatHouse.add(new Cat("Rocky", new Date(), 1));
        CatHouse.add(cat);
        Integer catsBefore = CatHouse.getNumberOfCats() -1;
        CatHouse.remove(cat);
        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }

    @Test
    public void getCatByIdTest() {
        Cat cat = new Cat("Joey", new Date(), 7);
        CatHouse.add(new Cat("Mr.Mittens", new Date(), 0));
        CatHouse.add(new Cat("Rocky", new Date(), 1));
        CatHouse.add(cat);
        Assert.assertEquals(cat, CatHouse.getCatById(cat.getId()));
    }

    @Test
    public void getNumberOfCatsTest() {
        CatHouse.add(new Cat("Mr.Mittens", new Date(), 0));
        Integer catsBefore = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(new Cat("Rocky", new Date(), 1));
        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }


}
