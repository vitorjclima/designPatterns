package observable.java;

public class Words implements WordObservable {

    private int total = 0;

    @Override
    public void notifyWord(String word) {
        total++;
    }

    @Override
    public int wordsCounted() {
        return total;
    }
}
