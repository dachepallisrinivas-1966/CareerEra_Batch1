package com.ce.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "movies")
public class Movie {
	@Id
	private int mId;
	private String mName;
	
	@ManyToMany(mappedBy = "movies")
	private Set<Artist> artists;
	
	public Movie() {
		/* default constructor */
	}

	public Movie(int mId, String mName, Set<Artist> artists) {
		super();
		this.mId = mId;
		this.mName = mName;
		this.artists = artists;
	}

	public int getmId() {
		return mId;
	}

	public void setmId(int mId) {
		this.mId = mId;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public Set<Artist> getArtists() {
		return artists;
	}

	public void setArtists(Set<Artist> artists) {
		this.artists = artists;
	}
	
}
