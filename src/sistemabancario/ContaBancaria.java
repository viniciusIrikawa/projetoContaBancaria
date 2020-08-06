/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemabancario;

public class ContaBancaria {
    private String nomeCliente;
    private String numeroConta;
    private double saldo;
    
    
    public ContaBancaria(){
    }
    
    public ContaBancaria(String nomeCliente, String numeroConta, double saldo){
        this.nomeCliente = nomeCliente;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }
    
    public void sacar(double valor){   //Fazer um loop de validacao.
        if(saldo < valor){
            System.out.println("Não foi possível realizar o saque. Valor acima do saldo.");
        }
        else{
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Saldo disponível: " + saldo);
        }
    }
    public void depositar(double valor){
        saldo += valor;
        System.out.println("Valor depositado: " + valor);
        System.out.println("Saldo disponível: " + saldo);
    }
    
    public String getNomeCliente(){
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }
    
    public String getNumeroConta(){
        return numeroConta; 
    }
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Conta Bancaria{" + "Nome do cliente = " + nomeCliente + ", Número da conta = " + numeroConta + ", saldo = " + saldo + '}';
    }
    
    
    
}
