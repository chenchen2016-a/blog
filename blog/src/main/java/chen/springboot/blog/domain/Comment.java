package chen.springboot.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Comment {
    private Integer c_id;
    private String c_comment;
    private Integer c_number;
    private Date c_time;
    private BlogPost post;
    private User user;
}
