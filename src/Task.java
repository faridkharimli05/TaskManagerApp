public class Task {

    private Integer id;

    private String title;

    private String description;

    private Boolean isCompleted;


    public Task(Integer id, String title, String description, Boolean isCompleted) {
        this.id = id;
        this.title = title;
        this.isCompleted = isCompleted;

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getCompleted() {
        return isCompleted;
    }

    public void setCompleted(Boolean completed) {
        isCompleted = completed;
    }


    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }


    public void markAsCompleted(){
        isCompleted = true;

    }









}
