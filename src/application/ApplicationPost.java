package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import javax.swing.text.AbstractDocument.Content;

import entities.Comment;
import entities.Post;

public class ApplicationPost {
	public static void main(String[] args) throws ParseException  {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		
		
		
		String datePost = sdf.format(new Date());
	
		
		Post post = new Post(datePost, 
				"Traveling to New Zealand",
				"I`m going to visit this wonderful country", 12);
		
		
		post.addCommet(new Comment("Have a nice trip"));
		post.addCommet(new Comment("Wow that`s awesome!"));
		
		
		 datePost = sdf.format(new Date());
		
		Post post2 = new Post(datePost, 
				"Good nigth guys",
				"See you tomorrow", 5);
		
		post2.addCommet(new Comment("Good nigth"));
		post2.addCommet(new Comment("May the Force be with you"));
		
		System.out.println(post.getContent());
		System.out.println(post.getLikes() + " Likes - " + post.getMoment());
		System.out.println(post.getContent());
		System.out.println("Comments: ");
		System.out.println(post.getComments().get(0).getText());
		System.out.println(post.getComments().get(1).getText());
		
		System.out.println();
		
		System.out.println(post2.getContent());
		System.out.println(post2.getLikes() + " likes - " + post.getMoment());
		System.out.println(post2.getContent());
		System.out.println("Comments: ");
		System.out.print(post2.getComments().get(0).getText());
		System.out.print(post2.getComments().get(1).getText());
	}
}	
