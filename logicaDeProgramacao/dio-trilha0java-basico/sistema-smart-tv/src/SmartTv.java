public class SmartTv {

  boolean ligada = false;
  int canal = 1;
  int volume = 25;

  public void ligar(){
    ligada = true;
    System.out.println("TV ligada");
  }
  public void desligar(){
    ligada = true;
    System.out.println("TV desligada");
  }
  public void aumentarVolume(){
    volume++;
    System.out.println("volume aumentado: "+volume);
  }
  public void diminuirVolume(){
    volume--;
    System.out.println("volume diminuido: "+volume);
  }
  public void trocarCanal(int mudarCanal){
    canal = mudarCanal;
    System.out.println("canal trocado para "+canal);
  }
}