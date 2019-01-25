package com.epam.keiko.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table
public class Hall
{
	@Id
	@Column
	private Integer id;
	@Column
	private String name;
	@Column
	private Integer number;

	public Hall()
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

	public void setNumber(final Integer number)
	{
		this.number = number;
	}
}
