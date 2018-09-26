package observable.java;

public class Uppercase implements WordObservable {
    private int total = 0;

    @Override
    public void notifyWord(String word) {

        if(Character.isUpperCase(word.charAt(0))) {
            total++;
        }
    }

    @Override
    public int wordsCounted() {
        return total;
    }
}
