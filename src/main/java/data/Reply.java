package data;

import java.sql.Date;

public class Reply {

	String id;
	String moim_id;
	String writer;
	String ment;
	Date writed;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getMoim_id() {
		return moim_id;
	}
	public void setMoim_id(String moim_id) {
		this.moim_id = moim_id;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getMent() {
		return ment;
	}
	public void setMent(String ment) {
		this.ment = ment;
	}
	public Date getWrited() {
		return writed;
	}
	public void setWrited(Date writed) {
		this.writed = writed;
	}
	
	
}
