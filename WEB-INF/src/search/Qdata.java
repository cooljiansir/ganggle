package search;

public class Qdata {
	String href;
	String title;
	String date;
	String content;
	
	public Qdata(){};
	public Qdata(String href, String title, String date, String content) {
		this.href = href;
		this.title = title;
		this.date = date;
		this.content = content;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
