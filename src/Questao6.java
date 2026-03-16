void main(){

    String senha_forte = "123456";

    for(int i=0;i<3;i++){
        String senha = IO.readln("Informe a senha: ");
        if(senha.equals(senha_forte)){
            IO.println("Bem vindo");
            break;
        }
        IO.println("Senha incorreta, tente novamente");
    }

}