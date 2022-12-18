package Test;

public class Doll {

    private int id;
    private String name;
    private String role;
    private String image;

    public Doll(int id, String name, String role, String image) {
        this.id = id;
        this.name = name;
        this.role = role;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String toString() {
        return "Doll [id=" + id + ", name=" + name + ", role=" + role + ", image=" + image + "]";
    }

}
