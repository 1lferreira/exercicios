package fesc.fafic.edu.erros.Model;

public class Erros {

    public void ClassCastException(){
        try {
            Object obj = new Integer(10);
            String str = (String) obj;
            System.out.println(str);
        } catch(ClassCastException e) {
            System.err.println(e);
        } finally {
            System.out.println("Não é possível criar um objeto da classe Object como Integer.");
        }
    }

    public void ArithmeticException(){
        try {
            int num1 = 10;
            int num2 = 0;
            int resultado = num1 / num2;
            System.out.println("O resultado é: " + resultado);
        } catch (ArithmeticException e) {
            System.err.println(e);
        } finally {
            System.out.println("Não é possível realizar divisão por zero.");
        }
    }

    public void NullPointerException(){
        try {
            String texto = null;
            System.out.println(texto.length());
        } catch(NullPointerException e){
            System.err.println(e);
        } finally {
            System.out.println("Não é possível medir o comprimento de uma variável com o valor 'Null'.");
        }
    }

    public void NumberFormatException() {
        try {
            String texto = "abc";
            int numero = Integer.parseInt(texto);
            System.out.println(numero);
        } catch (NumberFormatException e) {
            System.err.println(e);
        } finally {
            System.out.println("Não é possível converter objetos do tipo String em Integer.");
        }
    }

    public void IndexOutOfBoundsException(){
        try{
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e);
        } finally {
            System.out.println("Não é possível imprimir um número que não está dentro do alcance do vetor.");
        }
    }

}
