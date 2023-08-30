package generics.review;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class Student {

    private String name;
    private int id;
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }
}