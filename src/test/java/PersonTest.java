import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTest {
    @Test
   public void person_instantiatesCorrectly_True() {
        Person testPerson = new Person("Henry","[email_protected]");
        assertEquals(true, testPerson instanceof Person);
    }

    @Test
   public void getEmail_personInstantiatesWithEmail_String() {
        Person testPerson = new Person("Henry", "[email_protected]");
        assertEquals("[email_protected]", testPerson.getEmail());
    }

    @Test
     public void returns_trueIfEmailAndNameAreTheSame_True() {
        Person firstPerson = new Person("Henry","[email_protected]");
        Person anotherPerson =  new Person("Henry", "[email_protected]");
        assertTrue(firstPerson.equals(anotherPerson));
    }
}
