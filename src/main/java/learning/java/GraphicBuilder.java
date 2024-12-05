package learning.java;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

import javax.swing.*;

public class GraphicBuilder {

    // Створення даних для графіка
    public static XYSeriesCollection createDataset() {
        XYSeries series = new XYSeries("y = x^2 - 4x + 3");
        double[] extremum = Function.findExtremum();

        // Точки графіка
        for (double x = -2; x <= 6; x += 0.1) {
            series.add(x, Function.f(x));
        }

        // Додаю екстремум
        XYSeries extremumPoint = new XYSeries("Екстремум");
        extremumPoint.add(extremum[0], extremum[1]);

        // Формую набір даних
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(series);
        dataset.addSeries(extremumPoint);

        return dataset;
    }

    // Створення панелі з графіком
    public static JPanel createChartPanel() {
        XYSeriesCollection dataset = createDataset(); // Використовуємо дані
        JFreeChart chart = ChartFactory.createXYLineChart(
                "Графік функції з екстремумом",
                "X",
                "Y",
                dataset,
                PlotOrientation.VERTICAL,
                true,
                true,
                false
        );

        return new ChartPanel(chart);
    }
}