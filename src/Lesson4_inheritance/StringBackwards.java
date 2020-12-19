package Lesson4_inheritance;

/**
 * Created by Maryam Askari
 * Date: 11/12/2020
 * Time: 10:50 AM
 * Project: IntelliJ IDEA
 */
public class StringBackwards implements CharSequence{
    public String word;

    public StringBackwards(String word){
        this.word=word;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        return word.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        end= word.length();
        start=0;
        String eachWord;
        for (int i=start;i<end;i++){
            word.split(" ");

        }
        return null;
    }



}
