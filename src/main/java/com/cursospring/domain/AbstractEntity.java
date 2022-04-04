package com.cursospring.domain;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Aplicação com Spring Web para treino.
 *
 * @author João Pimenta
 * @since 29/03/2022
 */
@Data
@EqualsAndHashCode(callSuper = false)
@SuppressWarnings("serial")
@MappedSuperclass
public abstract class AbstractEntity<ID extends Serializable> implements Serializable {

	/**
	 * Generate an unique Id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private ID id;

//	/**
//	 * @return the id
//	 */
//	public ID getId() {
//		return id;
//	}
//
//	/**
//	 * @param id the id to set
//	 */
//	public void setId(ID id) {
//		this.id = id;
//	}
//
//	@Override
//	public int hashCode() {
//		return Objects.hash(id);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		AbstractEntity<?> other = (AbstractEntity<?>) obj;
//		return Objects.equals(id, other.id);
//	}
//
//	@Override
//	public String toString() {
//		return "id= " + id;
//	}

}
