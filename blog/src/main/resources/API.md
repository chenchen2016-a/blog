## json对象包含的属性
UserPojo: 
```
Integer u_id;                   //用户id
String u_username;              //用户用户名
String u_password;              //用户密码
String u_name;                  //用户昵称
String u_img;                   //用户头像路径
Integer level;                  //用户等级
Date u_date;                    //创建日期
Integer u_blogAge;              //用户博龄
```
BlogPostPojo:
```
Integer b_id;                   //博文id
String b_title;                 //博文题目
String b_comment;               //博文内容
Date b_time;                    //发文时间
Integer b_comment_number;       //评论数
Integer b_likes_number;         //点赞数

```
CommentPojo:
```
Integer c_id;                   //评论id
String c_comment;               //评论内容
Integer c_number;               //点赞数
Date c_time;                    //评论日期
```

## 后端提供的API接口信息
### login
#### 参数
用户名, 密码：
```
String username, String password
```

#### 返回值
1 - 登录成功
2 - 用户名不存在
3 - 密码错误

### dopage_for_blog_by_uid
#### 参数
用户id, 页码数, 分页容量：
```
Integer u_id, Integer pageIndex, Integer, size
```
#### 返回值
json格式：
```
List<BlogPojo>对象
```

### dopage_for_blog
#### 参数
Integer pageIndex, Integer, size
页码数, 分页容量
#### 返回值
json格式：
```
List<BlogPojo> 对象
```

### dopage_for_comment
#### 参数
博文id, 页码数, 分页容量:
```
Integer b_id, Integer pageIndex, Integer, size
```
#### 返回值
json格式：
```
List<CommentPojo>对象
```

### add_blog
#### 参数
BlogPostPojo对象
```
BlogPostPojo blogPojo
//博文题目、博文内容为必传参数
```
#### 返回值
1 - 添加成功
2 - 添加失败
