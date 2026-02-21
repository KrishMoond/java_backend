package com.prac;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Support {
	@Id
	private long tickedId;
	private String issue;
	private String status;
	
	public long getTickedId() {
		return tickedId;
	}
	public void setTickedId(long tickedId) {
		this.tickedId = tickedId;
	}
	public String getIssue() {
		return issue;
	}
	public void setIssue(String issue) {
		this.issue = issue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
