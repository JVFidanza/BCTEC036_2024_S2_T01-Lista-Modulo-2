public class Questao7 extends QuestaoBase{
    public double[] somaGeralVetor = new double[3];
    public double[] produtoGeralVetor = new double[3];
    public double[] mediaGeralVetor = new double[3];

    public void ItemA(double[] vetor1, double[] vetor2, double[] vetor3){
        double soma, produto;
        double media;
        double[][] vetorDeVetores = {vetor1, vetor2, vetor3};
        int index = 0;
        
        for(double[] vetor : vetorDeVetores){
            soma = 0;
            produto = 1;
            media = 0;
            for(double item : vetor){
                soma += item;
                produto *= item;  
            }
            media = (float)soma/vetor.length;
            System.out.println("Soma = " + soma);
            System.out.println("Produto = " + produto);
            System.out.println("Media = " + media);
            somaGeralVetor[index] = soma;
            produtoGeralVetor[index] = produto;
            mediaGeralVetor[index] = media;

            index++;
        }
    }

    public void CalcularSomas(){
        double somaDasSomas;
        double somaDosProdutos;
        double somaDasMedias;

        somaDasSomas = SomarVetor(somaGeralVetor);
        somaDosProdutos = SomarVetor(produtoGeralVetor);
        somaDasMedias = SomarVetor(mediaGeralVetor);
        
        System.out.println("Soma das somas = " + somaDasSomas);
        System.out.println("Soma dos produtos = " + somaDosProdutos);
        System.out.println("Soma das medias = " + somaDasMedias);
    }

    public double SomarVetor(double[] vetor){
        double soma = 0;
        for(double item : vetor){
            soma += item;
        }

        return soma;
    }
}
