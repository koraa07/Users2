public class User {
    private String username;
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void registerUser(String username, String password){
        if (username == null || username.length() == 0) {
            throw new IllegalArgumentException("Имя пользователя не должно быть пустым или " +
                    "содержать пробелы.");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Пароль должен содержать не менее 8 символов.");
        }
        this.username = username;
        this.password = password;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

