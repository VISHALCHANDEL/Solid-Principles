public class UserManager {

    public void add(User user){
        if(user.getAge()<18){
            throw new IllegalArgumentException("User is not adult");
        }

    }
    public void delete(User user){
        System.out.println("User deleted");
    }
    public void update(User user){
        if(user.getAge()<18){
            throw new IllegalArgumentException("User is not adult");
        }
        System.out.println("User updated");
    }
    public void get(User user){
        System.out.println("User return ed");
    }

    public void logUserAcitvity(User user){
        System.out.println("User activity logged");
    }
    // now this function started violating the single responsibility principle because it is doing two things, managing user and logging user activity
}
