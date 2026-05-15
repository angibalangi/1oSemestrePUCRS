//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        System.out.println(c1.toString());
        c1.abastecerLitros(20);
        c1.abastecerReais(30);
        c1.andar(50);
        System.out.println("O carro pode andar " + c1.capacidadeDeslocamento() + "km com o combustível atual");
        System.out.println("Para andar 1000km, o carro precisa de " + c1.previsaoCombustivel(1000) + "tanques.");
    }
}