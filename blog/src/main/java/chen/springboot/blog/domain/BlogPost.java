package chen.springboot.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BlogPost {
    private Integer b_id;
    private String b_title;
    private String b_comment;
    private Date b_time;
    private Integer b_comment_number;
    private Integer b_likes_number;
    private User user;
    private List<Comment> comments;
}
