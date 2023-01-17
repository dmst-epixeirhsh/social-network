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
