package br.iesb.androidiesb.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Paulo on 24/11/2017.
 */

public class Escola {

    @SerializedName("nome")
    private String nome;
    @SerializedName("rede")
    private String rede;
    @SerializedName("email")
    private String email;
    @SerializedName("esferaAdministrativa")
    private String esferaAdministrativa;
    @SerializedName("qtdAlunos")
    private Double qtdAlunos;

    public Escola(String oString, String string, String email, String nome, String rede) {

        this.nome = nome;
        this.rede = rede;
        this.email = this.email;
        this.esferaAdministrativa = esferaAdministrativa;
        this.qtdAlunos = qtdAlunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRede() {
        return rede;
    }

    public void setRede(String rede) {
        this.rede = rede;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEsferaAdministrativa() {
        return esferaAdministrativa;
    }

    public void setEsferaAdministrativa(String esferaAdministrativa) {
        this.esferaAdministrativa = esferaAdministrativa;
    }

    public Double getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(Double qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }


    @Override
    public String toString() {
        return "Escola{" +
                "nome='" + nome + '\'' +
                ", rede='" + rede + '\'' +
                ", email='" + email + '\'' +
                ", esferaAdministrativa='" + esferaAdministrativa + '\'' +
                ", qtdAlunos=" + qtdAlunos +
                '}';
    }
}
