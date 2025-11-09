
public class Bins {

    private int[] bins;
    private int  minValue;
    private int  maxValue;

    public Bins(int minValue, int maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        bins = new int[maxValue - minValue + 1];
    }
    public Integer getBin(int value) {
        if (value < minValue && value > maxValue) {
            return null;
        }
            int index = value - minValue;
            return bins[index];
    }
    public void incrementBin(int value) {
        if (value < minValue && value > maxValue) {
            return;
        }
        int index = value - minValue;
        bins[index]++;
    }

    public int getMinValue() {
        return minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }
    public void clear() {
        for (int i = 0; i < bins.length; i++) {
            bins[i] = 0;
        }
    }   
}
