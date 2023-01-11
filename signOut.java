public static void signOut() {
    logged = null;
  }

  public static String post() {
    String id = UUID.randomUUID().toString();
    //το αναγνωριστικο για καθε ποστ που ειναι μοναδικο
    postMetadata.put(id,logged);
    System.out.println("Εισάγετε μήνυμα:");
    String content = in.nextLine();
    posts.put(id,content);
    postLikes.put(id,new HashSet<>());
    return id;
  }
