public class Carro {

    //atributos
    private String marca;
    private String modelo;
    private int anoFabricação;
    private double velocAtual;

    //construtor
    public Carro (String marca, String modelo, int anoFabricação, double velocAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricação = anoFabricação;
        this.velocAtual = velocAtual;
    }

     // método para acelerar o carro
     public void acelerar(int aumentoVelocidade) {
        if (aumentoVelocidade >= 0) {
            velocAtual += aumentoVelocidade;
        } else {
            System.out.println("não é possível acelerar com um valor negativo.");
        }
    }

    // método para desacelerar o carro
    public void desacelerar(int reducaoVelocidade) {
        if (reducaoVelocidade >= 0) {
            if (velocAtual >= reducaoVelocidade) {
                velocAtual -= reducaoVelocidade;
            } else {
                System.out.println("não é possível desacelerar abaixo de zero.");
            }
        } else {
            System.out.println("não é possível desacelerar com um valor negativo.");
        }
    }

    //get 
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricação() {
        return anoFabricação;
    }

    public double getVelocAtual() {
        return velocAtual;
    }
    
}
