package src;
import java.time.LocalDate;

public class Usuario {

    private String nome;
    private String email;
    private String usuario;
    private int senha;
    private String convenio;
    private String tipoConvenio;
    private LocalDate dataCadastro;
    private int numDependentes;
    private String tipoUsuario; 
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getConvenio() {
        return convenio;
    }
    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }
    public String getTipoConvenio() {
        return tipoConvenio;
    }
    public void setTipoConvenio(String tipoConvenio) {
        this.tipoConvenio = tipoConvenio;
    }
    public LocalDate getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public int getNumDependentes() {
        return numDependentes;
    }
    public void setNumDependentes(int numDependentes) {
        this.numDependentes = numDependentes;
    }
    public String getTipoUsuario() {
        return tipoUsuario;
    }
    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
    

    void efetuarCadastro(){

    }

    void efetuarLogin(){

    }

    void visualizarHistorico(){

    }

    void agendarConsulta(){

    }

    void cancelarConsulta(){

    }





    
}
