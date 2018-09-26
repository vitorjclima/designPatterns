package observable.test;


import observable.java.EvenWord;
import observable.java.Uppercase;
import observable.java.WordNotifier;
import observable.java.Words;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordNotifierTest {

    @Test
    public void wordProcessingTest() {
        WordNotifier wordNotifier = new WordNotifier();
        wordNotifier.addObserver(new Words());
        wordNotifier.addObserver(new Uppercase());
        wordNotifier.addObserver(new EvenWord());

        wordNotifier.wordProcessing("Three easy words");

        assertEquals(3, wordNotifier.getObservers().get(0).wordsCounted());
        assertEquals(1, wordNotifier.getObservers().get(1).wordsCounted());
        assertEquals(1, wordNotifier.getObservers().get(2).wordsCounted());
    }


}
