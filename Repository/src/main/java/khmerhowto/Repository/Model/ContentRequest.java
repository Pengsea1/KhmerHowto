package khmerhowto.Repository.Model;

import javax.persistence.*;

@Entity
public class ContentRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String text;
    @ManyToOne
    private User user;
    private int timestamp;


    public ContentRequest() {
    }

    public ContentRequest(int id, String title, String text, User user, int timestamp) {
        this.id=id;
        this.title=title;
        this.text=text;
        this.user=user;
        this.timestamp=timestamp;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "ContentRequest{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", user=" + user +
                ", timestamp=" + timestamp +
                '}';
    }
}
