import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        MovieManager movieManager = new MovieManager();
        UserManager userManager = new UserManager();
        printMenu();
        do {
            System.out.print("Seçiminiz: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("--------------------------------");
                    userManager.createUser(3, "Seher", "456321", "seher@gmail.com");
                    System.out.println("--------------------------------");
                }
                case 2 -> {
                    System.out.println("--------------------------------");
                    userManager.deleteUser(userManager.getUsers()[1]);
                    System.out.println("--------------------------------");
                }
                case 3 -> {
                    System.out.println("--------------------------------");
                    userManager.searchUserByName("Eda");
                    System.out.println("--------------------------------");
                }
                case 4 -> {
                    System.out.println("--------------------------------");
                    userManager.logIn("Eda", "123456");
                    System.out.println("--------------------------------");
                }
                case 5 -> {
                    System.out.println("--------------------------------");
                    userManager.logOut();
                    System.out.println("--------------------------------");
                }
                case 6 -> {
                    System.out.println("--------------------------------");
                    movieManager.searchMovieByTitle("Esaretin Bedeli");
                    System.out.println("--------------------------------");
                }
                case 7 -> {
                    System.out.println("--------------------------------");
                    Movie movie6 = new Movie(6, "Intersteller", "Christopher Nolan", new String[]{"Matthew McConaughey"}, "2014", "", "Bilim Kurgu");
                    movieManager.addMovie(movie6);
                    System.out.println("--------------------------------");
                }
                case 8 -> {
                    System.out.println("--------------------------------");
                    movieManager.deleteMovie(movieManager.getMovies()[4]);
                    System.out.println("--------------------------------");
                }
                case 9 -> {
                    System.out.println("--------------------------------");
                    movieManager.listMovies();
                    System.out.println("--------------------------------");
                }
                case -1 -> {
                    System.out.println("İyi günler :)");
                }
                default -> printMenu();
            }
        } while (choice != -1);
    }

    private static void printMenu() {
        System.out.println("##### Ana Menü #####");
        System.out.println("1: Hesap oluştur");
        System.out.println("2: Hesabı sil");
        System.out.println("3: Hesap arama");
        System.out.println("4: Hesaba giriş");
        System.out.println("5: Hesaptan çıkış");
        System.out.println("6: Film ara");
        System.out.println("7: Film ekle");
        System.out.println("8: Film sil");
        System.out.println("9: Filmleri listele");
        System.out.println("-1: Çıkış \n\n");
    }

}
