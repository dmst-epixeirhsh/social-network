package main;

import java.io.*;
import java.util.*;
import ergasia.Ergasia;

public class Main {
  public static void main(String[] args) {
    System.out.println("Καλωσορίσατε σε αυτό το μέσο κοινωνικής δικτύωσης!");
    Ergasia.load();
    Scanner in = new Scanner(System.in);
    while (true) {
      String name = "";
      String pass = "";
      System.out.println("Πατήστε:\n\"1\" για να δημιουργήσετε λογαριασμό\n\"2\" για να συνδεθείτε σε λογαριασμό\n\"3\" για να κλείσετε το πρόγραμμα");
      String key = in.next();
      switch(key) {
        case "1":
          System.out.println("Πληκτρολογήστε όνομα:");
          name = in.next();
          System.out.println("Πληκτρολογήστε κωδικό πρόσβασης:");
          pass = in.next();
          Ergasia.signUp(name,pass);
          break;
        case "2":
          System.out.println("Πληκτρολογήστε όνομα χρήστη:");
          name = in.next();
          System.out.println("Πληκτρολογήστε κωδικό πρόσβασης:");
          pass = in.next();
          Ergasia.signIn(name,pass);
          if (Ergasia.logged != null)
            while (true) {
              System.out.println("Πατήστε:\n\"1\" για να δείτε μηνύματα\n\"2\" για να στείλετε μήνυμα\n\"3\" για να εισάγετε \"μου αρέσει\"\n\"4\" για να δείτε ποιοι εισήγαγαν \"μου αρέσει\" σε μήνυμα\n\"5\" για αποσυνδεθείτε");
              key = in.next();
              if (key.equals("1")) Ergasia.listPosts();
              else if (key.equals("2")) {
                String id = Ergasia.post();
                System.out.println("Το μήνυμα έχει αναγνωριστικό: "+id);
              }
              else if (key.equals("3")) {
                System.out.println("Εισάγετε το αναγνωριστικό του μηνύματος:");
                String id = in.next();
                Ergasia.like(id);
              }
              else if (key.equals("4")) {
                System.out.println("Εισάγετε το αναγνωριστικό του μηνύματος:");
                String id = in.next();
                Ergasia.whoLiked(id);
              }
              else if (key.equals("5")) {
                Ergasia.signOut();
                break;
              }
              else System.out.println("Προσπαθήστε ξανά.");
            }
          break;
        case "3":
          Ergasia.save();
          System.out.println("Καλή συνέχεια!");
          return;
        default:
          System.out.println("Προσπαθήστε ξανά.");
          break;
      }
    }
  }
}