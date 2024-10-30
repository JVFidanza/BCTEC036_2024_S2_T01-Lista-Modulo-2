public class Execute {
    public static void main(String[] args) throws Exception {
        new Questao1().Execute();

        Questao2 questao2 = new Questao2();
        int[] array2 = new int[]{1, 2, 3, 2, 4, 4, 4, 6};
        questao2.Execute(array2);

        Questao3 questao3 = new Questao3();
        char[] array3_1 = new char[]{'a', 'b', 'm'};
        questao3.Execute(array3_1);
        char[] array3_2 = new char[]{'a', 'b', 'a'};
        questao3.Execute(array3_2);

        Questao4 questao4 = new Questao4();
        questao4.Execute(1000, 7000, 20);

        Questao5 questao5 = new Questao5();
        String[] array5 = {"palavra", "teste"};
        questao5.Execute(array5);

        Questao6 questao6 = new Questao6();
        questao6.Execute(20000);

        Questao7 questao7 = new Questao7();
        double[] array7_a1 = new double[]{1,2,3};
        double[] array7_a2 = new double[]{1,2,3};
        double[] array7_a3 = new double[]{1,2,3, 4};
        questao7.ItemA(array7_a1, array7_a2, array7_a3);
        questao7.CalcularSomas();
    }
}
