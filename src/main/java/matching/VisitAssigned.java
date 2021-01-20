
package matching;

public class VisitAssigned extends AbstractEvent {

    private Long matchId;
    private String teacher;
    private String visitDate;

    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }
    public String getVisitDate() {
        return visitDate;
    }

    public void setVisitDate(String visitDate) {
        this.visitDate = visitDate;
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
