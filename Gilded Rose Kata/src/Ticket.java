public class Ticket extends Item{
    public Ticket(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }
    public void update(){
        if(sellIn<=0){
            quality=0;
        }else{
            quality++;
            if(sellIn<=10){
                quality++;
            }
            if(sellIn<=5){
                quality++;
            }
        }
        if(quality>50){
            quality=50;
        }
        sellIn--;
    }
}
