import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    void testIsInvalid(){
        User u = new User("a", "aa", null, 12);
        Assertions.assertFalse(u.isValid());
    }
    @Test
    void testIsInvalidMail(){
        User u = new User("a", "aa", "aa", 14);
        Assertions.assertFalse(u.isValid());
    }
    @Test
    void testIsInvalidAge(){
        User u = new User("a@aa", "aa", "aa", 12);
        Assertions.assertFalse(u.isValid());
    }
    @Test
    void testIsInvalidNom(){
        User u = new User("a@aa", null, "aa", 14);
        Assertions.assertFalse(u.isValid());
    }

    @Test
    void testIsInvalidPrenom(){
        User u = new User("a@aa", "aa", null, 14);
        Assertions.assertFalse(u.isValid());
    }

    @Test
    void testIsvalid(){
        User u = new User("a@aa.com", "aa", "aa", 14);
        Assertions.assertTrue(u.isValid());
    }

}