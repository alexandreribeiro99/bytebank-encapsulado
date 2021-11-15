
package com.mycompany.bytebank.encapsulado;


public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        Conta conta2 = new Conta(1331,24211);
        System.out.println(Conta.getTotal());
    }
}
