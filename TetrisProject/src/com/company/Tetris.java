package com.company;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Tetris extends JFrame {

    private JLabel statusbar1;
    private JLabel statusbar2;


    public Tetris() {

        initUI();
    }

    private void initUI() {

        statusbar1 = new JLabel("Score :");
        statusbar2 = new JLabel("Figure №");
        add(statusbar1, BorderLayout.SOUTH);
//        add(statusbar2, BorderLayout.SOUTH);
        var board = new Board(this);
        add(board);
        board.start();
        setTitle("Tetris");
        setSize(200, 420);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

    }

    JLabel getStatusBar1() {

        return statusbar1;
    }
    JLabel getStatusbar2(){
        return statusbar2;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Tetris();
            game.setBackground(Color.GRAY);
            game.setVisible(true);
        });
    }
}