package Test;

public class Breakthrough {
    private int level;
    private int simplified;
    private int standard;
    private int advanced;
    private int premium;
    private int pioneering;
    private int rainbow;
    private int diggcoins;


    public Breakthrough(int level, int simplified, int standard, int advanced, int premium, int pioneering, int rainbow, int diggcoins) {
        this.level = level;
        this.simplified = simplified;
        this.standard = standard;
        this.advanced = advanced;
        this.premium = premium;
        this.pioneering = pioneering;
        this.rainbow = rainbow;
        this.diggcoins = diggcoins;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getSimplified() {
        return simplified;
    }

    public void setSimplified(int simplified) {
        this.simplified = simplified;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getAdvanced() {
        return advanced;
    }

    public void setAdvanced(int advanced) {
        this.advanced = advanced;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getPioneering() {
        return pioneering;
    }

    public void setPioneering(int pioneering) {
        this.pioneering = pioneering;
    }

    public int getRainbow() {
        return rainbow;
    }

    public void setRainbow(int rainbow) {
        this.rainbow = rainbow;
    }

    public int getDiggcoins() {
        return diggcoins;
    }

    public void setDiggcoins(int diggcoins) {
        this.diggcoins = diggcoins;
    }

    @Override
    public String toString() {
        return "Breakthrough{" +
                "level=" + level +
                ", simplified=" + simplified +
                ", standard=" + standard +
                ", advanced=" + advanced +
                ", premium=" + premium +
                ", pioneering=" + pioneering +
                ", rainbow=" + rainbow +
                ", diggcoins=" + diggcoins +
                '}';
    }
}
