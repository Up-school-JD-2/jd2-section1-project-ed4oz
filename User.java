public class User {
    private int userId;
    private String userName;
    private String password;
    private String mail;

    public User(int id, String userName, String password, String mail) {
        this.userId = id;
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }
    public int getId(){
        return userId;
    }
    public void setId(int id){
        this.userId=id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + userId +
                ", userName='" + userName + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
