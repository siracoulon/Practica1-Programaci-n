package es.uah.matcomp.mp.e1.ejerciciosclases.ej1_5;


public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    /** Constructor principal da valores a los atributos */
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    /** Getter para id */
    public String getId() {
        return id;
    }
    /** Getter para desc */
    public String getDesc() {
        return desc;
    }
    /** Getter para qty */
    public int getQty() {
        return qty;
    }
    /** Setter para qty*/
    public void setQty(int qty) {
        this.qty = qty;
    }
    /** Getter para unitPrice */
    public double getUnitPrice() {
        return unitPrice;
    }
    /** Setter para unitPrice */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    /** Getter para el total */
    public double getTotal() {
        return qty * unitPrice;
    }
    /** toString */
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ", unitPrice=" + unitPrice +"]";
    }
}