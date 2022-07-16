public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercicio calcular");
        calcular.soma(3 , 9);
        calcular.subtracao(8 , 4);
        calcular.multiplicacao(2 , 5);
        calcular.divisao (10,2);

        //Mensagem
        System.out.println("Obter mensagem");
        mensagem.obterMensagem ( 9 );
        mensagem.obterMensagem ( 14 );
        mensagem.obterMensagem ( 2 );

        //Emprestimo
        System.out.println("Emprestimo");
        emprestimo.Calcular (1000, emprestimo.getDuasParcelas());
        emprestimo.Calcular (1000, emprestimo.getTresParcelas());
        emprestimo.Calcular (1000, 5);
    }

}
