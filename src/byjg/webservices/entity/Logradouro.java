/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package byjg.webservices.entity;

/**
 *
 * @author Dayse
 */
public class Logradouro {

    private String endereco;
    private String bairro;
    private String municipio;
    private String estado;
    private String codMunNFe;

    /**
     * @return the endereco
     */
    public String getEndereco() {
        return endereco;
    }

    /**
     * @param endereco the endereco to set
     */
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    /**
     * @return the bairro
     */
    public String getBairro() {
        return bairro;
    }

    /**
     * @param bairro the bairro to set
     */
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    /**
     * @return the municipio
     */
    public String getMunicipio() {
        return municipio;
    }

    /**
     * @param municipio the municipio to set
     */
    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the codMunNFe
     */
    public String getCodMunNFe() {
        return codMunNFe;
    }

    /**
     * @param codMunNFe the codMunNFe to set
     */
    public void setCodMunNFe(String codMunNFe) {
        this.codMunNFe = codMunNFe;
    }

}
