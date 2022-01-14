package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Bot {
    Language preferredLanguage;
    String userName;
    List<Question> questions = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public Bot(Language preferredLanguage) {
        this.preferredLanguage = preferredLanguage;
        loadQuestions("personalQuestions.txt");
    }

    /**
     * This method takes filename, loads that file, then creates questions from the file.
     * It sees lines as going Engligh, then Spanish, over and over.
     * @param filename
     */
    private void loadQuestions(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String nextLine = null;
            while (!((nextLine = br.readLine()) ==null)) {
                Question q = new Question();
                q.addQuestion(Language.ENGLISH, nextLine);
                q.addQuestion(Language.SPANISH, br.readLine());
                questions.add(q);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String greeting() {
        if (preferredLanguage == Language.ENGLISH) {
            return "Hello, I'm a Bot. I'm going to ask you some questions, since that's the only thing I can do. What's your name?";
        } else if (preferredLanguage == Language.SPANISH) {
            return "Hola, soy un Bot. Te voy a preguntar algunas preguntas, como es la unica cosa que puedo hacer. ¿Como te llamas?";
        } else {
            return "";
        }
    }

    public String languageSelection() {
        String result = "";
        result = "Do you want to talk to the bot in English or Spanish? \n ¿Quieres hablar con el bot en Inglés o en Español?";
        return result;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public boolean hasNextQuestion() {
        return (questions.size() > 0);
    }

    //Plucks out the first question from the list and returns its text in the preferred language.
    public String getNextQuestion() {
        return questions.remove(0).getQuestionText(preferredLanguage);
    }

    public Language getUserLanguage() {
        return this.preferredLanguage;
    }

//    public String day() {
//        String result = "";
//        if (userLanguage.equals("english")) {
//            result = "How was you day, " + name + "?";
//        } else if (userLanguage.equals("spanish")) {
//            result = "¿Cómo estuvo tu día, " + name + "?";
//        }
//        return result;
//    }
//
//
//    public String weather() {
//        String result = "";
//        if (userLanguage.equals("english")) {
//            result = "What was the weather like today?";
//        } else if (userLanguage.equals("spanish")) {
//            result = "¿Cómo estuvo el tiempo hoy?";
//        }
//        return result;
//    }
//
//
//    public String betterDay() {
//        String result = "";
//        if (userLanguage.equals("english")) {
//            result = "What is something that would have made today better?";
//        } else if (userLanguage.equals("spanish")) {
//            result = "¿Que es una cosa que podría hace mejor tu día?";
//        }
//        return result;
//    }
//
//
//    public String cupcake() {
//
//        String result = "";
//        if (userLanguage.equals("english")) {
//            result = "Would your day have been better with a cupcake?";
//        } else if (userLanguage.equals("spanish")) {
//            result = "¿Tu día sería mejor con un panquecito?";
//        }
//        return result;
//    }
//
//    public String annoyed() {
//        String result = "";
//        if (userLanguage.equals("yes") || userLanguage.equals("yea")) {
//            result = "You should make some then! \n What is one thing that you have to do tomorrow?";
//        } else if (userLanguage.equals("si") || userLanguage.equals("sí")) {
//            result = "¡Debes hacer unos entonces! \n ¿Que es una cosa que tienes hacer mañana?";
//        } else if (userLanguage.equals("no") && userLanguage.equals("english")) {
//            result = "I couldn't have given you one anyways. I'm just a bot! \n What is one thing that you have to do tomorrow?";
//        } else if (userLanguage.equals("no") && userLanguage.equals("spanish")) {
//            result = "No podría darte uno de todos modos. ¡Solo soy un bot! \n Que es una cosa que tienes hacer mañana";
//        }
//        return result;
//
//
//    }
}


//   public String cupcakeResponse()
//   {
//       String result = "";
//       if (cupcake.equals("yes")||cupcake.equals("yea"))
//       {
//           result = "You should go make some then! \n What one thing (besides the cupcakes) that you have to do tomorrow?";
//       }
//       else if (cupcake.equals("si")||cupcake.equals("sí"))
//       {
//           result = "¡Debes hacerlos entonces! \n ¿Que es una cosa que tienes hacer mañana?";
//       }
//       else if (cupcake.equals("no") && userLanguage.equals("english"))
//       {
//           result = "I couldn't have given you one anyways. I'm just a bot! \n What is one thing that you have to do tomorrow?";
//       }
//       else if (cupcake.equals("no") && userLanguage.equals("spanish"))
//       {
//           result = "No podría darte uno de todos modos. ¡Solo soy un bot! \n Que es una cosa que tienes hacer mañana";
//       }
//       return result;
//   }




