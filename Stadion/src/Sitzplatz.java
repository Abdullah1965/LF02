public class Sitzplatz {
    private int reihe;
    private int sitz;
    private Block block;
    private Zuschauer zuschauer;
    private Sitzplatz(Block block,int reihe,int sitz,Zuschauer zuschauer){
        this.block = block;
        this.reihe = reihe;
        this.sitz = sitz;
        this.zuschauer = zuschauer;
    }

    public int getReihe() {
        return reihe;
    }

    public void setReihe(int reihe) {
        this.reihe = reihe;
    }

    public int getSitz() {
        return sitz;
    }

    public void setSitz(int sitz) {
        this.sitz = sitz;
    }

    public Block getBlock() {
        return block;
    }

    public void setBlock(Block block) {
        this.block = block;
    }

    public Zuschauer getZuschauer() {
        return zuschauer;
    }

    public void setZuschauer(Zuschauer zuschauer) {
        this.zuschauer = zuschauer;
    }

    @Override
    public String toString() {
        return "Sitzplatz{" +
                "reihe=" + reihe +
                ", sitz=" + sitz +
                ", block=" + block +
                ", zuschauer=" + zuschauer +
                '}';
    }
}
