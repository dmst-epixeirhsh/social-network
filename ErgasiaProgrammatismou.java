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