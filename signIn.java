public static void signIn(String name,String pass) {
    if (!users.containsKey(name)) System.out.println("Δεν υπάρχει λογαρισμός με αυτό το όνομα.");
    else if (users.get(name).equals(pass)) logged = name;
    else System.out.println("Λάθος στον κωδικό πρόσβασης."); 
  }
