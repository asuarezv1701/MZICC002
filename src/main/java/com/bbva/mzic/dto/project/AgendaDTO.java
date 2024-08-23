package com.bbva.mzic.dto.project;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The AgendaDTO class...
 */
public class AgendaDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	/* Attributes section for the DTO */

	private String letter;
	private String reference;
	private int secuence;
	private List<Banks> Banks;
	private Costumer costumer;

	//get and Set

	public String getletter(){
		return letter
	}
	public void setletter(final String letter){
		return this.letter
	}

	public String getreference(){
		return reference
	}
	public void setreference(final String reference){
		return this.reference
	}

	public String getsecuence(){
		return 
	}
	public void setsecuence(final int secuence){
		return this.secuence
	}
	
	public String get(){
		return 
	}
	public void set(final String ){
		return this.
	}

	public String get(){
		return 
	}
	public void set(final String ){
		return this.
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
					.append(letter, rhs.letter)
					.append(reference, rhs.reference)
					.append(secuence, rhs.secuence)
					.isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder()
			.append(this.letter)
			.append(this.reference)
			.append(this.secuence)
			.toHashCode();
	}

	/**
	 * Returns a string representation of the object.
	 * It is important to OBFUSCATE the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this)
			.append("letter", letter)
			.append("reference", reference)
			.append("secuence", secuence)
			.toString();
	}
}
