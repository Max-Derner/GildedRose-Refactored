public class Legendary extends Item{
    public Legendary(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }
    public void update(){
        quality=80;
    }
}
