import java.util.Arrays;

public class Questao3 extends QuestaoBase {
    public void Execute(char[] word){
        char[] reverseWord = new char[word.length];
        for(int i = word.length - 1; i >= 0; i--){
            reverseWord[word.length - 1 - i] = word[i];
        }

        if(Arrays.equals(word, reverseWord))
            System.out.println("é um palindromo");
        else
            System.out.println("não é um palindromo");
    }
}
