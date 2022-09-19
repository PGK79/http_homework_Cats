package org.example;

public class Post {
    public String id;
    public String text;
    public String type;
    public String user;
    private String upvotes;

    public Post() {
    }

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
