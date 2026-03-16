void main() {
    double fatorial = fatorial(-4);
    if(fatorial < 0) IO.println("Não existe fatorial de negativos");
    else IO.println(fatorial);
}

public double fatorial(double numero){
    //TODO: Ajustar depois para usar exceções
    if(numero<0) return -1;
    if(numero == 0 || numero==1) return 1;
    return numero*fatorial(numero-1);
}