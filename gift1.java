package com.Adwait;/*
ID: adwait.1
TASK: gift1
LANG: JAVA
 */

import java.io.*;
import java.util.*;

class Person  {                                     // Class for every seprate person
    public String name;                             // Person Name
    public int score;                               // Person money left

    // Constructor
    Person(String name){
        this.name = name;
        this.score = 0;
    }


}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader f = new BufferedReader(new FileReader("Input.txt"));
        PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("Output.txt")));
        ArrayList<Person> people = new ArrayList();                     // Makes ArrayList of people
        byte NP = Byte.parseByte(f.readLine());

        for(byte b=0;b<NP;b++){
            String name = f.readLine();
            people.add(new Person(name));                               // Calls People(Class) Constructor to make object with given name
        }
        for(byte b=0;b<NP;b++){
            String name = f.readLine();                                 // Name of person who is giving the gift
            for(Person person :people) {                                // Scrolls through list o people to people to find the correct person
                if(person.name.equals(name)){
                    String money_giving = f.readLine();               // Reads the amount as well as no. of people
                    StringTokenizer sT = new StringTokenizer(money_giving," ");    // A little bit trickier than using string.spli() but much more faster
                    int[] amounts = new int[sT.countTokens()];          
                    amounts[0] = Integer.parseInt(sT.nextToken());      // amount[0] indicates the total amount to be given
                    amounts[1] = Integer.parseInt(sT.nextToken());      // amount[1] indicates the number of people the amount is to be split between
                    String[] givers = new String[amounts[1]];//Array with names of givers
                    for (int i = 0;i<amounts[1];i++){
                        givers[i] = f.readLine();
                        for(Person person1 :people){
                         if(person1.name.equals(givers[i])){
                             if (amounts[1]!=0){person1.score += amounts[0]/ amounts[1];person.score -= amounts[0]/ amounts[1]; break;}
                             else{
                                 person.score -= amounts[0];break;
                             }

                         }
                         else{
                         }
                        }
                    }
                    break;
                }
                else continue;

            }


        }
        f.close();
        for (Person person :people) {
            output.println(person.name.toString() +" " + String.valueOf(person.score));
        }
        output.close();
    }
}
















