package clases;

public class Project {
    
    private int project_id;
    private String name;
    private String description;

    public Project() {
    }

    public Project(int project_id, String name, String description) {
        this.project_id = project_id;
        this.name = name;
        this.description = description;
    }

    // Getters
    public int getProject_id() {
        return project_id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
    
    // Setters

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
