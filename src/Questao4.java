public class Questao4 extends QuestaoBase {
    public void Execute(float salarioMinimo, float salarioFuncionario, int numeroDependentes){
        double impostoBruto = 0;

        if(salarioFuncionario > salarioMinimo * 12)
            impostoBruto = salarioFuncionario * 0.2;
        
        else if(salarioFuncionario > salarioMinimo * 5)
            impostoBruto = salarioFuncionario * 0.08;
        
        if(impostoBruto > 0)
            impostoBruto = impostoBruto - (numeroDependentes * impostoBruto * 0.02);

        System.out.println(impostoBruto * 1.04);
    }
}
