package com.te.quizapp.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Data
@Entity
public class Category 
{
	@Column @Id
	private int cid;
	
	@Column
	private String cname;
	
	
	@Column
	@OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
	private List<Questions> questions;
	
	
}
