/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoIntegrador.tela;


/**
 *
 * @author maria
 */
public class CodigoParaValidacoes {
    
//    String nome = varNome.getText().trim();
//        if(validarCampoMenorQue3(nome)){
//            JOptionPane.showMessageDialog(null, "Informe um nome válido!!");
//            return true;
//        }
    
    
    //Metodos auxiliares
    
        //Validações de campos vazios    
    private boolean validaCampoVazio(String valorCampo){
        return valorCampo.equals("") || valorCampo.equals("0");
   }
    
     
    private boolean validaCpfTelefoneData(String valorCampo) {
        String primeiroCaracter = valorCampo.substring(0, 1);
        return primeiroCaracter.equals(".") || valorCampo.contains("(  )") || primeiroCaracter.equals("/");
    }
    
    
    private boolean validaEmail(String valorCampo){
        return valorCampo.equals("") || !valorCampo.contains("@") || !valorCampo.contains(".");        
    }    
    
        //Validações de campos com valor ou numero minimo de caracteres    
    private boolean validarCampoMenorQue3(String valorCampo) {
        return valorCampo.length() < 3;
    }
    
    private boolean validarValorMenorQueZero(String valorCampo){
        Double valorDouble = Double.parseDouble(valorCampo.replace(",", "."));
        return valorDouble <= 0.00;
    }
}
