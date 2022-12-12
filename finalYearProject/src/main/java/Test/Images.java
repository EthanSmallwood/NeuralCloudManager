package Test;

public class Images {
    private String role;
    private String image;

    public Images(String role, String image) {
        this.role = role;
        this.image = image;
    }

    @Override
    public String toString() {
        return "RoleImages{" +
                "role='" + role + '\'' +
                ", image='" + image + '\'' +
                '}';
    }
}
