public class ProjectClass{
    private String name;
    private String description;

    public ProjectClass(String name){
        this.name = name;
    }
    public ProjectClass(String name, String description){
        this.name = name;
        this.description = description;
    }
    
    public String elevatorPitch(){
        return this.name+":"this.description;
    }

    public String getName(){
        return name;
    }
    public void setName(String name1){
        name = name1;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description1){
        description = description1;
    }

}