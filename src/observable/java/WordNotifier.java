package observable.java;

import java.util.ArrayList;
import java.util.List;

public class WordNotifier {

    private List<WordObservable> observers = new ArrayList<>();

    public void addObserver(WordObservable wordObservable){
        observers.add(wordObservable);
    }

    public List<WordObservable> getObservers() {
        return observers;
    }

    public void wordProcessing( String phrase ){
        String[] words = phrase.split(" ");
        for (String word : words) {
            observers.forEach(s -> s.notifyWord(word));
        }
    }
}
