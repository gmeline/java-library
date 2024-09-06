package library;
import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        boolean running = true;
        while(running){
            System.out.println("\nBibliothèque");
            System.out.println("1. Ajouter un livre");
            System.out.println("2. Emprunter un livre");
            System.out.println("3. Ramener un livre");
            System.out.println("4. Voir les livres");
            System.out.println("5. Quitter");
            System.out.println("Choisir une option");
            int choice =scanner.nextInt();
            scanner.nextLine();
            switch(choice){
                case 1:
                    System.out.println("Entrer le titre du livre");
                    String title = scanner.nextLine();
                    System.out.println("Entrer le nom de l'auteur");
                    String author =scanner.nextLine();
                    library.addBook(new Book(title, author));
                    System.out.println("Libre ajoutée");
                    break;
                case 2 : 
                    System.out.println("Entrer le titre du livre pour l'emprunter");
                    String borrowTitle = scanner.nextLine();
                    library.borrowBook(borrowTitle);
                    break;
                case 3: 
                    System.out.println("Entrer le titre du livre à rendre");
                    String returnTitle=scanner.nextLine();
                    library.returnBook(returnTitle);
                    break;
                case 4:
                    System.out.println("Livre présent en bibliothèque");
                    library.displayBooks();
                    break;
                case 5:
                    running=false;
                    System.out.println("Fermeture de l'application");
                    break;
                default:
                    System.out.println("Option invalide. Essaye en une valide");
                    break;
            }
        }
        scanner.close();
    }
}
