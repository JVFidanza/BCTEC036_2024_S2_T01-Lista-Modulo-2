import java.util.Arrays;

public class Questao2 extends QuestaoBase {
    public void Execute(int[] arr) {
        int length = arr.length;
        //a
        int soma = 0;
        for(int item : arr){
            soma += item;
        }
        System.err.println(soma);

        //b
        int maior = 0;
        int menor = arr[0];
        for(int item : arr){
            if(item > maior)
                maior = item;
            if(item < item)
                menor = item;
        }
        System.err.println("Menor: " + menor);
        System.err.println("Maior: " + maior);

        //c
        soma = 0;
        for(int item : arr){
            soma += item;
        }
        float media = soma/arr.length;
        System.err.println(media);

        //d
        float mediana;
        int medianaIndex;
        Arrays.sort(arr);
        length = arr.length;
        medianaIndex = (int)Math.floor(length/2);
        if(length % 2 == 0){
            float valor1 = arr[(int)medianaIndex]/3;
            mediana = ((float)arr[(int)medianaIndex - 1] + (float)arr[(int)medianaIndex])/2;
        }
        else{
            mediana = arr[(int)medianaIndex];
        }
        System.out.println(mediana);

        //e
        int moda = 0;
        int somaOut = 0;
        for(int itemOut : arr){
            int somaIn = 0;
            for(int itemIn : arr){
                if(itemIn == itemOut)
                    somaIn++;
            }
            if(somaIn > somaOut){
                somaOut = somaIn;
                moda = itemOut;
            }
        }

        System.out.println(moda);
    }
}
