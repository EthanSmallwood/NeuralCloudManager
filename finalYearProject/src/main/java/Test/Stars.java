package Test;

public class Stars {
    private String star;
    private int fragment;
    private int fragmentTotal;
    private int diggcoins;
    private int diggcoinsTotal;

    public Stars(String star, int fragment, int fragmentTotal, int diggcoins, int diggcoinsTotal) {
        this.star = star;
        this.fragment = fragment;
        this.fragmentTotal = fragmentTotal;
        this.diggcoins = diggcoins;
        this.diggcoinsTotal = diggcoinsTotal;
    }

    @Override
    public String toString() {
        return "Stars{" +
                "star='" + star + '\'' +
                ", fragment=" + fragment +
                ", fragmentTotal=" + fragmentTotal +
                ", diggcoins=" + diggcoins +
                ", diggcoinsTotal=" + diggcoinsTotal +
                '}';
    }
}
