package one_to_many;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Student {
	
	@Id
	private int id;
	private String name;
	private String branch;
	
	
	 
	 
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getBranch() {
		return branch;
	}
	
	public void setBranch(String branch) {
		this.branch=branch;
	}

    
	@Override
	public String toString() {
		return "Id :"+id+" Name: "+name+" Branch: "+ branch;
	}
}
