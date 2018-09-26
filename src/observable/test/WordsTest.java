package observable.test;

import observable.java.Words;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordsTest {

    @Test
    public void notifyWordTest(){
        Words words = new Words();
        words.notifyWord("test");
        assertEquals(1, words.wordsCounted());
    }

}
