
package matching;

public class PaymentApproved extends AbstractEvent {

    private Long id;
    private Long matchId;
    private Integer price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getMatchId() {
        return matchId;
    }

    public void setMatchId(Long matchId) {
        this.matchId = matchId;
    }
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
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
