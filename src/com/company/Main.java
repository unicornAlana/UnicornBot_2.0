package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Do you want to talk to the bot in English or Spanish? \n¿Quieres hablar con el bot en Inglés o en Español?");

        String userLanguage = input.nextLine();

        if (userLanguage.equals("English")|| userLanguage.equals("english"))
        {
            System.out.println("Please only use lowercase letters with the Bot going forward. \nThe Bot is ready for conversation... \n ");
            userLanguage = "english";
        }
        else if (userLanguage.equals("Español")|| userLanguage.equals("español")|| userLanguage.equals("Espanol")|| userLanguage.equals("espanol"))
        {
            System.out.println("Por favor solo usa la letra minúscula con el Bot siguiendo adelante. \nEl Bot está listo para la conversación... \n ");
            userLanguage = "spanish";
        }
        else
        {
            System.out.println("The bot wasn't ready for that response. Please try again. \nEl bot no fue listo para esa respuesta. Por favor intenta otra vez.");
        }

        if (userLanguage.equals("english"))
        {
            System.out.println("Hello, I'm a Bot. I'm going to ask you some questions, since that's the only thing I can do. What's your name?");
        }
        else if (userLanguage.equals("spanish"))
        {
            System.out.println("Hola, soy un Bot. Te voy a preguntar algunas preguntas, como es la unica cosa que puedo hacer. ¿Como te llamas?");
        }
        
        String name = input.nextLine();

        Bot unicorn = new Bot(userLanguage, name);



        if (userLanguage.equals("english"))
        {
            System.out.println("How was your day, " + name + "?");
        }
        else if (userLanguage.equals("spanish"))
        {
            System.out.println("¿Cómo estuvo tu día, " + name + "?");
        }

        String greeting = input.nextLine();





        unicorn.weather();
        unicorn.betterDay();
        unicorn.cupcake();

    }

}
