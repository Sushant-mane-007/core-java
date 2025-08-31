public class Invoice {
        private int quantity;
        private String partNo = "1ju2b1hvgtv";
        private String partDiscrip = "Not useful for home application";
        private double price =500;

        public Invoice() {

        }

    public Invoice(int quantity, String partNo, String partDiscrip,  double price) {
        this.quantity = quantity;
        this.partNo = partNo;
        this.partDiscrip = partDiscrip;
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "quantity=" + quantity +
                ", partNo='" + partNo + '\'' +
                ", partDiscrip='" + partDiscrip + '\'' +
                ", price=" + price +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
            if(quantity < 0)
                this.quantity = 0;
            else{
                this.quantity = quantity;
            }

    }

    public String getPartNo() {
        return partNo;
    }

    public void setPartNo(String partNo) {
        this.partNo = partNo;
    }

    public String getPartDiscrip() {
        return partDiscrip;
    }

    public void setPartDiscrip(String partDiscrip) {
        this.partDiscrip = partDiscrip;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
            if(price < 0 ){
                this.price = 0;
            }else{
                this.price = price;
            }

    }
}
