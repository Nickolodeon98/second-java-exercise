package list;

import java.util.ArrayList;
import java.util.List;

public class LikeLion2th {
    // 멋사 2기 학생의 이름이 들어있는 list 를 return 하는 method
    private List<String> students = new ArrayList<>();
    private Names names = new Names();

    public LikeLion2th() {
        this.students = names.names();
    }

    public List<String> getStudentList() {
        return this.students;
    }
}
