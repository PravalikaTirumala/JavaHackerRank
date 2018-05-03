/**
 * Pravalika Tirumala
 * Hacker rank Cracking the code interview : Trie Contact (Java 8)
 * Refer to Code interview questions folder
 */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TrieContact {
    
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Trie trieobj = new Trie();
        for (int i = 0; i < n; i++) {
            String op = in.next();
            String contact   = in.next();
            if (op.equals("add")) {
                trieobj.add(contact);
            } else if (op.equals("find")) {
                System.out.println(trieobj.find(contact));
            }
        }
        in.close();
    }
}

/* Based loosely on tutorial video in this problem */
class TrieNode {
    private HashMap<Character, TrieNode> child = new HashMap<>();
    public int count;

    public void putChild(char ch) {
        child.putIfAbsent(ch, new TrieNode());
    }

    public TrieNode getChild(char ch) {
        return child.get(ch);
    }
}

class Trie {
    TrieNode root = new TrieNode();

    Trie(){} // default constructor
    
   /* Trie(String[] words) {
        for (String word : words) {
            add(word);
        }
    }*/
    
    public void add(String str) {
        TrieNode t = root;
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            t.putChild(ch);
            t = t.getChild(ch);
            t.count++;
        }
    }
    
    public int find(String str) {
        TrieNode t = root;
        
        /* Traverse down tree to end of our prefix */
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            t = t.getChild(ch);
            if (t == null) {
                return 0;
            }
        }
        return t.count;
    }
}
