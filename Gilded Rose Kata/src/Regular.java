public class Regular extends Item{
    public Regular(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public void update(){
        quality--;
        if(sellIn<=0){
            quality--;
        }
        if(quality<0){
            quality=0;
        }
        sellIn--;
    }
}
