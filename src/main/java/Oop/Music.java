package Oop;

import java.util.ArrayList;

/**
 * @author zy
 * @date 2022/5/24 23:19
 */
class Instrument {
    public void play(){
    System.out.println("Instrument is playing...");
    }
}

class Wind extends Instrument{
    @Override
    public void play() {
    System.out.println("Wind is playing...");
    }
}

class Percussion extends  Instrument{
    @Override
    public void play() {
    System.out.println("percussion is playing ....");
    }
}

public class Music {
  public static void main(String[] args) {
    //
      ArrayList<Instrument> instruments = new ArrayList<>();
      instruments.add(new Wind());
      instruments.add(new Percussion());
      for (Instrument instrument : instruments){
          instrument.play();
      }

  }
}
