package lesson9.homeTask1;

public class UserRepository {

    private User[] users;

    public UserRepository(User[] users) {
        this.users = users;
    }

    public User[] getUsers() {
        return users;
    }

    public String[] getUserNames() {

            String[] userNames = new String[users.length];

            for (int i = 0; i < users.length; i++) {

                if(users[i] == null) {
                    userNames[i] = null;
                } else{
                    userNames[i] = users[i].getName();
                }
            }

            return userNames;
    }

    public long[] getUserIds(){
        int counter = 0;

        for(User a : users){
            if(a != null){
                counter++;
            }
        }

        long[] userIds = new long[counter];

        for (int i = 0; i < userIds.length; i++) {
            if (users[i] == null) {
                continue;
            } else {
                userIds[i] = users[i].getId();
            }
        }
        return userIds;
    }

    public String getUserNameById(long id){
            for (int i = 0; i < users.length; i++) {

                if (users[i] == null)
                    continue;

                if (users[i].getId() == id) {
                    return users[i].getName();
                }
            }

        return null;
    }

    //part3
    public User getUserByName(String name){
        for (User a : users) {
            if(a == null)
                return null;

            if(a.getName() == name) {
                return a;
            }
        }
        return null;
    }

    /*public User getUserById(long id){
        for (User a : users) {
            if(a == null)
                return null;

            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }*/

    public User findById(long id){
        for (User a : users) {
            if(a == null)
                return null;

            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }

    /*private User findById(long id){
        for (User a : users) {
            if(a == null)
                return null;

            if(a.getId() == id) {
                return a;
            }
        }
        return null;
    }*/

    public User getUserBySessionId(String sessionId){
        for (User a : users) {
            if(a == null)
                return null;

            if(a.getSessionId() == sessionId) {
                return a;
            }
        }
        return null;
    }

    //part 4
    public User save(User user){

        if(findById(user.getId()) != null){
            return null;
        }

        for(int i=0; i<users.length;i++){
            if(users[i] == null) {
                users[i] = user;
                break;
            }
        }

        return findById(user.getId());
    }

    //part 5
    public User update(User user){
        if(user != null) {
            if (findById(user.getId()) != null) {
                for (int i = 0; i < users.length; i++) {
                    if (users[i].getId() == user.getId()) {
                        users[i] = user;
                        return  users[i];
                    }
                }
            }

            return findById(user.getId());
        } else {
            return null;
        }
    }

    public void delete(long id) {
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                if (users[i].getId() == id) {
                    users[i] = null;
                }
            }
        }
    }
}
