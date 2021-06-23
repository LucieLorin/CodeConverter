public class CodeConverter {

    private String code2;
    private String code3;

    public String getCode2() {
        return code2;
    }

    public void setCode2(String code2) {
        this.code2 = code2;
    }

    public String getCode3() {
        return code3;
    }

    public void setCode3(String code3) {
        this.code3 = code3;
    }

    @Override
    public String toString() {
        return "CodeConverter{" +
                "code2='" + code2 + '\'' +
                ", code3='" + code3 + '\'' +
                '}';
    }
}
