package prod.model;

public class Product 
{
private int prodId;
private String prodName;
private double price;
private int QtyinHand;
public int getProdId() {
	return prodId;
}
public void setProdId(int prodId) {
	this.prodId = prodId;
}
public String getProdName() {
	return prodName;
}
public void setProdName(String prodName) {
	this.prodName = prodName;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}

public int getQtyinHand() {
	return QtyinHand;
}
public void setQtyinHand(int qtyinHand) {
	QtyinHand = qtyinHand;
}
public Product(int prodId, String prodName,  int qtyinHand,double price) {
	super();
	this.prodId = prodId;
	this.prodName = prodName;
	this.price = price;
	this.QtyinHand = qtyinHand;
}
@Override
public String toString() {
	return prodName + "is selling for  Rs  " + price + " and quantity is " + QtyinHand;
}



}
