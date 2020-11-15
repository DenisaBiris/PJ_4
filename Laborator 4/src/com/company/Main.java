package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    private static int correct_guesses=0;
    private static int wrong_guesses=0;
    private static int result;


    private static String[] questions = {
            "Which of the following plants contains the most caffeine?",
            "What are the short-term effects of caffeine?",
            "Which receptors in the brain does caffeine bind to?",
            "Which of the following is a medical use of caffeine?",
            "The meaning of the term “espresso” is… "
    };
    private static String[][] options = {
            {"Robusta coffee beans", "Arabica coffee beans", "Cocoa nuts", "Tea leaves"},
            {"Dilated pupils", "Increased body temperature", "Increased urination", "All of the above"},
            {"Cannabinoid", "Adenosine", "Serotonin", "Opiate"},
            {"Controlling the onset of epileptic seizures", "Treating premature-born babies for apnoea", " A substitute drug in methamphetamine addiction", " Bringing sedated post-op patients around earlier"},
            {"Forced out", "Expressive", "Both", "None of this"}
    };
    private static int total_questions=questions.length;

    private static JButton NextButton1;
    private static JButton NextButton2;
    private static JButton NextButton3;
    private static JButton NextButton4;
    private static JButton SaveButton;



    public static void main(String[] args) {
        JPanel jPanel = buildPanel();
       addActiontToButton1(jPanel);

    }
    private static void addActiontToButton1(JPanel jPanel) {

        NextButton1.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        jPanel.removeAll();
                        placeComponents2(jPanel);
                        jPanel.updateUI();
                        addActiontToButton2(jPanel);

                    }});}
    private static void addActiontToButton2(JPanel jPanel) {

        NextButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jPanel.removeAll();
                        placeComponents3(jPanel);
                        jPanel.updateUI();
                        addActiontToButton3(jPanel);
                    }});}
    private static void addActiontToButton3(JPanel jPanel) {

        NextButton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jPanel.removeAll();
                        placeComponents4(jPanel);
                        jPanel.updateUI();
                        addActiontToButton4(jPanel);
                    }});}
    private static void addActiontToButton4(JPanel jPanel) {

        NextButton4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jPanel.removeAll();
                        placeComponents5(jPanel);
                        jPanel.updateUI();
                        addActiontToButton5(jPanel);




                    }});}
    private static void addActiontToButton5(JPanel jPanel) {

        SaveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        jPanel.removeAll();

                        jPanel.updateUI();
                        placeComponents6(jPanel);




                    }});}


    private static JPanel buildPanel() {
        JFrame frame = new JFrame("WELCOME TO THE COFFEE QUIZ");
        frame.setSize(1000,650);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents1(panel);
        frame.setVisible(true);
        return panel;
    }

    private static void placeComponents1(JPanel panel) {
        panel.setLayout(null);
        JLabel textfield = new JLabel();
        JLabel textarea = new JLabel();

        textfield.setBounds(10, 20, 100, 25);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(255, 60, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,30));
        textfield.setHorizontalAlignment(JTextField.CENTER);

        textarea.setBounds(10,50,1000,50);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(255, 152,0));
        textarea.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelA = new JCheckBox();
        answer_labelA.setFont(new Font("MV Boli",Font.BOLD,35));

        JCheckBox answer_labelB = new JCheckBox();
        answer_labelB.setFont(new Font("MV Boli",Font.BOLD,35));

        JCheckBox answer_labelC = new JCheckBox();
        answer_labelC.setFont(new Font("MV Boli",Font.BOLD,35));

        JCheckBox answer_labelD = new JCheckBox();
        answer_labelD.setFont(new Font("MV Boli",Font.BOLD,35));

        textfield.setBounds(0,0,650,50);
        answer_labelA.setBounds(125,100,500,100);
        answer_labelB.setBounds(125,200,500,100);
        answer_labelC.setBounds(125,300,500,100);
        answer_labelD.setBounds(125,400,500,100);



        textfield.setText("Question "+1);

        textarea.setText(questions[0]);
        answer_labelA.setText(options[0][0]);
        answer_labelB.setText(options[0][1]);
        answer_labelC.setText(options[0][2]);
        answer_labelD.setText(options[0][3]);
        panel.add(textfield);
        panel.add(textarea);
        panel.add(answer_labelA);
        panel.add(answer_labelB);
        panel.add(answer_labelC);
        panel.add(answer_labelD);

        NextButton1 = new JButton(">>");
        NextButton1.setBounds(200,500,100,25);
        panel.add(NextButton1);


            NextButton1.addActionListener(
                    new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            if(answer_labelB.isSelected() && answer_labelD.isSelected()) {
                                correct_guesses++;
                               JOptionPane.showMessageDialog(null,"Congrats!");
                            }
                            else {
                                wrong_guesses++;
                                JOptionPane.showMessageDialog(null,"Nope");
                            }

                        }});}


    private static void placeComponents2(JPanel panel) {
        panel.setLayout(null);
        JLabel textfield = new JLabel();
        JLabel textarea = new JLabel();

        textfield.setBounds(10, 20, 100, 25);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(255, 60, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,30));
        textfield.setHorizontalAlignment(JTextField.CENTER);

        textarea.setBounds(10,50,1000,50);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(255, 152,0));
        textarea.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelA = new JCheckBox();
        answer_labelA.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelB = new JCheckBox();
        answer_labelB.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelC = new JCheckBox();
        answer_labelC.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelD = new JCheckBox();
        answer_labelD.setFont(new Font("MV Boli",Font.BOLD,25));
        textfield.setBounds(0,0,650,50);
        answer_labelA.setBounds(125,100,500,100);
        answer_labelB.setBounds(125,200,500,100);
        answer_labelC.setBounds(125,300,500,100);
        answer_labelD.setBounds(125,400,500,100);


        textfield.setText("Question "+2);
        textarea.setText(questions[1]);
        answer_labelA.setText(options[1][0]);
        answer_labelB.setText(options[1][1]);
        answer_labelC.setText(options[1][2]);
        answer_labelD.setText(options[1][3]);
        panel.add(textfield);
        panel.add(textarea);
        panel.add(answer_labelA);
        panel.add(answer_labelB);
        panel.add(answer_labelC);
        panel.add(answer_labelD);
        NextButton2 = new JButton(">>");
        NextButton2.setBounds(200,500,100,25);
        panel.add(NextButton2);

        NextButton2.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(answer_labelA.isSelected() && answer_labelB.isSelected() && answer_labelC.isSelected() && answer_labelD.isSelected()) {
                            correct_guesses++;
                            JOptionPane.showMessageDialog(null,"Congrats!");
                        }
                        else {
                            wrong_guesses++;
                            JOptionPane.showMessageDialog(null,"Nope");
                        }

                    }});}

    private static void placeComponents3(JPanel panel) {
        panel.setLayout(null);
        JLabel textfield = new JLabel();
        JLabel textarea = new JLabel();
        textfield.setBounds(10, 20, 80, 25);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(255, 60, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,30));
        textfield.setHorizontalAlignment(JTextField.CENTER);

        textarea.setBounds(10,50,1000,50);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(255, 152,0));
        textarea.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelA = new JCheckBox();
        answer_labelA.setFont(new Font("MV Boli",Font.BOLD,35));

        JCheckBox answer_labelB = new JCheckBox();
        answer_labelB.setFont(new Font("MV Boli",Font.BOLD,35));

        JCheckBox answer_labelC = new JCheckBox();
        answer_labelC.setFont(new Font("MV Boli",Font.BOLD,35));

        JCheckBox answer_labelD = new JCheckBox();
        answer_labelD.setFont(new Font("MV Boli",Font.BOLD,35));
        textfield.setBounds(0,0,650,50);
        answer_labelA.setBounds(125,100,500,100);
        answer_labelB.setBounds(125,200,500,100);
        answer_labelC.setBounds(125,300,500,100);
        answer_labelD.setBounds(125,400,500,100);


        textfield.setText("Question "+3);
        textarea.setText(questions[2]);
        answer_labelA.setText(options[2][0]);
        answer_labelB.setText(options[2][1]);
        answer_labelC.setText(options[2][2]);
        answer_labelD.setText(options[2][3]);
        panel.add(textfield);
        panel.add(textarea);
        panel.add(answer_labelA);
        panel.add(answer_labelB);
        panel.add(answer_labelC);
        panel.add(answer_labelD);
        NextButton3 = new JButton(">>");
        NextButton3.setBounds(200,500,100,25);
        panel.add(NextButton3);

        NextButton3.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(answer_labelB.isSelected()) {
                            correct_guesses++;
                            JOptionPane.showMessageDialog(null,"Congrats!");
                        }
                        else {
                            wrong_guesses++;
                            JOptionPane.showMessageDialog(null,"Nope");
                        }

                    }});}

    private static void placeComponents4(JPanel panel) {
        panel.setLayout(null);
        JLabel textfield = new JLabel();
        JLabel textarea = new JLabel();
        textfield.setBounds(10, 20, 80, 25);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(255, 60, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,30));
        textfield.setHorizontalAlignment(JTextField.CENTER);

        textarea.setBounds(10,50,1000,50);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(255, 152,0));
        textarea.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelA = new JCheckBox();
        answer_labelA.setFont(new Font("MV Boli",Font.BOLD,15));

        JCheckBox answer_labelB = new JCheckBox();
        answer_labelB.setFont(new Font("MV Boli",Font.BOLD,15));

        JCheckBox answer_labelC = new JCheckBox();
        answer_labelC.setFont(new Font("MV Boli",Font.BOLD,15));

        JCheckBox answer_labelD = new JCheckBox();
        answer_labelD.setFont(new Font("MV Boli",Font.BOLD,15));
        textfield.setBounds(0,0,650,50);
        answer_labelA.setBounds(125,100,500,100);
        answer_labelB.setBounds(125,200,500,100);
        answer_labelC.setBounds(125,300,500,100);
        answer_labelD.setBounds(125,400,500,100);


        textfield.setText("Question "+4);
        textarea.setText(questions[3]);
        answer_labelA.setText(options[3][0]);
        answer_labelB.setText(options[3][1]);
        answer_labelC.setText(options[3][2]);
        answer_labelD.setText(options[3][3]);
        panel.add(textfield);
        panel.add(textarea);
        panel.add(answer_labelA);
        panel.add(answer_labelB);
        panel.add(answer_labelC);
        panel.add(answer_labelD);
        NextButton4 = new JButton(">>");
        NextButton4.setBounds(200,500,100,25);
        panel.add(NextButton4);

        NextButton4.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(answer_labelB.isSelected()) {
                            correct_guesses++;
                            JOptionPane.showMessageDialog(null,"Congrats!");
                        }
                        else {
                            wrong_guesses++;
                            JOptionPane.showMessageDialog(null,"Nope");
                        }

                    }});}

    private static void placeComponents5(JPanel panel) {
        panel.setLayout(null);
        JLabel textfield = new JLabel();
        JLabel textarea = new JLabel();
        textfield.setBounds(10, 20, 80, 25);
        textfield.setBackground(new Color(25,25,25));
        textfield.setForeground(new Color(255, 60, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD,30));
        textfield.setHorizontalAlignment(JTextField.CENTER);

        textarea.setBounds(10,50,1000,50);
        textarea.setBackground(new Color(25,25,25));
        textarea.setForeground(new Color(255, 152,0));
        textarea.setFont(new Font("MV Boli",Font.BOLD,25));

        JCheckBox answer_labelA = new JCheckBox();
        answer_labelA.setFont(new Font("MV Boli",Font.BOLD,15));

        JCheckBox answer_labelB = new JCheckBox();
        answer_labelB.setFont(new Font("MV Boli",Font.BOLD,15));

        JCheckBox answer_labelC = new JCheckBox();
        answer_labelC.setFont(new Font("MV Boli",Font.BOLD,15));

        JCheckBox answer_labelD = new JCheckBox();
        answer_labelD.setFont(new Font("MV Boli",Font.BOLD,15));
        textfield.setBounds(0,0,650,50);
        answer_labelA.setBounds(125,100,500,100);
        answer_labelB.setBounds(125,200,500,100);
        answer_labelC.setBounds(125,300,500,100);
        answer_labelD.setBounds(125,400,500,100);


        textfield.setText("Question "+5);
        textarea.setText(questions[4]);
        answer_labelA.setText(options[4][0]);
        answer_labelB.setText(options[4][1]);
        answer_labelC.setText(options[4][2]);
        answer_labelD.setText(options[4][3]);
        panel.add(textfield);
        panel.add(textarea);
        panel.add(answer_labelA);
        panel.add(answer_labelB);
        panel.add(answer_labelC);
        panel.add(answer_labelD);
        SaveButton = new JButton(">>");
        SaveButton.setBounds(200,500,100,25);
        panel.add(SaveButton);
        SaveButton.addActionListener(
                new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if(answer_labelB.isSelected() && answer_labelA.isSelected() && answer_labelC.isSelected()) {
                            correct_guesses++;
                            JOptionPane.showMessageDialog(null,"Congrats!");
                        }
                        else {
                            wrong_guesses++;
                            JOptionPane.showMessageDialog(null,"Nope");
                        }

                    }});}


    private static void placeComponents6(JPanel panel) {
        panel.setLayout(null);
        JTextField number_right = new JTextField();
        JTextField percentage = new JTextField();
        JTextField number_wrong = new JTextField();
        number_right.setBounds(225,125,500,100);
        number_right.setBackground(new Color(255, 60, 0));
        number_right.setForeground(new Color(238,255, 9));
        number_right.setFont(new Font("Ink Free",Font.BOLD,50));
        number_wrong.setBounds(225,225,500,100);
        number_wrong.setBackground(new Color(255, 60, 0));
        number_wrong.setForeground(new Color(238,255, 9));
        number_wrong.setFont(new Font("Ink Free",Font.BOLD,50));

        JLabel textfield = new JLabel();
        textfield.setBounds(10, 20, 300, 50);
        percentage.setBounds(225, 325, 500, 100);
        percentage.setBackground(new Color(255, 60, 0));
        percentage.setForeground(new Color(238, 255, 9));
        percentage.setFont(new Font("Ink Free",Font.BOLD,50));
        textfield.setText("RESULTS:");
        textfield.setForeground(new Color(255, 60, 0));
        textfield.setFont(new Font("Ink Free",Font.BOLD,50));
        panel.add(textfield);
        result = (int)((correct_guesses/(double)total_questions)*100);
        number_right.setText("Correct guesses: "+correct_guesses+"/"+total_questions);
        number_wrong.setText("Wrong guesses: "+wrong_guesses+"/"+total_questions);
        percentage.setText("Percentage: "+result+"%");
        panel.add(number_right);
        panel.add(number_wrong);
        panel.add(percentage);



    }}


