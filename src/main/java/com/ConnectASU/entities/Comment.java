package com.ConnectASU.entities;

public class Comment {
    private final int id;
    private final String content;
    private final String authorName;

    public Comment(int id, String content, String authorName) {
        this.id = id;
        this.content = content;
        this.authorName = authorName;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getAuthorName() {
        return authorName;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() != this.getClass()) {
            return false;
        }
        final Comment other = (Comment) obj;
        return this.id == other.id && this.content.equals(other.content) && this.authorName.equals(other.authorName);
    }
}
