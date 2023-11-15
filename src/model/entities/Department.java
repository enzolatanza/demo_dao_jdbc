package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Department implements Serializable{

	private static final long serialVersionUID = 1L;
	/*
	 * Deve-se implementar o seralizeble para que os objetos
	 * possam ser transformados em bytes para poder
	 * ser trafegados em rede, arquivos..
	 * */
	private Integer id;
	private String name;
	public Department() {
	}
	public Department(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	//gerando hashcode and equals
	//para que os objetos possam ser comparados pelo conteudo
	//e não pela referencia dos ponteiros
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		return Objects.equals(id, other.id);
	}
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

	
	
}
