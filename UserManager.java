public class UserManager {

    private User[] users = new User[]{
            new User(1, "Eda", "123456", "eda@gmail.com"),
            new User(2, "Mecit", "789456", "mecit@gmail.com")
    };

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }

    public User createUser(int id, String userName, String password, String mail) {
        User user = new User(id, userName, password, mail);
        users[1]=user;
        System.out.println("Hesap oluşturuldu.");
        return user;

    }
    public void deleteUser(User user){
        System.out.println(user.getUserName()+" adlı hesabınız silindi.");
    }

    public void logIn(String userName, String password) {
        int result = 0;

        for (int i = 0; i < users.length; i++) {
            if (users[i].getUserName().equals(userName) && users[i].getPassword().equals(password)) {
                System.out.println("Giriş başarılı! :)");
                result = 0;
                break;
            } else {
                result = 1;
            }
        }
        if (result == 1) {
            System.out.println("User name veya parola hatalı! Tekrar deneyiniz!");
        }

    }
    public void logOut(){
        System.out.println("Çıkış yapıldı.");
    }

    public User searchUserById(int userId) {
        User searchedUser = null;
        for (User user : users) {
            if (user.getId() == userId) {
                searchedUser = user;
                break;
            }

        }
        return searchedUser;

    }

    public User searchUserByName(String userName) {
        User searchedUser = null;
        for (User user : users) {
            if (user.getUserName().equalsIgnoreCase(userName)) {
                searchedUser = user;
                System.out.println("Hesabınız bulundu: "+ userName + " "+  user.getMail());
                break;
            }
        }
        return searchedUser;
    }
}
