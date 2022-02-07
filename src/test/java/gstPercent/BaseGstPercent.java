package gstPercent;

public abstract class BaseGstPercent {
    abstract int getGstPercent();

    public  final int getGstOnElectronics(){
        return 15;
    }
    public final  int getGstOnAutoMobiles(){return 10;}
}
