/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import entidade.Aluno;
import javax.swing.JOptionPane;

/**
 *
 * @author silvio.junior
 */
public class TestaAluno {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João");
        
        System.out.println("Nome: " + aluno.getNome());
         
        
//        aluno.sobrenome = JOptionPane.showInputDialog("Digite o sobrenome do aluno");
//        aluno.idade = JOptionPane.showInputDialog("Digite a idade");
//
//        aluno.salario = Float.parseFloat(JOptionPane.
//                                           showInputDialog("Digite o salário"));
//        
//        aluno.cpf = Long.parseLong(JOptionPane.
//                                           showInputDialog("Digite o cpf"));

//        JOptionPane.showMessageDialog(null, "Nome: " + aluno.nome
//                + " " + aluno.sobrenome + "\nIdade: " + aluno.idade
//                + "\nSalário: " + aluno.salario + "\nCPF: " + aluno.cpf);

    }
}
