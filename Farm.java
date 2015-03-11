public class Farm
{
  public static void main(String[] a)
  {
    World wref = new World();
    JamiePenguin ex1 = new JamiePenguin(wref);

    Seahorse nicholas=new Seahorse(wref);
    nicholas.forward(-90);
    nicholas.turn(-180);
    nicholas.forward(-45);
    nicholas.turn(180);

    ExampleGiraffe nick = new ExampleGiraffe(wref);
    
    nick.forward(-90);
    nick.turn(45);
    nick.forward(100);
    nick.turn(90);
    nick.turn(-45);
    nick.backward(100);
    nick.turn(-45);
    nick.backward(100);
    nick.turn(-45);

  }
}
