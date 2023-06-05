package Ex01;
public class Pokemon {
    private String nome;
    private String tipo;
    private String codigoIdentificador;
    public Pokemon(String codigoIdentificador, String nome, String tipo){
        this.nome = nome;
        this.tipo = tipo;
        this.codigoIdentificador = codigoIdentificador;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getCodigoIdentificador(){
        return codigoIdentificador;
    }
    public void setCodigoIdentificador(String codigoIdentificador){
        this.codigoIdentificador = codigoIdentificador;
    }
}
