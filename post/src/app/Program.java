package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		Post p1 = new Post
				(sdf.parse("06/05/2019 09:12:54"),
				"Traveling to New Zealand",
				"I am going to visit this wonderful country!",
				12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		
		Comment c3 = new Comment("Good night!");
		Comment c4 = new Comment("May the force be with you");
		
		Post p2 = new Post
				(sdf.parse("08/05/2019 11:48:44"),
				"Good night friends!",
				"See you, bye!",
				6);
		
		p2.addComment(c3);
		p2.addComment(c4);
		
		System.out.println(p1);
		System.out.println(p2);
	}
}
