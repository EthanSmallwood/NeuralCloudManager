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


    public String toString() {
        return "Doll [id=" + id + ", name=" + name + ", role=" + role + ", image=" + image + "]";
    }

}
