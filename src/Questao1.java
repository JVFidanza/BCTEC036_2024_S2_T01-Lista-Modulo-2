public class Questao1 extends QuestaoBase {
    public void Execute(){
        // a
        for(int i = 1; i <= 100; i++){
            System.out.println(i);
        }

        //b
        for(int i = 100; i >= 1; i--){
            System.out.println(i);
        }

        //c
        for(int i = 0; i <= 100; i = i + 2){
            System.out.println(i);
        }

        //d
        for(int i = 0; i <= 100; i = i + 3){
            System.out.println(i);
        }

        //e
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0)
                System.out.println(i);
        }

        //f
        for(int i = 0; i <= 1000; i++){
            if(i % 4 == 0)
                System.out.println(i);
        }
    }
}