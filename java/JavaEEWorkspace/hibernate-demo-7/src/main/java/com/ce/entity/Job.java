package com.ce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jobs")
public class Job {
	@Id
	@Column(name = "job_id")
	private String jobId;
	
	@Column(name = "job_title")
	private String jobTitle;

	@Override
	public String toString() {
		return String.format("jobId=%s, jobTitle=%s", jobId, jobTitle);
	}
	
	
}