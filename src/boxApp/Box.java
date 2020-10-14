package boxApp;

public class Box {

    private int volume;

    public Box(int volume) {

        if (volume < 0 && volume % 2 == 0){
            System.out.println("Volume cannot be less than 0 and can`t be fractions number");
        }else{
            this.volume = volume;
        }
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    void add(Shape shape){
        if (shape.getVolume() <= this.volume){
            this.setVolume(this.getVolume() - shape.getVolume());
            System.out.println("boxApp.Shape added to box");
        }else{
            System.out.println("boxApp.Shape didn`t add to box");
        }
    }
}
