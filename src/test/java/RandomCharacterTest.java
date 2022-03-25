import org.junit.jupiter.api.RepeatedTest;
import java.security.cert.TrustAnchor;
import static org.junit.jupiter.api.Assertions.*;

class RandomCharacterTest {

    @RepeatedTest(15)
    void TestRandomCharacters() {
        assertTrue(Character.isLetter(RandomCharacter.getChar()));
        assertTrue(Character.isLowerCase(RandomCharacter.getRandomLowerCaseLetter()));
        assertTrue(Character.isUpperCase(RandomCharacter.getRandomUpperCaseLetter()));
        assertTrue(RandomCharacter.getRandomDigitCharacter()%1==0);
    }

    @RepeatedTest(15)
    void TestPrimeNumber(){
        int num = RandomCharacter.getRandomDigitCharacter();
        boolean testcase = false;
        for(int i = 2; i <= num/2; ++i)
        {
            if(num%i==0)
            {
                testcase = true;
                System.out.println(num+" is a Prime Number");
                break;
            }
        }
        assertTrue(testcase);
    }
}