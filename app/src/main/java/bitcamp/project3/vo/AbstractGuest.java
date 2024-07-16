package bitcamp.project3.vo;

public abstract class AbstractGuest implements Guest{

    protected String type;
    protected int lossForce;
    protected int reputation;
    protected int rentPeriod;
    protected int tiredness;

    protected AbstractGuest(String type, int lossForce, int reputation, int tiredness) {
        this.type = type;
        this.lossForce = lossForce;
        this.reputation = reputation;
        this.tiredness = tiredness;
    }

    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public int getLossForce() {
        return lossForce;
    }

    @Override
    public int getReputation() {
        return reputation;
    }

    @Override
    public void setRentPeriod(int rentPeriod) {
        this.rentPeriod = rentPeriod;
    }

    @Override
    public int getRentPeriod() {
        return this.rentPeriod;
    }

    @Override
    public int getTiredness() {
        return this.tiredness;
    }

    @Override
    public void setTiredness(int tiredness) {
        this.tiredness = tiredness;
    }
}
