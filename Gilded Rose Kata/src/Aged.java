public class Aged extends Item{
    public Aged(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }
    public void update(){
        quality++;
        if(sellIn<0){
            quality++;
        }
        if(quality>50){
            quality=50;
        }
        sellIn--;
    }
}
