public class Cliente {
    private String nome;
    private String email;

    public Cliente(String nome, String email){
        this.nome = nome;
        this.email = email;
        validarEmail(email);
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void validarEmail(String email){
        if(email.contains("@")){
            return;
        }
        else{
            throw new RuntimeException("ERRO: email inválido");
        }
    }
}
