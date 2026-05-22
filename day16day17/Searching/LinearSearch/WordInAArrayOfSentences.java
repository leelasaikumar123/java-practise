package day16day17.Searching.LinearSearch;

import java.util.Scanner;

public class WordInAArrayOfSentences {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        String word=sc.next();
        sc.nextLine();
        String[] sentences=new String[size];
        for(int i=0;i<sentences.length;i++){
            sentences[i]=sc.nextLine();
        }
        String s=findsentence(sentences, word);
        System.out.println(s);
    }
    public static String findsentence(String[] sentences,String word){
    for(int i=0;i<sentences.length;i++){
        if(sentences[i].contains(word)){
            return sentences[i];
        }
    }
        return "Not Found";
    }
}
