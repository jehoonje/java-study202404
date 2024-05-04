package Practice;

public class RecordShop {
    private String record;
    private String staff;
    private String customer;
    private String turnTable;

    public RecordShop(String record, String staff, String customer, String turnTable) {
        this.record = record;
        this.staff = staff;
        this.customer = customer;
        this.turnTable = turnTable;
    }

    public String getRecord() {return record;}

    public void setRecord(String record) {this.record = record;}

    public String getStaff() {return staff;}

    public void setStaff(String staff) {this.staff = staff;}

    public String getCustomer() {return customer;}

    public void setCustomer(String customer) {this.customer = customer;}

    public String getTurnTable() {return turnTable;}

    public void setTurnTable(String turnTable) {this.turnTable = turnTable;}

    @Override
    public String toString() {
        return "RecordShop{" +
                "record='" + record + '\'' +
                ", staff='" + staff + '\'' +
                ", customer='" + customer + '\'' +
                ", turnTable='" + turnTable + '\'' +
                '}';
    }
}
