package Test;

public class Images {
    private String role;
    private String image;

    public Images(String role, String image) {
        this.role = role;
        this.image = image;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
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
