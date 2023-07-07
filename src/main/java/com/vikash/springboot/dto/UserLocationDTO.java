package com.vikash.springboot.dto;

public class UserLocationDTO {
	private long userId;
	private String email;
	private String place;
	private double longitude;
	private double latitude;

	public UserLocationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserLocationDTO(long userId, String email, String place, double longitude, double latitude) {
		super();
		this.userId = userId;
		this.email = email;
		this.place = place;
		this.longitude = longitude;
		this.latitude = latitude;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	@Override
	public String toString() {
		return "UserLocationDTO [userId=" + userId + ", email=" + email + ", place=" + place + ", longitude="
				+ longitude + ", latitude=" + latitude + "]";
	}

}
