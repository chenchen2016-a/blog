package chen.springboot.blog.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    private Integer u_id;
    private String u_username;
    private String u_password;
    private String u_name;
    private String u_img;
    private Integer level;
    private Date u_date;
    private Integer u_blogAge;
    private List<BlogPost> blogPosts;
}
