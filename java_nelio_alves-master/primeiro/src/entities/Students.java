package entities;

public class Students {
    public String name;
    public double firstNote;
    public double secondNote;
    public double thirdNote;

    public double media(){
        return (firstNote + secondNote + thirdNote) / 3;
    }

    public double MinMedia(){
        if(media() < 60.0){
            return 60.0 - media();
        } else{
            return 0.0;
        }
    }

}

