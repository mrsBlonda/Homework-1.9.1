import com.fasterxml.jackson.annotation.JsonProperty;

public class Animal {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final String upvotes;

    public Animal(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") String upvotes

    ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }
    public String getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public String getType() {
        return this.type;
    }

    public String getUser() {
        return this.user;
    }

    public String getUpvotes() {
        return upvotes;
    }


    @Override
    public String toString() {
        return "Animal: " +
                "\n id = " + id +
                "\n text = " + text +
                "\n type = " + type +
                "\n user = " + user +
                "\n upvotes = " + upvotes;
    }
}
