/**
 * 
 */
package com.bsp.hibernate.vo;

/**
 * @author dcelano
 *
 */
public class Employee {

	private String matricula;
	private String nome;
	private String filial;
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}
	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * @return the filial
	 */
	public String getFilial() {
		return filial;
	}
	/**
	 * @param filial the filial to set
	 */
	public void setFilial(String filial) {
		this.filial = filial;
	}		
}
