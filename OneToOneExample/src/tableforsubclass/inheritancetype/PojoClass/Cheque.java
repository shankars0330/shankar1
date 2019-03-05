package tableforsubclass.inheritancetype.PojoClass;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("CH")
public class Cheque extends Payment{
	
	private int chequeNumber;
	private String chequeType;
	public Cheque() {
		super();
	}
	public Cheque(int chequeNumber, String chequeType) {
		super();
		this.chequeNumber = chequeNumber;
		this.chequeType = chequeType;
	}
	public int getChequeNumber() {
		return chequeNumber;
	}
	public void setChequeNumber(int chequeNumber) {
		this.chequeNumber = chequeNumber;
	}
	public String getChequeType() {
		return chequeType;
	}
	public void setChequeType(String chequeType) {
		this.chequeType = chequeType;
	}
	@Override
	public String toString() {
		return "Cheque [chequeNumber=" + chequeNumber + ", chequeType=" + chequeType + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + chequeNumber;
		result = prime * result + ((chequeType == null) ? 0 : chequeType.hashCode());
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
		Cheque other = (Cheque) obj;
		if (chequeNumber != other.chequeNumber)
			return false;
		if (chequeType == null) {
			if (other.chequeType != null)
				return false;
		} else if (!chequeType.equals(other.chequeType))
			return false;
		return true;
	}

}
