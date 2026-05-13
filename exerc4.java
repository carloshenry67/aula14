import static java.lang.IO.*;
void main() {
   int soma  = 0;
    println("Os multiplos de 3 até 100: ");

    for(int i = 3; i <= 100; i++){
        if(i % 3 == 0){
            println(i);
            soma += i;
        }
    }
    print("soma total: " + soma);




}