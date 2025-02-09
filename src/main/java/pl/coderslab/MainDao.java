package pl.coderslab;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;


public class MainDao {
    public static void main(String[] args) {

        UserDao userDao = new UserDao();

        // Test 1: Utworzenie użytkowników
        User newUser = new User();
        newUser.setUserName("newUser1");
        newUser.setEmail("newUser1@gmail.com");
        newUser.setPassword("newUser1");
        User newUser2 = new User();
        newUser2.setUserName("newUser2");
        newUser2.setEmail("newUser2@gmail.com");
        newUser2.setPassword("newUser2");

        User createdUser = userDao.createUser(newUser);
        System.out.println("Utworzono użytkownika: " + createdUser);
        User createdUser2 = userDao.createUser(newUser2);
        System.out.println("Utworzona użytkownika 2: " + createdUser2);

        // Test 2: Odczytanie użytkowników
        User readUser = userDao.readUser(createdUser.getId());
        System.out.println("Odczytano użytkownika: " + readUser);
        User readUser2 = userDao.readUser(createdUser2.getId());
        System.out.println("Odczytano użytkownika 2: " + readUser2);

        // Test 3: Aktualizacja użytkownika
        readUser.setUserName("new_User1");
        readUser.setEmail("new_User1@gmail.com");
        readUser.setPassword("new_User1");

        userDao.updateUser(readUser);
        System.out.println("Użytkownik został zaktualizowany");

        // Test 4: Pobieranie wszystkich użytkowników
        User[] allUsers = userDao.findAllUsers();
        System.out.println("Wszyscy użytkownicy: ");
        for (User user : allUsers) {
            System.out.println(user);
        }

        // Test 5: Usunięcie użytkownika
        userDao.deleteUser(createdUser2.getId());
        System.out.println("Usunięto użytkownika: " + createdUser2.getId());


    }


}