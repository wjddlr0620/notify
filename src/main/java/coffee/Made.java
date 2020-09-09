package coffee;

public class Made extends AbstractEvent {

    private Long makeId;
    private Long requestId;
    private String status;
    private Long menuId;
    private Integer cnt;
    private String makeTime;
    private String makeStaff;

    public Long getMakeId() {
        return makeId;
    }

    public void setMakeId(Long makeId) {
        this.makeId = makeId;
    }
    public Long getRequestId() {
        return requestId;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = menuId;
    }
    public Integer getCnt() {
        return cnt;
    }

    public void setCnt(Integer cnt) {
        this.cnt = cnt;
    }
    public String getMakeTime() {
        return makeTime;
    }

    public void setMakeTime(String makeTime) {
        this.makeTime = makeTime;
    }
    public String getMakeStaff() {
        return makeStaff;
    }

    public void setMakeStaff(String makeStaff) {
        this.makeStaff = makeStaff;
    }
}