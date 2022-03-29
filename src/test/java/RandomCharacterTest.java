import org.junit.jupiter.api.RepeatedTest;
import java.security.cert.TrustAnchor;
import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {

    @RepeatedTest(15)
    void TestRandomCharacters() {
        char randomchar = RandomCharacter.getChar();
        char lowerCase = RandomCharacter.getRandomLowerCaseLetter();
        char upperCase = RandomCharacter.getRandomUpperCaseLetter();
        int number = RandomCharacter.getRandomDigitCharacter();
        System.out.println("Random character: " + randomchar);
        System.out.println("Lower Case: " + lowerCase);
        System.out.println("Upper Case: " + upperCase);
        System.out.println("Number: " + number);
        assertTrue(Character.isLetter(randomchar));
        assertTrue(Character.isLowerCase(lowerCase));
        assertTrue(Character.isUpperCase(upperCase));
        assertTrue(number%1==0);
    }

    @RepeatedTest(15)
    void TestPrimeNumber(){
        int num = RandomCharacter.getRandomDigitCharacter();
        boolean testcase = false;
        System.out.print(num);
        if(num == 0 || num == 1)
        {
            System.out.print(" is not a prime");
            assertTrue(false);
        }

        for(int i = 2; i <= (num/2); i++)
        {
            if(num%i==0)
            {
                testcase = true;
                System.out.print(" is not a prime");
                break;
            }
        }
        if(!testcase)
        {
            System.out.print(" is a prime");
        }
        assertFalse(testcase);
    }
}