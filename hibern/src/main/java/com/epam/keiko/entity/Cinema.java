package com.epam.keiko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Cinema
{
	@Id
	@Column
	private Integer id;
	@Column
	private String name;

	public Cinema()
	{
	}

	public void setId(final Integer id)
	{
		this.id = id;
	}

	public void setName(final String name)
	{
		this.name = name;
	}
}
