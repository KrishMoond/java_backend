package com.prac;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Lead {

	@Id
	private long leadId;
	private String source;
	private String status;
	
	@ManyToOne
	private SalesEmployee se;
	
	public long getLeadId() {
		return leadId;
	}
	public void setLeadId(long leadId) {
		this.leadId = leadId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
