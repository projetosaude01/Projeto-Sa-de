package src;

import java.time.LocalDate;

public class Historico {

    private String consulta;
    private int tipoConsulta;
    private LocalDate dataConsulta;
    private boolean finalizada;
    private float valor;
    private int tipoPagamento;
    
    
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
    public boolean isFinalizada() {
        return finalizada;
    }
    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public int getTipoPagamento() {
        return tipoPagamento;
    }
    public void setTipoPagamento(int tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    void finalizarConsulta() {

    }

    void alerarParamentro(){

    }

    void receberAcompanhamento(){
        
    }

    
    
}
