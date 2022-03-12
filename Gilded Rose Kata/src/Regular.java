public class Regular extends Item implements Update{
    public Regular(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public void update(){
        sellIn--;
        quality--;
        if(sellIn<0){
            quality--;
        }
    }
}
