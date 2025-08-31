public class CostCal {
    private double km;
    private double tollFee;
    private double parkingFee;
    private double avgMiledPerGal;
    private double costPerGal;

    public CostCal(double km, double tollFee, double parkingFee, double avgMiledPerGal, double costPerGal) {
        this.km = km;
        this.tollFee = tollFee;
        this.parkingFee = parkingFee;
        this.avgMiledPerGal = avgMiledPerGal;
        this.costPerGal = costPerGal;
    }

    public CostCal(){

    }

    @Override
    public String toString() {
        return "CostCal{" +
                "km=" + km +
                ", tollFee=" + tollFee +
                ", parkingFee=" + parkingFee +
                ", avgMiledPerGal=" + avgMiledPerGal +
                ", costPerGal=" + costPerGal +
                '}';
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public double getTollFee() {
        return tollFee;
    }

    public void setTollFee(double tollFee) {
        this.tollFee = tollFee;
    }

    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    public double getAvgMiledPerGal() {
        return avgMiledPerGal;
    }

    public void setAvgMiledPerGal(double avgMiledPerGal) {
        this.avgMiledPerGal = avgMiledPerGal;
    }

    public double getCostPerGal() {
        return costPerGal;
    }

    public void setCostPerGal(double costPerGal) {
        this.costPerGal = costPerGal;
    }
}
