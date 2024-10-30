public class Questao5 extends QuestaoBase{
    public boolean isVowel(char character){
        char[] vowels = {'a','e','i','o','u'};
        for (char s : vowels) {
            if (character == s)
                return true;
        }
        return false;
    }  

    public void Execute(String[] namesArr){
        for(String word : namesArr){
            for(char character : word.toCharArray()){
                if(isVowel(character))
                    System.out.println(character + " é vogal");
                else{
                    System.out.println(character + " não é vogal");
                }
            }
        }
        
    }
}
