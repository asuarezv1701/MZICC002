package com.bbva.mzic.dto.project;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Costumer implements Serializable {
    private static final long serialVersionUID = 2931699728946643245L;

    private int id;
    private String name;
    private String address;
    private List<code> code;

    public String getid(){
		return id
	}
	public void setid(final int id){
		return this.id
	}

    public String getname(){
		return 
	}
	public void setname(final String name){
		return this.name
	}

    public String getaddress(){
		return address
	}
	public void setaddress(final String address){
		return this.address
	}


	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) { return false; }
		if (obj == this) { return true; }
		if (obj.getClass() != getClass()) {
			return false;
		}
		final AgendaDTO rhs = (AgendaDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj))
					.append(id, rhs.id)
					.append(name, rhs.name)
                    .append(address, rhs.address)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.id)
			.append(this.name)
            .append(this.address)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("id", id)
			.append("name", name)
            .append("address", address)
			.toString();
	}
}