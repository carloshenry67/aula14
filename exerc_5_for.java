import static java.lang.IO.*;
void main() {
    float soma = 0f;
    float media = 0f;
    float maior = Integer.MIN_VALUE;
    float menor = Integer.MAX_VALUE;
    float soma_par = 0f;
    float soma_impar = 0f;
    float impar = 0f;
    float par = 0f;

    for (int i = 1; i <=5; i++){
        int num = Integer.parseInt(readln("Digite um número: "));
        soma = soma + num;
        media = soma / 5;
        if (num > maior){
            maior = num;
        }
        if( num < menor){
            menor = num;
        }
        if(num % 2 == 0){
            soma_par += num;
            par += 1;
        }
        else{
            soma_impar += num;
            impar += 1;
        }
    }
    print("soma = " + soma);

    println("Média = " + media);
    println("Maior = " + maior);
    println("Menor = " + menor);
    println("Soma de pares = " + soma_par);
    println("soma de impares: " + soma_impar);
    println("Números impares = " + impar);
    println("Números pares = " + impar);

}