
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MenuConsole {

    public static void main(String[] args) {

        List<Integer> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do {

            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Adicionar um número à lista");
            System.out.println("2. Listar Números");
            System.out.println("3. Listar Pares");
            System.out.println("4. Listar Ímpares");
            System.out.println("5. Atualizar número");
            System.out.println("6. Deletar Número");
            System.out.println("7. Buscar Número");
            System.out.println("8. Exibir Média dos números");
            System.out.println("9. Exibir Número Máximo e mínimo");
            System.out.println("10. Ordenar Lista");
            System.out.print("Digite o número da opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine();
            }

            switch (opcao) {
                case 1:

                    System.out.print("Digite o número para adicionar: ");
                    if (scanner.hasNextInt()) {
                        int numeroAdicionar = scanner.nextInt();
                        lista.add(numeroAdicionar);
                        System.out.println("Número adicionado com sucesso!");
                        scanner.nextLine();  // Limpar o buffer após a entrada
                    } else {
                        System.out.println("Por favor, insira um número válido.");
                        scanner.nextLine();  // Limpar o buffer
                    }
                    break;

                case 2:

                    System.out.println("Números da lista:");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        for (int numero : lista) {
                            System.out.println(numero);
                        }
                    }
                    break;

                case 3:

                    System.out.println("Números Pares da Lista:");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        boolean encontrouPares = false;
                        for (int numero : lista) {
                            if (numero % 2 == 0) {
                                System.out.println(numero);
                                encontrouPares = true;
                            }
                        }
                        if (!encontrouPares) {
                            System.out.println("Não há números pares na lista.");
                        }
                    }
                    break;

                case 4:

                    System.out.println("Números Ímpares da Lista:");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia.");
                    } else {
                        boolean encontrouImpares = false;
                        for (int numero : lista) {
                            if (numero % 2 != 0) {
                                System.out.println(numero);
                                encontrouImpares = true;
                            }
                        }
                        if (!encontrouImpares) {
                            System.out.println("Não há números ímpares na lista.");
                        }
                    }
                    break;

                case 5:

                    System.out.println("Atualizar número na lista");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia:");
                    } else {
                        System.out.println("Digite o índice do número que você deseja atualizar:");
                        int indice = scanner.nextInt();

                        if (indice >= 0 && indice < lista.size()) {
                            System.out.println("Digite um novo número:");
                            int novoNumero = scanner.nextInt();

                            lista.set(indice, novoNumero);
                            System.out.println("Número atualizado com sucesso!");
                        } else {
                            System.out.println("Índice inválido, tente novamente.");
                        }
                    }
                    break;

                case 6:

                    System.out.println("Deletar número na lista");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia:");
                    } else {
                        System.out.println("Digite o número que você quer deletar:");
                        int numeroRemover = scanner.nextInt();

                        if (lista.contains(numeroRemover)) {
                            lista.remove(Integer.valueOf(numeroRemover));
                            System.out.println("Número " + numeroRemover + " deletado com sucesso!");
                        } else {
                            System.out.println("O número " + numeroRemover + " não foi encontrado na lista.");
                        }
                    }
                    break;

                case 7:

                    System.out.println("Buscar o número na lista:");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia");
                    } else {
                        System.out.println("Digite o número que deseja buscar:");
                        int numeroBuscar = scanner.nextInt();

                        if (lista.contains(numeroBuscar)) {
                            System.out.println("Número " + numeroBuscar + " encontrado na lista");
                        } else {
                            System.out.println("Número " + numeroBuscar + " não encontrado na lista.");
                        }
                    }
                    break;

                case 8:
                    System.out.println("Calculando a média dos números da lista:");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia");
                    } else {
                        int soma = 0;
                        for (int numero : lista) {
                            soma += numero;

                        }
                        double media = (double) soma / lista.size();
                        System.out.println("A media dos números é:" + media);
                    }
                    break;

                case 9:
                    System.out.println("Exibindo Número Máximo e Mínimo da lista:");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia");
                    } else {
                        int max = lista.get(0);
                        int min = lista.get(0);

                        for (int numero : lista) {
                            if (numero > max) {
                                max = numero;
                            }
                            if (numero < min) {
                                min = numero;
                            }
                        }

                        System.out.println("Número Máximo:" + max);
                        System.out.println("Número Mínimo:" + min);
                    }
                    break;

                case 10:
                    System.out.println("Ordenando a lista...");
                    if (lista.isEmpty()) {
                        System.out.println("A lista está vazia");
                    } else {
                        Collections.sort(lista);
                        System.out.println("Lista ordenada em ordem crescente");
                        for (int numero : lista) {
                            System.out.println(numero);
                        }
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
