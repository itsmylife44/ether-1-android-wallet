package rehanced.com.simpleetherwallet.views;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

public class ethoFormatter implements IAxisValueFormatter {

    private boolean dispalyInUsd;

    public ethoFormatter(boolean dispalyInUsd) {
        this.dispalyInUsd = dispalyInUsd;
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {
        if (dispalyInUsd) {
            return value >= 0 ? String.format("%.2f", value) : "";
        } else {
            return value >= 0 ? String.format("%.0f", value * 100000000) : "";
        }
    }
}
