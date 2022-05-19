/**
 * 
 */
package br.com.juliano.domain;

import java.io.Serializable;
import java.util.Objects;

/**
 * Classe que visa implmentar uma Televisao
 * @author Juliano Roque Vieira
 * @version 1.0.0
 * @see http://www.github.com/jrvieirapr/repo2
 *
 */
/**
 * @author 9310
 *
 */

public class Televisao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// public - visevel a quem usar a classe
	// protected - visivel para quem herdar a classe
	// private - visivel apenas dentro da classe
	private Integer tamanhoTela;

	private String marca;

	private String modelo;

	private Integer voltagem;

	public Televisao() {

	}

	/**
	 * Metodo construtor da Televisao
	 * 
	 * @param tamanhoTela - Define o tamanho da tela
	 * @param marca       - Define a marca da televisao
	 * @param modelo      - Define o modelo da televisao
	 * @param voltagem    - Define a voltagem da televisao
	 */
	public Televisao(Integer tamanhoTela, String marca, String modelo, Integer voltagem) {
		super();
		this.tamanhoTela = tamanhoTela;
		this.marca = marca;
		this.modelo = modelo;
		this.voltagem = voltagem;
	}

	@Override
	public int hashCode() {
		return Objects.hash(marca, modelo, tamanhoTela, voltagem);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Televisao other = (Televisao) obj;
		return Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo)
				&& Objects.equals(tamanhoTela, other.tamanhoTela) && Objects.equals(voltagem, other.voltagem);
	}

	/**
	 * @return the tamanhoTela
	 */
	public Integer getTamanhoTela() {
		return tamanhoTela;
	}

	/**
	 * @param tamanhoTela the tamanhoTela to set
	 */
	public void setTamanhoTela(Integer tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}

	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the voltagem
	 */
	public Integer getVoltagem() {
		return voltagem;
	}

	/**
	 * @param voltagem the voltagem to set
	 */
	public void setVoltagem(Integer voltagem) {
		this.voltagem = voltagem;
	}

	@Override
	public String toString() {
		return "Televisao [tamanhoTela=" + tamanhoTela + ", marca=" + marca + ", modelo=" + modelo + ", voltagem="
				+ voltagem + "]";
	}

}
