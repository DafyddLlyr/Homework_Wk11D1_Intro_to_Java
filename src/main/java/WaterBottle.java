public class WaterBottle {
    private int volume = 100;

    public int getVolume(){
        return this.volume;
    }

    public void sip(){
        if (this.volume >= 10) {
            this.volume -= 10;
        } else {
            this.volume = 0;
        }

    }

    public void empty(){
        this.volume = 0;
    }

    public void fill(){
        this.volume = 100;
    }

}
