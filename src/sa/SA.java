/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sa;
import java.io.*;

import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author hassa
 */
public class SA {

    public static void main(String[] args)  
    {   
       removeAlphabets();
        removeStopWords();
        checkSentiment();
        
    }
    public static void checkSentiment()  
    {   
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<String> list2=new ArrayList<String>();
        try 
        {
            File file = new File("E:\\positive-words.txt");
            
            Scanner in = new Scanner(file, "utf-8");
            
            while (in.hasNextLine()) 
            {    
                String line=in.nextLine();
                list.add(line);
              
            }
            in.close();

        } 
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
        try 
        {
            File file = new File("E:\\negative-words.txt");
            
            Scanner in = new Scanner(file, "utf-8");
            
            while (in.hasNextLine()) 
            {    
                String line=in.nextLine();
                list2.add(line);
              
            }
            in.close();

        } 
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
        int posCount=0, negCount=0;
        try
        {
           
            File file=new File("Final.txt");
            Scanner in = new Scanner(file, "utf-8");
             
            
            while( in.hasNextLine())
            {
                String line=in.nextLine();
                for (int i = 0; i < list.size(); i++)
                {
                    if(line.contains(list.get(i)))
                    {
                         posCount++;    
                    }
                }
                for (int i = 0; i < list2.size(); i++)
                {
                    if(line.contains(list2.get(i)))
                    {
                         negCount++;    
                    }
                }
            }
            in.close();
           
        }
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
        System.out.println(posCount+" "+negCount);
        if(posCount>negCount)
        {
            System.out.println("The paragraph has positive sentiment!!!");
        }
        else if(negCount>posCount)
        {
            
            System.out.println("The paragraph has negative sentiment!!!");
        }
        
        
    }
    public static void removePunc()
    {
        try 
        {
            File file = new File("E:\\urdu.txt");

            Scanner in = new Scanner(file, "utf-8");
            String []punc={"!",",","-",":","۔",";","'","()","،","٫","@","#","’","‘"};
              
            while (in.hasNextLine()) 
            {    
                
                String line = in.nextLine();
                //String []tokens=line.split(" ");
              //System.out.println("Word"+tokens[0]);
                for (int i = 0; i < punc.length; i++)
                {
                    if(line.contains(punc[i]))
                    {
                        line=line.replaceAll(punc[i], " ");
                    }
                }
              
              System.out.println(line);
              
            }
            in.close();

        } 
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
    }
    public static void removeAlphabets()
    {
        ArrayList<String> list3=new ArrayList<String>();
        try 
        {
            File file = new File("E:\\urdu.txt");

            Scanner in = new Scanner(file, "utf-8");
              
            while (in.hasNextLine()) 
            {
              
                String line = in.nextLine();
                line=line.replaceAll("[^آ-ے]"," ");
                //System.out.println(line);
                list3.add(line);
            }
            in.close();

        } 
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
        
         File fileName= new File("OnlyText.txt");
         try
         {
            FileWriter fw = new FileWriter (fileName);
            Writer output=new BufferedWriter(fw);
             for (int i = 0; i < list3.size(); i++)
             {
                  output.write (list3.get(i)+"\n");
             }
        
         output.close();
         }
         catch (Exception e)
         {
              System.out.println("exception:" + e.toString());
         }
        
    }
    public static void removeStopWords()
    {
        ArrayList<String> list=new ArrayList<String>();
        ArrayList<String> list2=new ArrayList<String>();
        try 
        {
            File file = new File("E:\\stopWords.txt");
            
            Scanner in = new Scanner(file, "utf-8");
            
            while (in.hasNextLine()) 
            {    
                String line=in.nextLine();
                list.add(line);
              
            }
            in.close();

        } 
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
        try
        {
           
            File file=new File("OnlyText.txt");
            Scanner in = new Scanner(file, "utf-8");
             
            
            while( in.hasNextLine())
            {
                String line=in.nextLine();
                for (int i = 0; i < list.size(); i++)
                {
                    if(line.contains(list.get(i)))
                    {
                         line=line.replaceAll(list.get(i), " ");    
                    }
                }
              list2.add(line);
            }
            in.close();
           
        }
        catch (Exception e) 
        {
            System.out.println("exception:" + e.toString());
        }
         File fileName= new File("Final.txt");
         try
         {
            FileWriter fw = new FileWriter (fileName);
            Writer output=new BufferedWriter(fw);
             for (int i = 0; i < list2.size(); i++)
             {
                  output.write (list2.get(i)+"\n");
             }
        
         output.close();
         }
         catch (Exception e)
         {
              System.out.println("exception:" + e.toString());
         }
        
    }   

    
}
