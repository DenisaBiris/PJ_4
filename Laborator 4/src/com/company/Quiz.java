package com.company;


public class Quiz {

    String[] questions = {
            "From which US city did Starbucks originate?",
            "According to an Ethiopian origin story, coffee beans were discovered after what animal became energetic after eating them?",
            "What is an espresso?",
            "What beverage is made by adding hot water to espresso?"
    };
    String[][] options = {
            {"Seattle", "New Orleans", "Boston", "San Francisco"},
            {"Elephants", "Birds", "Goats", "Jaguars"},
            {"A brewing method where water is forced through the coffee grounds", "A type of beverage made with steamed milk", "A type of coffee bean that contains high amounts of caffeine", "A type of beverage made with whipped cream."},
            {"Cortado", "Americano", "Doppio", "Affogato"}
    };


    char[] answers = {
            'A',
            'B',
            'C',
            'C'
    };
    public String[] getQuestions() {
        return questions;
    }

    public String[][] getOptions() {
        return options;
    }

    public char[] getAnswers() {
        return answers;
    }
    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public void setOptions(String[][] options) {
        this.options = options;
    }

    public void setAnswers(char[] answers) {
        this.answers = answers;
    }

    public Quiz(String[] questions, String[][] options, char[] answers) {
        this.questions = questions;
        this.options = options;
        this.answers = answers;
    }




    }