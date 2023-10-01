public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal Atual? R:" + smartTv.canal);  
        smartTv.mudarCanal(13);  
        System.out.println("Canal Atual? R:" + smartTv.canal);      

        System.out.println("Tv ligada? R:" + smartTv.ligada);
        System.out.println("Canal Atual? R:" + smartTv.canal);
        System.out.println("Volume Atual? R:" + smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? R:" + smartTv.ligada);
        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? R:" + smartTv.ligada);
    }
}
