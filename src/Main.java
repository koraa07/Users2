public class Main {
    public static void main(String[] args) {
        try {
            User user1 = new User("username", "short");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            User user = new User("JohnDoe", "1234568y");
            System.out.println("Пользователь зарегистрирован: " + user.getUsername());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}