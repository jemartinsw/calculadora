import javax.swing.JOptionPane; //Importa da biblioteca (pacote) javax, módulos swing e componente JOptionPane

public class Addition //Declara classe addition
{//Inicia bloco de código da classe addition
   public static void main(String[] args)//declara o método principal que executa a classe
   {//inicia bloco de codigo do método principal que ira executar a aplicação
      String firstNumber = 
         JOptionPane.showInputDialog("Enter first integer");//declara variável firstnumber
      String secondNumber =
          JOptionPane.showInputDialog("Enter second integer");//declara variável secondnumber

      int number1 = Integer.parseInt(firstNumber); //converte string em número
      int number2 = Integer.parseInt(secondNumber);//converte string em número

      int sum = number1 + number2; // insere a função soma

      JOptionPane.showMessageDialog(null, "The sum is " + sum, 
         "Sum of Two Integers", JOptionPane.PLAIN_MESSAGE);//mostra a mensagem do resultado final da soma
   } //termina bloco de código do método principal
} // termina bloco de código da classe Addition
