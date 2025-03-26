package com.saahild;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingUtilities;

public class FractalGenerator extends JFrame {
    private final DrawingPanel drawingPanel = new DrawingPanel();
    private JSlider depthSlider;
    private JComboBox<String> fractalSelector;
    private int depth = 4;
    private String selectedFractal = "Koch Snowflake";

    public FractalGenerator() {
        super("Fractal Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        add(createControlPanel(), BorderLayout.WEST);
        add(drawingPanel, BorderLayout.CENTER);
        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private JPanel createControlPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        fractalSelector = new JComboBox<>(new String[]{"Koch Snowflake", "Sierpinski Triangle", "Fractal Tree"});
        fractalSelector.addActionListener(e -> {
            selectedFractal = (String) fractalSelector.getSelectedItem();
            drawingPanel.repaint();
        });
        panel.add(createLabeledComponent("Fractal Type", fractalSelector));

        depthSlider = new JSlider(0, 10, depth);
        depthSlider.setMajorTickSpacing(2);
        depthSlider.setPaintTicks(true);
        depthSlider.setPaintLabels(true);
        depthSlider.addChangeListener(e -> {
            depth = depthSlider.getValue();
            drawingPanel.repaint();
        });
        panel.add(createLabeledComponent("Recursion Depth", depthSlider));

        JButton resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> {
            depthSlider.setValue(4);
            fractalSelector.setSelectedIndex(0);
        });
        panel.add(resetButton);

        return panel;
    }

    private JPanel createLabeledComponent(String label, JComponent component) {
        JPanel panel = new JPanel(new BorderLayout());
        panel.add(new JLabel(label), BorderLayout.NORTH);
        panel.add(component, BorderLayout.CENTER);
        return panel;
    }

    private class DrawingPanel extends JPanel {
        public DrawingPanel() {
        setBackground(Color.decode("#1e1e2e")); 
        setForeground(Color.decode("#cba6f7"));
        }
        
        @Override protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            int width = getWidth(), height = getHeight();
            if ("Koch Snowflake".equals(selectedFractal)) {
                drawKochSnowflake(g2d, 50, height - 100, width - 50, height - 100, depth);
            } else if ("Sierpinski Triangle".equals(selectedFractal)) {
                int[] x = {width / 2, 50, width - 50};
                int[] y = {50, height - 50, height - 50};
                drawSierpinski(g2d, x, y, depth);
            } else {
                drawFractalTree(g2d, width / 2, height - 100, -Math.PI / 2, depth);
            }
        }
        
        private void drawKochSnowflake(Graphics2D g, double x1, double y1, double x2, double y2, int depth) {
            if (depth == 0) {
                g.drawLine((int) x1, (int) y1, (int) x2, (int) y2);
            } else {
                double dx = x2 - x1, dy = y2 - y1;
                double xA = x1 + dx / 3, yA = y1 + dy / 3;
                double xB = x1 + 2 * dx / 3, yB = y1 + 2 * dy / 3;
                double xC = (x1 + x2) / 2 + Math.sqrt(3) * (y1 - y2) / 6;
                double yC = (y1 + y2) / 2 + Math.sqrt(3) * (x2 - x1) / 6;
                drawKochSnowflake(g, x1, y1, xA, yA, depth - 1);
                drawKochSnowflake(g, xA, yA, xC, yC, depth - 1);
                drawKochSnowflake(g, xC, yC, xB, yB, depth - 1);
                drawKochSnowflake(g, xB, yB, x2, y2, depth - 1);
            }
        }
        
        private void drawSierpinski(Graphics2D g, int[] x, int[] y, int depth) {
            if (depth == 0) {
                g.fillPolygon(x, y, 3);
            } else {
                int[] x1 = {(x[0] + x[1]) / 2, x[1], (x[1] + x[2]) / 2};
                int[] y1 = {(y[0] + y[1]) / 2, y[1], (y[1] + y[2]) / 2};
                int[] x2 = {x[0], (x[0] + x[1]) / 2, (x[0] + x[2]) / 2};
                int[] y2 = {y[0], (y[0] + y[1]) / 2, (y[0] + y[2]) / 2};
                int[] x3 = {(x[0] + x[2]) / 2, (x[1] + x[2]) / 2, x[2]};
                int[] y3 = {(y[0] + y[2]) / 2, (y[1] + y[2]) / 2, y[2]};
                drawSierpinski(g, x1, y1, depth - 1);
                drawSierpinski(g, x2, y2, depth - 1);
                drawSierpinski(g, x3, y3, depth - 1);
            }
        }
        
        private void drawFractalTree(Graphics2D g, int x1, int y1, double angle, int depth) {
            if (depth == 0) return;
            int x2 = x1 + (int) (Math.cos(angle) * depth * 10);
            int y2 = y1 + (int) (Math.sin(angle) * depth * 10);
            g.drawLine(x1, y1, x2, y2);
            drawFractalTree(g, x2, y2, angle - Math.PI / 6, depth - 1);
            drawFractalTree(g, x2, y2, angle + Math.PI / 6, depth - 1);
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(FractalGenerator::new);
    }
}
