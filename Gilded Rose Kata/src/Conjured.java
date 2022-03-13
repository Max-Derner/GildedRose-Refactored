public class Conjured extends Item{
    public Conjured(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }
    public void update(){
        quality-=2;
        if(sellIn<=0){
            quality-=2;
        }
        if(quality<0){
            quality=0;
        }
        sellIn--;
    }
}
