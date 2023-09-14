public class No<String> {
    private Object object;
    private No<String> refNo;

    public No(Object object) {
        this.object = object;
        this.refNo = null;
    }

    @Override
    public java.lang.String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }

    public String getObject() {
        return (String) object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No<String> getRefNo() {
        return refNo;
    }

    public void setRefNo(No<String> refNo) {
        this.refNo = refNo;
    }
}
