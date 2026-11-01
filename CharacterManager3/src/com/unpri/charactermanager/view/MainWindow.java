package com.unpri.charactermanager.view;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.util.ArrayList;
import com.unpri.charactermanager.model.Character;

public class MainWindow extends JFrame {

    private JPanel mainPanel;
    private ArrayList<Character> characterList;
    private double averageLevel;   // hasil hitungan dari Model, hanya ditampilkan

    public MainWindow(ArrayList<Character> characterList, double averageLevel) {
        super("Character Manager v0.3");
        this.characterList = characterList;
        this.averageLevel = averageLevel;

        initComponents();

        setSize(500, 450);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS)); // daftar vertikal

        JLabel titleLabel = new JLabel("=== Daftar Karakter (" + characterList.size() + ") ===");
        mainPanel.add(titleLabel);

        for (Character c : characterList) {
            String info = c.getName() + " | " + c.getType() +
                        " | Lv." + c.getLevel() +
                        " | HP:" + c.getHitPoints() +
                        " | ATK:" + c.getAttackPower();
            mainPanel.add(new JLabel(info));
        }

        // JLabel statistik di paling bawah (hanya format teks, tanpa kalkulasi)
        JLabel statsLabel = new JLabel("Rata-rata Level: " + String.format("%.1f", averageLevel));
        mainPanel.add(statsLabel);

        add(mainPanel);
    }
}