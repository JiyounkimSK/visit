package matching;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="VisitReqList_table")
public class VisitReqList {

        @Id
        private Long id;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }


    /** student 정보 추가 **/
    private String student;
    public String getStudent() {
        return student;
    }
    public void setStudent(String student) {
        this.student = student;
    }
}
