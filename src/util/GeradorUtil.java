/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author silvio.junior
 */
public class GeradorUtil {

    /**
     * Retorna um valor String conforme a quantidade de número solicitado
     *
     * @param qtde
     * @return
     */
    public String gerarNumero(int qtde) {
        String senha = "";
        int numero;
        for (int i = 0; i < qtde; i++) {
            numero = (int) (Math.random() * 10);
            senha = senha + numero;
        }
        return senha;
    }

    public String gerarCpf() {
        return gerarNumero(3) + "." + gerarNumero(3) + "." + gerarNumero(3) + "-"
                + gerarNumero(2);
    }

    public double gerarSalario() {
        int numero = (int) (Math.random() * 100000);
        return numero;
    }

    public String gerarCnpj() {
        return gerarNumero(2) + "." + gerarNumero(3) + "."
                + gerarNumero(3) + "/0001-" + gerarNumero(2);
    }

    public String gerarTelefoneFixo() {
        return "(48)3" + gerarNumero(3) + "-" + gerarNumero(4);
    }

    public String gerarTelefoneCelular() {
        return "(48)9" + gerarNumero(4) + "-" + gerarNumero(4);
    }

    //99999-999
    public String gerarCep() {
        return gerarNumero(5) + "-" + gerarNumero(3);
    }

    public String gerarNome() {
        String[] nomes = {"Silvio", "João", "Maria", "Pedro", "Lucas",
            "José", "Marisa", "Tânia", "Sueli", "Tati", "Antônio",
            "Francisco", "Giogio", "Samara", "Hugo", "Mariele", "William",
            "Suelen", "Otavio", "Ana", "Claudio", "Claudia"};
        int tamanhoLista = nomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return nomes[indice] + " " + gerarSobrenome();
    }
    
    private String gerarSobrenome(){
        String[] sobrenomes = {"Silva", "Motto", "Mota", "Oliveira",
            "Abravaneu", "Rocha", "Pereira", "Pires", "Percicotte",
            "Santos", "Souza", "Zen", "Stark", "Peixes", "Fischer",
            "Smitch", "Tango", "Carvalho", "Peixoto", "Alves",
            "Almeida", "Parker"};
        int tamanhoLista = sobrenomes.length;
        int indice = (int) (Math.random() * tamanhoLista);
        return sobrenomes[indice];
    }

    public static void main(String[] args) {
        GeradorUtil util = new GeradorUtil();

        String nome = util.gerarNome();
        System.out.println("Nome: " + nome);

    }
}
