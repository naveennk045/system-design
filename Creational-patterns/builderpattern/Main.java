package builderpattern;
public class Main {
    public static void main(String[] args) {
        // Create initial user
        User user = new User.UserBuilder("John")
                .setEmail("john@example.com")
                .setAge(30)
                .setProfilePicture("profile.jpg")
                .build();

        // Update user email using builder
        User updatedUser = user.toBuilder()
                .setEmail("newjohn@example.com")
                .build();

        System.out.println(user.getEmail());
        System.out.println(updatedUser.getEmail());
    }
}
