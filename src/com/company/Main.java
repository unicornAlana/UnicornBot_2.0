package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to talk to the bot in English or Spanish? \n¿Quieres hablar con el bot en Inglés o en Español?");

        String userInput = input.nextLine();
        Language userLanguage = null;
        //Just convert what the user types to lower case. Easier that way.
        userInput = userInput.toLowerCase(Locale.ROOT);

        //we keep asking the user as long as they refuse to provide a sensible answer.
        while(userLanguage == null) {
            if (userInput.equals("english")) {
                userLanguage = Language.ENGLISH;
            } else if (userInput.equals("español") || userInput.equals("Espanol")) {
                System.out.println("Por favor solo usa la letra minúscula con el Bot siguiendo adelante. \nEl Bot está listo para la conversación... \n ");
                userLanguage = Language.SPANISH;
            } else {
                System.out.println("The bot wasn't ready for that response. Please try again. \nEl bot no fue listo para esa respuesta. Por favor intenta otra vez.");
            }
        }

        Bot unicorn = new Bot(userLanguage);
        System.out.println(unicorn.greeting());
        unicorn.setUserName(input.nextLine());

        while(unicorn.hasNextQuestion()) {
            System.out.println(unicorn.getNextQuestion());
            String response = input.nextLine();
        }

    }

}
