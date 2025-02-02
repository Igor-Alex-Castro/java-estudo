package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
	//n precisa de uma copia, cria apenas o obj apena suma vez
	
	private String moment;
	private String title;
	private String content;
	private int likes;
	private List<Comment> comments = new  ArrayList<>();
	
	public Post(){
		
	}
	
	
	public Post(String moment, String title, String content, int likes) {
		super();
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}


	public String getMoment() {
		return moment;
	}
	
	public void setMoment(String moment) {
		this.moment = moment;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
	
	public List<Comment> getComments() {
		return comments;
	}


	public void addCommet(Comment comment) {
		comments.add(comment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(title + "\n");
		sb.append(likes + " Likes - " + sdf.format( moment));
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		for (Comment comment : comments) {
			sb.append(sb.append(comment.getText()) + "\n");
		}
		
		return sb.toString();
	}
	
	
}
