public class Carro {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private double kilometragem;
    private double capacidadeTanque;
    private double qtdCombustivel;
    private double consumo;

    public Carro (){
        placa = "JBK4625";
        marca = "Fiat";
        modelo = "Uno";
        cor = "Prata";
        kilometragem = 0;
        capacidadeTanque = 40;
        qtdCombustivel = 0;
        consumo = 12;
    }
    public Carro (String placa, String marca, String modelo, String cor, double kilometragem, double capacidadeTanque, double qtdCombustivel, double consumo){
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.kilometragem = kilometragem;
        this.capacidadeTanque = capacidadeTanque;
        this.qtdCombustivel = qtdCombustivel;
        this.consumo = consumo;
    }

    public String toString () { return ("Placa: " + placa +
    "\nMarca: " + marca +
    "\nModelo: " + modelo +
            "\nCor: " + cor +
            "\nQuilometros andados: " + kilometragem +
            "\nCapacidade do tanque: " + capacidadeTanque +
            "\nCombustível: " + qtdCombustivel +
            "\nConsumo médio: " + consumo); }

    public void abastecerLitros (double litros) {
        double backup = qtdCombustivel;
        this.qtdCombustivel += litros;
        if (this.qtdCombustivel>this.capacidadeTanque) {
            System.out.println("O combustível excede a capacidade do tanque por " + (qtdCombustivel - backup) + " litros.");
            qtdCombustivel = backup;
        }
    }

    public void abastecerReais (double reais) {
        double backup = qtdCombustivel;
        this.qtdCombustivel += reais/6.65;
        if (this.qtdCombustivel>this.capacidadeTanque) {
            System.out.println("O combustível excede a capacidade do tanque por "+ (qtdCombustivel-backup)+ " litros.");
            qtdCombustivel = backup;
        }
    }

    public void andar (double kilometros) {
        double backup = qtdCombustivel;
        this.qtdCombustivel -= kilometros/consumo;
        this.kilometragem += kilometros/consumo;
        if (this.qtdCombustivel<0) {
            this.qtdCombustivel = backup;
            System.out.println("Não tem combustível o suficiente");
        }
    }

    public double capacidadeDeslocamento () {
        return qtdCombustivel*consumo;
    }

    public double previsaoCombustivel (double kilometros){
        return kilometros/capacidadeTanque*consumo;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void setQtdCombustivel(double qtdCombustivel) {
        this.qtdCombustivel = qtdCombustivel;
    }
}
