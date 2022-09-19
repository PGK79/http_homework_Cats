package org.example;

public class Post {
    public String id;
    public String text;
    public String type;
    public String user;
    public String upvotes;

    public Post() {
    }

//    public Post(String id, String text, String type, String user,int upvotes) {
//        this.id = id;
//        this.text = text;
//        this.type = type;
//        this.user = user;
//        this.upvotes = upvotes;
//    }

    public String getUpvotes() {
        return upvotes;
    }
    @Override
    public String toString() {
        return "Employee{" + "id='" + id + '\'' + ", text='" +
                text + '\'' + ", type='" + type + '\'' +
                ", user='" + user + '\'' + ", upvotes='" + upvotes + '\'' + '}';
    }
}
