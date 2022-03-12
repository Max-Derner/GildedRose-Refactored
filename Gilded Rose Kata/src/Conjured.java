public class Conjured extends Item  implements Update{
    public Conjured(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }
    public void update(){
        sellIn--;
        quality-=2;
        if(sellIn<0){
            quality-=2;
        }
    }
}
