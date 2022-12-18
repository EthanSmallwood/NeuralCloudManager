package Test;

public class Stars {
    private double star;
    private int fragment;
    private int fragmentTotal;
    private int diggcoins;
    private int diggcoinsTotal;

    public Stars(double star, int fragment, int fragmentTotal, int diggcoins, int diggcoinsTotal) {
        this.star = star;
        this.fragment = fragment;
        this.fragmentTotal = fragmentTotal;
        this.diggcoins = diggcoins;
        this.diggcoinsTotal = diggcoinsTotal;
    }

    public double getStar() {
        return star;
    }

    public void setStar(double star) {
        this.star = star;
    }

    public int getFragment() {
        return fragment;
    }

    public void setFragment(int fragment) {
        this.fragment = fragment;
    }

    public int getFragmentTotal() {
        return fragmentTotal;
    }

    public void setFragmentTotal(int fragmentTotal) {
        this.fragmentTotal = fragmentTotal;
    }

    public int getDiggcoins() {
        return diggcoins;
    }

    public void setDiggcoins(int diggcoins) {
        this.diggcoins = diggcoins;
    }

    public int getDiggcoinsTotal() {
        return diggcoinsTotal;
    }

    public void setDiggcoinsTotal(int diggcoinsTotal) {
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
