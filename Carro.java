class Carro {
    String modelo;
    String cor;
    int ano;

   Carro(String modelo, String cor, int ano) {
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
   }

   public void acelerar() {
    System.out.println("O carro " + modelo + " está acelerando.");
   }
    
}