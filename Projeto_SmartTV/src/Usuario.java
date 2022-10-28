public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        


        System.out.println("TV ligada ? " + smartTv.ligada);
        System.out.println("volume atual: " + smartTv.canal);
        System.out.println("canal atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println("novo status -> TV ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("novo status -> TV ligada ? " + smartTv.ligada);
    }
}
