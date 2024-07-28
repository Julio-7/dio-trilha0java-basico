public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        smartTv.ligar();
        smartTv.aumentarVolume();
        smartTv.trocarCanal(132);
        smartTv.desligar();
    }
}
