public class Questao6 extends QuestaoBase {
    public void Execute(double massaInicial){
        double massaFinal = massaInicial;
        double segundos = 0; 
        while(true){
            massaFinal = massaFinal/2;
            segundos = segundos + 50;
            if(massaFinal <= 0.5){
                break;
            }
        }
        double horas = Math.floor(segundos/(60*60));
        double minutos = Math.floor((segundos/60) - (horas * 60));
        segundos = segundos - (horas * 60 * 60) - (minutos * 60);
        System.out.println("Massa inicial: " + massaInicial);
        System.out.println("Massa final: " + massaFinal);
        System.err.println(horas + "H " + minutos + "m " + segundos + "s");
    }
}
