class Main {
  public static void main(String[] args) {

    Guitar guitar = new Guitar();
    guitar.sound();

    // 3. Create an object of each new type of instrument that you created.

    Piano piano = new Piano();
    piano.sound();

    Violin violin = new Violin();
    violin.sound();

    Drum drum = new Drum();
    drum.sound();




    // 4. Call the sound() method on each of them.


    // Notice how each sound() method is different but all inherit from the same abstract class.
    
  }
}