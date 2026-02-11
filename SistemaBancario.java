import java.util.Scanner;

// Simulação de um Sistema Bancário Simples
// Focado em Lógica de Programação e POO (Programação Orientada a Objetos)

class Conta {
    private String titular;
    private double saldo;

    // Construtor
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Método para Depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    // Método para Sacar (com validação de saldo)
    public void sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido.");
        }
    }

    // Método para consultar saldo
    public void exibirSaldo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo Atual: R$ " + String.format("%.2f", saldo));
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Bem-vindo ao Banco Java ---");
        System.out.println("Criando sua conta...");
        
        // Instanciando o objeto Conta
        Conta minhaConta = new Conta("Kauã Almeida", 0.0);
        
        // Simulando operações
        minhaConta.depositar(1000.00); // Depósito inicial
        minhaConta.sacar(250.00);      // Pagamento de contas
        minhaConta.sacar(100.00);      // Lazer
        
        // Exibindo estado final
        System.out.println("\n--- Extrato Final ---");
        minhaConta.exibirSaldo();
        
        scanner.close();
    }
}
