package com.techtorial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {

        // specify the needed file
        File credsFile = new File("src/test/Resources/Credentials.properties");

        //read from a file
        FileReader fileReader = new FileReader(credsFile);

        Properties properties = new Properties();

        properties.load(fileReader);

        System.out.println(properties.stringPropertyNames());
        String url = properties.getProperty("url");
        System.out.println("my url is : " + url);

        String login = properties.getProperty("login");
        System.out.println("my login from properties file is : "+ login);

        String pass = properties.getProperty("password");
        System.out.println("my password is : "+pass);

    }

        public static String getProperties (String key) throws IOException {
            // specify the needed file
            File credsFile = new File("src/test/Resources/Credentials.properties");

            //read from a file
            FileReader fileReader = new FileReader(credsFile);

            Properties properties = new Properties();

            properties.load(fileReader);

            String value = properties.getProperty(key);
            return value;


       /* System.out.println(properties.stringPropertyNames());
        String url = properties.getProperty("url");
        System.out.println("my url is : " + url);

        String login = properties.getProperty("login");
        System.out.println("my login from properties file is : "+ login);

        String pass = properties.getProperty("password");
        System.out.println("my password is : "+pass);

        */


        }

    }

