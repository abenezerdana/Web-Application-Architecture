package edu.miu.assignment1.repo.impl;

import edu.miu.assignment1.domain.Post;
import edu.miu.assignment1.domain.dto.response.NewPostDto;
import edu.miu.assignment1.repo.PostRepo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepoImpl implements PostRepo {
    private static List<Post> posts;
    private static long postId = 300;
    static {
        posts = new ArrayList<>();
        String content1 = "The Power of Now proposes that the only way to reach true peace and fulfillment is through being completely present in each moment you experience. There is a part of our mind, called the ego, that derails us by ruminating on the past, speculating about the future, clinging to our painful experiences, and insisting that we will be happy and fulfilled if we can just achieve this goal.";
        String content2 = "Psycho-Cybernetics is based on the theory that your mind functions according to cybernetic principles—you can program your mind to achieve success and happiness in the same way that you’d program a machine to achieve the results that you want. Maxwell Maltz suggests a number of methods to help you raise awareness of your current self-image, build your self-confidence, and increase your ability to achieve success.";
        String content3 = "Combining magic, mysticism, wisdom, and wonder into an inspiring tale of self-discovery, The Alchemist has become a modern classic, selling millions of copies around the world and transforming the lives of countless readers across generations.\n" +
                "\n" +
                "Paulo Coelho's masterpiece tells the mystical story of Santiago, an Andalusian shepherd boy who yearns to travel in search of a worldly treasure. His quest will lead him to riches far different—and far more satisfying—than he ever imagined. Santiago's journey teaches us about the essential wisdom of listening to our hearts, recognizing opportunity and learning to read the omens strewn along life's path, and, most importantly, following our dreams.";
        Post p1 = new Post(111, "The Power of Now", content1, "Eckhart Tolle");
        Post p2 = new Post(112,"Psycho-Cybernetics", content2, " Maxwell Maltz");
        Post p3 = new Post(113, "The Alchemist", content3, "Paulo Coelho");
        posts.add(p1);
        posts.add(p2);
        posts.add(p3);
    }

    @Override
    public List<Post> findAll() {
        return posts;
    }

    @Override
    public Post findById(Long id) {
        return posts.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void savePost(NewPostDto p) {
        Long newId = postId++;
        Post newPost = new Post(newId, p.getTitle(), p.getContent(), p.getAuthor());
        posts.add(newPost);
    }
}
