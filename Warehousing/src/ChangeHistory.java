import java.util.ArrayList;

public class ChangeHistory {
    private ArrayList<Double> list;

    public ChangeHistory(){
        list = new ArrayList<>();
    }

    public void add(double status) {
        list.add(status);
    }

    public void clear() {
        list.clear();
    }

    @Override
    public String toString() {
        return list.toString();
    }

    public double maxValue() {
        Double max = 0.0;
        for (Double item : list) {
            if (item > max) max = item;
        }
        return max;
    }

    public double minValue() {
        if (list.isEmpty()) return 0.0;

        Double min = list.get(0);

        for (Double item : list) {
            if (item < min) min = item;
        }
        return min;
    }

    public double average() {
        Double sum = 0.0;
        for (Double item : list ) {
            sum += item;
        }
        return sum / list.size();
    }
}
