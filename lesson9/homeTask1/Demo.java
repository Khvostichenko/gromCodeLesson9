package lesson9.homeTask1;

public class Demo {
    public static void main(String[] args) {
        User user1 = new User(132,"Jack","132456");
        User user2 = new User(456,"Bob","789456");
        User user3 = new User(789,"Stive","123789");
        User user4 = new User(159,"Mike","456789");
        User us = null;

        User[] users = {user1,user2,user3,user4, us,us,us};

        UserRepository userRepository = new UserRepository(users);

        long[] userIds = userRepository.getUserIds();
        String[] userNames = userRepository.getUserNames();
        String UserName = userRepository.getUserNameById(245);

        System.out.println("User names: ");
        for (String a: userNames) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("User Ids: ");
        for (long a: userIds) {
            System.out.print(a + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("User name by Id: ");
        System.out.println(UserName);

        User[] users2 = {};
        UserRepository userRepository2 = new UserRepository(users2);
        String[] userNames2 = userRepository2.getUserNames();
        System.out.println();
        System.out.println("User names2: ");
        for (String a: userNames2) {
            System.out.print(a + " ");
        }

    }
}
