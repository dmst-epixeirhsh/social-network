public static void load() {
    try (ObjectInputStream i = new ObjectInputStream(new FileInputStream("file.txt"))) {
      users = (Map<String,String>) i.readObject();
      posts = (Map<String,String>) i.readObject();
      postMetadata = (Map<String,String>) i.readObject();
      postLikes = (Map<String,Set<String>>) i.readObject();
    }
    //στη λοουντ δηλωνει τους χρηστες αν δεν υπαρχει το αρχειο η αν δεν βρει τη κλαση
    catch (IOException | ClassNotFoundException i) {
      users = new HashMap<>();
      posts = new HashMap<>();
      postMetadata = new HashMap<>();
      postLikes = new HashMap<>();
    }
  }

}
