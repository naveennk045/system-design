package builderpattern;

public class User {
    private final String username;
    private final String email;
    private final int age;
    private final String profilePicture;

    private User(UserBuilder builder) {
        this.username = builder.username;
        this.email = builder.email;
        this.age = builder.age;
        this.profilePicture = builder.profilePicture;
    }

    // Getters
    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public int getAge() { return age; }
    public String getProfilePicture() { return profilePicture; }

    public static class UserBuilder {
        private String username;
        private String email;
        private int age;
        private String profilePicture;

        public UserBuilder(String username) {
            this.username = username;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setProfilePicture(String profilePicture) {
            this.profilePicture = profilePicture;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    // Helper to create builder from existing user
    public UserBuilder toBuilder() {
        return new UserBuilder(this.username)
                .setEmail(this.email)
                .setAge(this.age)
                .setProfilePicture(this.profilePicture);
    }
}
