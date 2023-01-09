package ergasia;

import java.io.*;
import java.util.*;

public class Ergasia {

  public static String logged;
  //λογκντ ειναι η κατασταση του χρήστη, είτε είναι συνδεδεμένος είτε όχι, αν γινόταν boolean θα κράσαρε το πρόγραμμα
  public static Scanner in = new Scanner(System.in);
  public static Map<String,String> users = new HashMap<>(), posts = new HashMap<>(), postMetadata = new HashMap<>();
  //μαπ ειναι δομη δεδομενων, και το χασμαπ ειναι ενα ειδος δομης
  //ποστ ειναι τα λαικς που εχει καθε ποστ
  //ποστ ειναι τα στοιχεια του ποστ, ο χρηστης που εκανε το ποστ και ο ανγνωριστικος κωδικος
  public static Map<String,Set<String>> postLikes = new HashMap<>();
  //ποστλαικς εχει τον αναγνωριστικο κωδικο και μια λιστα απο χρηστες που εχουν κανει λαικ

  public static void signUp(String name,String pass) {
    if (!users.containsKey(name)) users.put(name,pass);
    else System.out.println("Αυτό το όνομα χρησιμοποιείται ήδη.");
  }

  public static void signIn(String name,String pass) {
    if (!users.containsKey(name)) System.out.println("Δεν υπάρχει λογαρισμός με αυτό το όνομα.");
    else if (users.get(name).equals(pass)) logged = name;
    else System.out.println("Λάθος στον κωδικό πρόσβασης."); 
  }
}
