/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package main;

import byjg.webservices.sms.*;
import byjg.webservices.cep.*;
import byjg.webservices.entity.Logradouro;

/**
 *
 * @author jg
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        try
        {
            /*SMSService sms = new SMSService();
            System.out.println(sms.obterVersao());
            System.out.println(sms.enviarSMS("85", "81349678", "Mensagem de teste", "gribeiro", "dinho#10"));
            System.out.println(sms.creditos("gribeiro", "dinho#10"));*/

            Logradouro log = new Logradouro();

            CEPService cep = new CEPService();
            String versao = cep.obterVersao();
            String logradouro = cep.obterLogradouro("60165090", "gribeiro", "dinho#10");
            //System.out.println("Versão do Consulta CEP : " + versao);
            //System.out.println("Resultado da Pesquisa : "+ logradouro);
            int posPrimeiraVirgula = logradouro.indexOf(",");
            int posSegundaVirgula = logradouro.indexOf(",", posPrimeiraVirgula+2);
            int PosTerceiraVirgula = logradouro.indexOf(",", posSegundaVirgula+ 2);
            int posQuartaVirgula = logradouro.lastIndexOf(",");
            String endereco = logradouro.substring(0, posPrimeiraVirgula).trim();
            String bairro = logradouro.substring(posPrimeiraVirgula+1, posSegundaVirgula).trim();
            String municipio = logradouro.substring(posSegundaVirgula+2, PosTerceiraVirgula).trim();
            String estado = logradouro.substring(PosTerceiraVirgula + 1, posQuartaVirgula).trim();
            String codMunNFe = logradouro.substring(posQuartaVirgula+1).trim();

            log.setEndereco(endereco);
            log.setBairro(bairro);
            log.setMunicipio(municipio);
            log.setEstado(estado);
            log.setCodMunNFe(codMunNFe);

            System.out.println("Endereço : "+log.getEndereco());
            System.out.println("Bairro   : "+log.getBairro());
            System.out.println("Municipio: "+log.getMunicipio());
            System.out.println("Estado   : "+log.getEstado());
            System.out.println("Cod.NF-e : "+log.getCodMunNFe());


            //System.out.println(cep.obterCEP("avenida virgílio távora", "ceará", "ce", "gribeiro", "dinho#10"));
        }
        catch (Exception ex)
        {
            System.out.println(ex.getMessage());
        }
    }

}
