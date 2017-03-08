package pl.sda.mongo;

import com.mongodb.DBObject;
import org.bson.types.ObjectId;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostsDAO dao = new PostsDAO();

        Post post = new Post();
        post.setAuthor("Piotr");
        post.setContent("testowy content");
        post.setDate(new Date());
        dao.insert(post);

//        List<DBObject> result =  dao.searchById(new ObjectId("58c054d07f97d9120464dfd2"));
//        System.out.println(result.toString());

        Post post2 = new Post();
        post2.setAuthor("Piotr");
        post2.setContent("aktualizacja content-u");
        post2.setDate(new Date());
        //     dao.insert(post);
        dao.update(post2, new ObjectId("58c054d07f97d9120464dfd2"));

//        dao.removeById(new ObjectId("58c054d07f97d9120464dfd2"));
//        System.out.println("");}

    }
}