package tableforsubclass.inheritancetype.PojoClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("CR")
public class CredtCard extends Payment{
	
	private int cardNumber;
	private String cardType;
	public CredtCard() {
		super();
	}
	public CredtCard(int cardNumber, String cardType) {
		super();
		this.cardNumber = cardNumber;
		this.cardType = cardType;
	}
	public int getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "CredtCard [cardNumber=" + cardNumber + ", cardType=" + cardType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cardNumber;
		result = prime * result + ((cardType == null) ? 0 : cardType.hashCode());
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
		CredtCard other = (CredtCard) obj;
		if (cardNumber != other.cardNumber)
			return false;
		if (cardType == null) {
			if (other.cardType != null)
				return false;
		} else if (!cardType.equals(other.cardType))
			return false;
		return true;
	}
	
	
	
}
