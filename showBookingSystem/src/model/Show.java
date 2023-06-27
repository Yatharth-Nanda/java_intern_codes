package model;

public class Show {
	private int showId;
	private String showName;
	private String showTime;
	private int totalSeats;
	private int availableSeats;
	private boolean isActive = true;
	
	// Constructors
	public Show() {}
	public Show(int showId, String showName, String showTime, int totalSeats) {
		super();
		this.showId = showId;
		this.showName = showName;
		this.showTime = showTime;
		this.totalSeats = totalSeats;
		availableSeats = totalSeats;
	}
	
	// Getter and Setter
	public int getShowId() {
		return showId;
	}
	public void setShowId(int showId) {
		this.showId = showId;
	}
	public String getShowName() {
		return showName;
	}
	public void setShowName(String showName) {
		this.showName = showName;
	}
	public String getShowTime() {
		return showTime;
	}
	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int noofSeats) {
		this.totalSeats = noofSeats;
	}
	
	public int getAvailableSeats() {
		return availableSeats;
	}
	public void setAvailableSeats(int availableSeats) {
		this.availableSeats = availableSeats;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "Show [\n\tshowId=" + showId + ",\n\tshowName=" + showName + ",\n\tshowTime=" + showTime
				+ ",\n\ttotalSeats=" + totalSeats + ",\n\tavailableSeats=" + availableSeats + ",\n\tisActive="
				+ isActive + "\n]\n";
	}
	
	
	
	
}
