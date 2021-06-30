package src;

import java.time.LocalDate;

public class Consulta {

    private String consulta;
    private int tipoConsulta;
    private LocalDate dataConsulta;
    private String requisitos;
    private String observacoes;
    
    public String getConsulta() {
        return consulta;
    }
    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }
    public int getTipoConsulta() {
        return tipoConsulta;
    }
    public void setTipoConsulta(int tipoConsulta) {
        this.tipoConsulta = tipoConsulta;
    }
    public LocalDate getDataConsulta() {
        return dataConsulta;
    }
    public void setDataConsulta(LocalDate dataConsulta) {
        this.dataConsulta = dataConsulta;
    }
    public String getRequisitos() {
        return requisitos;
    }
    public void setRequisitos(String requisitos) {
        this.requisitos = requisitos;
    }
    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    void confimarConsulta(){

    }

    void cancelarConsulta(){

    }

    void agendarConsulta(){

    }

    void alocarMedico(){
        
    }
    
}
