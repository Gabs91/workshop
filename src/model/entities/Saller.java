package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Saller implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private String emai;
	private Date birthDate;
	private Double baseSalary;
	
	private Departament departament;

	public Saller() {
	}

	public Saller(Integer id, String name, String emai, Date birthDate, Double baseSalary, Departament departament) {
		this.id = id;
		this.name = name;
		this.emai = emai;
		this.birthDate = birthDate;
		this.baseSalary = baseSalary;
		this.departament = departament;
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

	public String getEmai() {
		return emai;
	}

	public void setEmai(String emai) {
		this.emai = emai;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Saller other = (Saller) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Saller [id=" + id + ", name=" + name + ", emai=" + emai + ", birthDate=" + birthDate + ", baseSalary="
				+ baseSalary + ", departament=" + departament + "]";
	}
}
