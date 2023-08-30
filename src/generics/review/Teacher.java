package generics.review;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher {

    private String name;
    private int id;
    public Teacher(String name, int id){
        this.name = name;
        this.id = id;
    }
}
