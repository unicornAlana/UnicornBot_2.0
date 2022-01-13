package com.company;
import java.util.Scanner;


public class Bot {
    String userLanguage;
    String name;

    Scanner input = new Scanner(System.in);

    public Bot(String userLanguage, String name) {
        this.userLanguage = this.userLanguage;
        this.name = this.name;
    }

    public String languageSelection() {
        String result = "";
        result = "Do you want to talk to the bot in English or Spanish? \n ¿Quieres hablar con el bot en Inglés o en Español?";
        return result;
    }

    public String getUserLanguage() {
        return this.userLanguage;
    }

//    public String languageConfirmation()
//    {
//        String result = "";
//       if (userLanguage.equals("English")|| userLanguage.equals("english"))
//        {
//            result = "Please only use lowercase letters with the Bot going forward. \n The Bot is ready for conversation... \n ";
//            userLanguage = "english";
//        }
//       else if (userLanguage.equals("Español")|| userLanguage.equals("español")|| userLanguage.equals("Espanol")|| userLanguage.equals("espanol"))
//       {
//           result = "Por favor solo usa la letra minúscula con el Bot siguiendo adelante. \n El Bot está listo para la conversación... \n ";
//           userLanguage = "spanish";
//       }
//       else
//       {
//           result = "The bot wasn't ready for that response. Please try again. \n El bot no fue listo para esa respuesta. Por favor intenta otra vez.";
//       }
//        return result;
//
//
//   }

//    public String greeting()
//    {
//        String result = "";
//        if (userLanguage.equals("english"))
//        {
//           result = "Hello, I'm a Bot. I'm going to ask you some questions, since that's the only thing I can do. What's your name?";
//        }
//        else if (userLanguage.equals("spanish"))
//        {
//            result = "Hola, soy un Bot. Te voy a preguntar algunas preguntas, como es la unica cosa que puedo hacer. ¿Como te llamas?";
//        }
//        return result;
//
//    }


//    public String day() {
//        String result = "";
//        if (userLanguage.equals("english")) {
//            result = "How was you day, " + name + "?";
//        } else if (userLanguage.equals("spanish")) {
//            result = "¿Cómo estuvo tu día, " + name + "?";
//        }
//        return result;
//    }


    public String weather() {
        String result = "";
        if (userLanguage.equals("english")) {
            result = "What was the weather like today?";
        } else if (userLanguage.equals("spanish")) {
            result = "¿Cómo estuvo el tiempo hoy?";
        }
        return result;
    }


    public String betterDay() {
        String result = "";
        if (userLanguage.equals("english")) {
            result = "What is something that would have made today better?";
        } else if (userLanguage.equals("spanish")) {
            result = "¿Que es una cosa que podría hace mejor tu día?";
        }
        return result;
    }


    public String cupcake() {

        String result = "";
        if (userLanguage.equals("english")) {
            result = "Would your day have been better with a cupcake?";
        } else if (userLanguage.equals("spanish")) {
            result = "¿Tu día sería mejor con un panquecito?";
        }
        return result;
    }

    public String annoyed() {
        String result = "";
        if (userLanguage.equals("yes") || userLanguage.equals("yea")) {
            result = "You should make some then! \n What is one thing that you have to do tomorrow?";
        } else if (userLanguage.equals("si") || userLanguage.equals("sí")) {
            result = "¡Debes hacer unos entonces! \n ¿Que es una cosa que tienes hacer mañana?";
        } else if (userLanguage.equals("no") && userLanguage.equals("english")) {
            result = "I couldn't have given you one anyways. I'm just a bot! \n What is one thing that you have to do tomorrow?";
        } else if (userLanguage.equals("no") && userLanguage.equals("spanish")) {
            result = "No podría darte uno de todos modos. ¡Solo soy un bot! \n Que es una cosa que tienes hacer mañana";
        }
        return result;


    }
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




