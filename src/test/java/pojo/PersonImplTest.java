package pojo;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * @ClassName : PersonImplTest
 * @Description : My test
 * @Author : Caoguodong
 * @Date: 2020-07-09
 */

public class PersonImplTest {
    private Person testPerson = new PersonImpl();

    @Test
    public void getFirstName() {
        System.out.println(testPerson.getFirstName());
    }

    @Test
    public void getLastName() {
        System.out.println("getLastName,start!");
        System.out.println(testPerson.getLastName());
    }

    @Test
    public void getFullName() {
        System.out.println(testPerson.getFullName());
    }
}