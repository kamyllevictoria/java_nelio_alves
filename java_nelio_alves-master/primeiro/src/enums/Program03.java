package enums;

import enums.entitiesI.Comment;
import enums.entitiesI.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program03 {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment ("Wow! Thats awesome!");
        Post p1 = new Post(sdf.parse("21/06/2024 13:02:15"),
                "Going to Brazil!",
                "I'm going to my birth city!",
                12);
        p1.addComment(c1);
        System.out.println(p1);

    }
}
