package tableforsubclass.inheritancetype.PojoClass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="pmode", discriminatorType=DiscriminatorType.STRING,length=7)
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int paymentId;
private double amount;
public Payment() {
	super();
}
public Payment(int paymentId, double amount) {
	super();
	this.paymentId = paymentId;
	this.amount = amount;
}
public int getPaymentId() {
	return paymentId;
}
public void setPaymentId(int paymentId) {
	this.paymentId = paymentId;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "Payment [paymentId=" + paymentId + ", amount=" + amount + "]";
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	long temp;
	temp = Double.doubleToLongBits(amount);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + paymentId;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Payment other = (Payment) obj;
	if (Double.doubleToLongBits(amount) != Double.doubleToLongBits(other.amount))
		return false;
	if (paymentId != other.paymentId)
		return false;
	return true;
}




}
