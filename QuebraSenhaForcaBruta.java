import java.util.Scanner;

public class QuebraSenhaForcaBruta {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite uma senha de 4 dígitos positivos:");
    String senha = scanner.nextLine();

    if (!senha.matches("\\d{4}")) {
      System.out.println("Senha inválida! Por favor, insira uma senha com exatamente 4 dígitos.");
      return;
    }

    System.out.println("Iniciando o ataque de força bruta...");
    long inicio = System.currentTimeMillis();
    int tentativas = 0;
    String senhaQuebrada = "";

    for (int i = 0; i <= 9999; i++) {
      tentativas++;
      String tentativaAtual = String.format("%04d", i);

      if (tentativaAtual.equals(senha)) {
        senhaQuebrada = tentativaAtual;
        break;
      }
    }

    long fim = System.currentTimeMillis();

    System.out.println("Senha encontrada: " + senhaQuebrada);
    System.out.println("Número de tentativas: " + tentativas);
    System.out.println("Tempo total gasto: " + (fim - inicio) + " ms");

    scanner.close();
  }
}
