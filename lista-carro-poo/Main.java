public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Honda Civic", "Preto", 2009);
        Carro carro2 = new Carro("Toyota Corolla", "Branco", 2015);
        System.out.println(carro1.modelo + " - " + carro1.cor + " - " + carro1.ano);
        System.out.println(carro2.modelo + " - " + carro2.cor + " - " + carro2.ano);
        carro1.acelerar();
        carro2.acelerar();
    }
}
