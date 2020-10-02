package ex.entity;

public class Ticket {
	private java.util.Date date;
	private int user_id;
	private int exhibition_id;

	public java.util.Date getDate(){
		return date;
	}

	public void setDate(java.util.Date date){
		this.date=date;
	}

	public int getUser_id(){
		return user_id;
	}

	public void setUser_id(int user_id){
		this.user_id=user_id;
	}

	public int getExhibition_id(){
		return exhibition_id;
	}

	public void setExhibition_id(int exhibition_id){
		this.exhibition_id=exhibition_id;
	}
}
