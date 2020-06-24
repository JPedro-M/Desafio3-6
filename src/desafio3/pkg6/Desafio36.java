package desafio3.pkg6;
import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author troll
 */
public class Desafio36 {
    public static void main(String[] args) {
        DecimalFormat formato = new DecimalFormat("0.00");
        Scanner ler = new Scanner(System.in);
        int codigoAluno;
        double nota1, nota2, nota3, media, nota1g, nota2g, nota3g;
        
        System.out.println("Qual o código do aluno?");
        codigoAluno = ler.nextInt();
        System.out.println("Qual a primeira nota(1 a 4)?");
        nota1 = ler.nextInt();
        System.out.println("Qual a segunda nota(1 a 3)?");
        nota2 = ler.nextInt();
        System.out.println("Qual a terceira nota(1 a 3)?");
        nota3 = ler.nextInt();
        
        nota1 = 10*nota1/4;
        nota2 = 10*nota2/3;
        nota3 = 10*nota3/3;     
        media = (nota1+nota2+nota3)/3;
        
        if (media >=5) {
            System.out.println("Código de aluno:"+codigoAluno+"\nNota 1:"+formato.format(nota1)+"\nNota 2:"+formato.format(nota2)+"\nNota 3:"+formato.format(nota3)+"\nMedia:"+formato.format(media)+"\nAprovado");
        }else {
            System.out.println("Código de aluno:"+codigoAluno+"\nNota 1:"+formato.format(nota1)+"\nNota 2:"+formato.format(nota2)+"\nNota 3:"+formato.format(nota3)+"\nMedia:"+formato.format(media)+"\nReprovado");
        }
    }
    
}
