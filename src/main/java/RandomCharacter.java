//import org.junit.jupiter.api.Test;
//
//import static java.lang.Character.isLetterOrDigit;
//import static org.junit.jupiter.api.Assertions.*;

public class RandomCharacter {
    public static char getChar()
    {
        return (char)(65 + Math.random() * (91-65));
    }
    public static char getRandomLowerCaseLetter()
    {
        return Character.toLowerCase(getChar());
    }
    public static char getRandomUpperCaseLetter()
    {
        return Character.toUpperCase(getChar());
    }
    public static int getRandomDigitCharacter()
    {
        return (int)(Math.random() * ((9-0)+1));
    }
    public static void main(String[] args)
    {
        String temp = "";
        System.out.println("Random Lower case character.");
        for(int i = 0; i < 15; ++i)
        {
            temp+=getRandomLowerCaseLetter()+",";
        }
        System.out.println(temp);


        temp = "";
        System.out.println("Random Upper case character.");
        for(int i = 0; i < 15; ++i)
        {
            temp+=getRandomUpperCaseLetter()+",";
        }
        System.out.println(temp);

        temp = "";
        System.out.println("Random number.");
        for(int i = 0; i < 15; ++i)
        {
            temp+=getRandomDigitCharacter()+",";
        }
        System.out.println(temp);

        temp = "";
        System.out.println("Random character.");
        for(int i = 0; i < 15; ++i)
        {
            temp+=getChar()+",";
        }
        System.out.println(temp);
    }
}
