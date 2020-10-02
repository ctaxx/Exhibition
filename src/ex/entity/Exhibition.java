package ex.entity;

public class Exhibition {
	private String name;
	private String subject;
	private java.util.Date startDate;
	private java.util.Date endDate;
	private double price;
	private int Place_id;

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getSubject(){
		return subject;
	}

	public void setSubject(String subject){
		this.subject=subject;
	}

	public java.util.Date getStartdate(){
		return startDate;
	}

	public void setStartdate(java.util.Date startDate){
		this.startDate=startDate;
	}

	public java.util.Date getEnddate(){
		return endDate;
	}

	public void setEnddate(java.util.Date endDate){
		this.endDate=endDate;
	}

	public double getPrice(){
		return price;
	}

	public void setPrice(double price){
		this.price=price;
	}

	public int getPlace_id(){
		return Place_id;
	}

	public void setPlace_id(int Place_id){
		this.Place_id=Place_id;
	}
}
