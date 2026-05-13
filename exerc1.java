import static java.lang.IO.*;
void main() {
        String senha = "4321";
        String mensagem = "";
        for(int tentativas = 1; tentativas <= 3; tentativas++){
            IO.print("Digite uma senha: ");
            String senha_fornecida = readln();

            if(senha_fornecida.equals(senha)){
                mensagem = "liberado";
                break;
            } else {
                mensagem = "negado";
            }
        }
        IO.println("Acesso: " + mensagem);
        IO.print("Fim do programa!");
    }
    
