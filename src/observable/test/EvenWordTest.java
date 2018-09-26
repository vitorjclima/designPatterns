package observable.test;

import observable.java.EvenWord;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenWordTest {

    @Test
    public void isNotEvenWordTest(){
        EvenWord evenWord = new EvenWord();
        evenWord.notifyWord("green");
        assertEquals(0, evenWord.wordsCounted());
    }

    @Test
    public void isEvenWordTest(){
        EvenWord evenWord = new EvenWord();
        evenWord.notifyWord("blue");
        assertEquals(1, evenWord.wordsCounted());
    }
}
