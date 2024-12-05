package learning.java;

import static org.junit.jupiter.api.Assertions.*;

import org.jfree.chart.JFreeChart;
import org.jfree.data.xy.XYDataset;
import org.junit.jupiter.api.Test;

import javax.swing.*;

class GraphicBuilderTest {

    @Test
    void testCreateChartPanel() {
        JPanel panel = GraphicBuilder.createChartPanel();
        assertNotNull(panel, "Chart panel не повинен бути null");
        assertTrue(panel instanceof JPanel, "Об'єкт має бути JPanel");
    }

    @Test
    void testChartData() {
        XYDataset dataset = GraphicBuilder.createDataset();
        assertNotNull(dataset, "Dataset не повинен бути null");
        assertEquals(2, dataset.getSeriesCount(), "Має бути 2 серії: функція та екстремум");
    }

}