public class TiposVariaveis {
    public static void main(String[] args) {

        /*if = "?"; else = ":"; */

        int a, b;
        a = 2;
        b = 2;

        String resultado = a == b ?"verdadeiro" : "falso";

        /*podemos usar o "equals" para comparar se 
        os conteudos dos objetos são iguais. */
        System.out.println(resultado);

        String nomeUm = "lohan";
        String nomeDois = new String("lohan");

        System.out.println(nomeUm.equals(nomeDois));
    }
}
