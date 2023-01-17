package ergasia;

import java.io.*;
import java.util.*;

public class Ergasia {

  public static String logged;
  public static Scanner in = new Scanner(System.in);
  public static Map<String,String> users = new HashMap<>(), posts = new HashMap<>(), postMetadata = new HashMap<>();
  public static Map<String,Set<String>> postLikes = new HashMap<>();

  public static void signUp(String name,String pass) {
    if (!users.containsKey(name)) users.put(name,pass);
    else System.out.println("Αυτό το όνομα χρησιμοποιείται ήδη.");
  }

  public static void signIn(String name,String pass) {
    if (!users.containsKey(name)) System.out.println("Δεν υπάρχει λογαρισμός με αυτό το όνομα.");
    else if (users.get(name).equals(pass)) logged = name;
    else System.out.println("Λάθος στον κωδικό πρόσβασης."); 
  }

  public static void signOut() {
    logged = null;
  }

  public static String post() {
    String id = UUID.randomUUID().toString();
    postMetadata.put(id,logged);
    System.out.println("Εισάγετε μήνυμα:");
    String content = in.nextLine();
    posts.put(id,content);
    postLikes.put(id,new HashSet<>());
    return id;
  }

  public static void listPosts() {
    boolean empty = true;
    for (Map.Entry<String,String> i : postMetadata.entrySet()) {
      empty = false;
      System.out.println("["+i.getKey()+"] @"+i.getValue()+": "+posts.get(i.getKey())+" (liked by "+postLikes.get(i.getKey()).size()+" users)");
    }
    if (empty) System.out.println("Δεν υπάρχουν μηνύματα.");
  }

  public static void like(String id) {
    if (postMetadata.containsKey(id)) {
      postLikes.get(id).add(logged);
      return;
    }
    System.out.println("Λάθος στο αναγνωριστικό.");
  }

  public static void whoLiked(String id) {
    if (postMetadata.containsKey(id)) {
      Set<String> liked = postLikes.get(id);
      if (!liked.isEmpty()) {
        System.out.println("Έχουν εισάγει \"μου αρέσει\" οι:");
        for (String i : liked) System.out.println(i);
      }
      else System.out.println("Δεν έχει εισαχθεί \"μου αρέσει\" σε αυτό το μήνυμα.");
      return;
    }
    System.out.println("Λάθος στο αναγνωριστικό");
  }

  public static void save() {
    try (ObjectOutputStream i = new ObjectOutputStream(new FileOutputStream("file.txt"))) {
      i.writeObject(users);
      i.writeObject(posts);
      i.writeObject(postMetadata);
      i.writeObject(postLikes);
    }
    catch (IOException i) {
      i.printStackTrace();
    }
  }

  public static void load() {
    try (ObjectInputStream i = new ObjectInputStream(new FileInputStream("file.txt"))) {
      users = (Map<String,String>) i.readObject();
      posts = (Map<String,String>) i.readObject();
      postMetadata = (Map<String,String>) i.readObject();
      postLikes = (Map<String,Set<String>>) i.readObject();
    }
    catch (IOException | ClassNotFoundException i) {
      users = new HashMap<>();
      posts = new HashMap<>();
      postMetadata = new HashMap<>();
      postLikes = new HashMap<>();
    }
  }

}