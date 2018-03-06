package idv.carl.di.lab.spring5dilab;

/**
 * @author Carl Lu
 */
public class DummySource {

    private String ycaKey;
    private String ycaValue;

    public String getYcaKey() {
        return ycaKey;
    }

    public void setYcaKey(String ycaKey) {
        this.ycaKey = ycaKey;
    }

    public String getYcaValue() {
        return ycaValue;
    }

    public void setYcaValue(String ycaValue) {
        this.ycaValue = ycaValue;
    }

    @Override
    public String toString() {
        return "DummySource{" + "ycaKey='" + ycaKey + '\'' + ", ycaValue='" + ycaValue + '\'' + '}';
    }
    
}
