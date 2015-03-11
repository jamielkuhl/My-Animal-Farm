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
    
    
  }
}
