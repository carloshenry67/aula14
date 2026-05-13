import static java.lang.IO.*;
void main() {
    print("João = 1\nMaria = 2\nNulo = 0");

    int joao = 0;
    int maria= 0;
    int nulo = 0;
    for(int i = 1; i <= 10; i++){
        int voto = Integer.parseInt(readln("\nEm quem você quer votar?"));
        if (voto == 1){
            joao++;
        }else if(voto == 2){
            maria++;
        }else {
            nulo++;
        }
    }
   if(joao > maria) {
       print("João venceu!!!");
   }
   else if(maria> joao){
       print("Maria venceu");
    }else{
       print("Empate");
    }

}