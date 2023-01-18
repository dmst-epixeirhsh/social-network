# Εργασία

## Μεταγλώττιση/Εκτέλεση

Το πρόγραμμα αναπτύχθηκε και δοκιμάστηκε σε περιβάλλον Apache NetBeans 16, ένα ολοκληρωμένο περιβάλλον ανάπτυξης το οποίο υποστηρίζει Maven.

## Οδηγίες Χρήσης

Το πρόγραμμα εμφανίζει μενού αριθμημένων επιλογών όπου ο χρήστης μπορεί να επιλέξει τον κατάλληλο αριθμό επιλογής. Το πρόγραμμα είναι πολύ διαισθητικό, ωστόσο αναλυτικός πρακτικός οδηγός χρήσης (που μάλιστα επιδεικνύει κάθε ενδεχόμενη λειτουργία του προγράμματος) περιέχεται στο σχετικό βίντεο.

## Περιεχόμενα Αποθετηρίου

Το αποθετήριο περιέχει αρχεία των ολοκληρωμένων και πλήρως λειτουργικών κλάσεων, το αρχείο pom.xml, αλλά και τις μεθόδους που ανέλαβαν ιδιαίτερα στο σχεδιασμό και στην υλοποίηση τα μέλη της ομάδας. Τα αρχεία που αφορούν την υλοποίηση των λειτουργιών της εργασίας σε περιβάλλον Apache NetBeans σε κατάλληλο Java project, είναι τα Ergasia.java, Main.java, και pom.xml

* Το αρχείο Ergasia.java περιέχει την κλάση ergasia (όπου βρίσκονται οι συναρτήσεις που υλοποιούν τις επί μέρους λειτουργίες της εργασίας) και ανήκει στο πακέτο egrasia το οποίο πρέπει να βρίσκεται στο /src/main/java

* Το αρχείο Main.java περιέχει την κλάση main (όπου βρίκσεται η συνάρτηση main) και ανήκει στο πακέτο main το οποίο επίσης πρέπει να βρίσκεται στο /src/main/java

* Το αρχείο pom.xml βρίσκεται στο "/" και δημιουργήθηκε αυτόματα απο το NetBeans. Εμείς προσθέσαμε κατάλληλο κώδικα XML για να προσδιορίσουμε ποια κλάση το πρόγραμμα αντιμετωπίζει ως "main"

* Το αρχείο thejarfile.jar το οποίο είναι το αρχείο jar του project μας. (java -jar thejarfile.jar)

* Το αρχείο LICENSE στο οποίο περιιγράφεται η άδεια του παρώντος αποθετηρίου

## UML

![UMLofErgasia](https://user-images.githubusercontent.com/115426925/212979759-30371b3a-1129-40d7-b213-8db449d12901.jpg)



## Λειτουργία/Αλγόριθμοι

Έχουν υλοποιηθεί οι εξής συναρτήσεις:

#### void signUp(String name,String pass)

Δέχεται ως ορίσματα δύο συμβολοσειρές που εκπροσωπούν το όνομα του λογαριασμού και τον κωδικό πρόσβασης στο λογαριασμό. Σκοπός είναι η εγγραφή νέου λογαριασμού, η οποία δεν πραγματοποιείται (και εμφανίζεται κατάλληλο output) στην περίπτωση όπου το αιτούμενο όνομα λογαριασμού χρησιμοποιείται ήδη από άλλο λογαριασμό.

#### void signIn(String name,String pass)

Δέχεται ως ορίσματα δύο συμβολοσειρές που εκπροσωπούν το όνομα του λογαριασμού και τον κωδικό πρόσβασης στο λογαριασμό. Σκοπός είναι η πρόσβαση του χρήστη στο κύριο μενού του μέσου κοινωνικής δικτύωσης μέσα από την απόκτηση πρόσβασης σε λογαριασμό, όπου κάθε ενέργεια λαμβάνεται “με την υπογραφή” του συγκεκριμένου λογαριασμού. Αυτό όμως δεν πραγματοποιείται (και εμφανίζεται κατάλληλο output) στην περίπτωση όπου το όνομα δεν ανήκει σε κάποιο υπάρχων λογαριασμό, ή σε περίπτωση που ο κωδικός πρόσβασης δεν είναι σωστός.

#### void signOut()

Το κύριο μενού του μέσου κοινωνικής δικτύωσης “κλειδώνεται” μέχρι την επόμενη επιτυχή σύνδεση ενός χρήστη σε λογαριασμό μέσω της συνάρτησης signIn.

#### String post()

Δέχεται ως είσοδο ένα μήνυμα το οποίο αναρτά και συσχετίζει με κάποια μεταδεδομένα: αναγνωριστικό κωδικό μηνύματος (τον οποίο δημιουργεί και επιστρέφει) και όνομα λογαριασμού που έστειλε το μήνυμα.

#### void listPosts()

Εμφανίζει μηνύματα, μαζί με κάποια μεταδεδομένα τους (αναγνωριστικό κωδικό μηνύματος, όνομα λογαριασμού που έστειλε το μήνυμα, και πλήθος λογαριασμών που εισήγαγε “μου αρέσει”). Σε περίπτωση που δεν υπάρχουν μηνύματα, εμφανίζει κατάλληλο output.

#### void like(String id)

Δέχεται ως όρισμα μια συμβολοσειρά που εκπροσωπεί αναγνωριστικό κωδικό μηνύματος στο οποίο ο λογαριασμός έπειτα εισάγει “μου αρέσει”. Σε περίπτωση που η συμβολοσειρά την οποία δέχτηκε ως όρισμα δεν ισούται με κανέναν αναγνωριστικό κωδικό υπάρχοντος μηνύματος, εμφανίζει κατάλληλο output.

#### void whoLiked(String id)

Δέχεται ως όρισμα μια συμβολοσειρά που εκπροσωπεί αναγνωριστικό κωδικό μηνύματος για το οποίο στη συνέχεια εμφανίζεται λίστα λογαριασμών που έχουν εισάγει “μου αρέσει”. Σε περίπτωση που κανείς δεν έχει εισάγει “μου αρέσει”, εμφανίζει κατάλληλο output. Σε περίπτωση που η συμβολοσειρά την οποία δέχτηκε ως όρισμα δεν ισούται με κανέναν αναγνωριστικό κωδικό υπάρχοντος μηνύματος, εμφανίζει κατάλληλο output.

#### void save()

Αποθηκεύει όλες τις αλλαγές σε σχέση με την προηγούμενη (αν υπήρχε) χρήση του προγράμματος.

#### void load()

Επαναφέρει όλες τις αλλαγές που έλαβαν χρόνο κατά τη διάρκεια της προηγούμενης (αν υπήρχε) χρήσης του προγράμματος.

#### void main()

Πραγματοποιεί κατάλληλες κλήσεων συναρτήσεων της κλάσης Ergasia.

## Δομές Δεδομένων

Γίνεται εκτεταμένη χρήση δομών δεδομένων τύπου συμβολοσειράς, χάρτη (κατακερματισμού), και συνόλου (κατακερματισμού). Για την εύρεση κατάλληλου τύπου δομών δεδομένων έγιναν πολυάριθμες δοκιμές μέχρι να καταλήξουμε ότι οι συγκεκριμένες προαναφερθείσες δομές μας εξυπηρετούν.
