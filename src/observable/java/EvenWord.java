package observable.java;

public class EvenWord implements WordObservable {

    private int total = 0;

    @Override
    public void notifyWord(String word) {
        if(word.length() % 2 == 0){
            total++;
        }
    }

    @Override
    public int wordsCounted() {
        return total;
    }
}
