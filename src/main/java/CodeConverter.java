public class CodeConverter {

    private String twoDigitCode;
    private String threeDigitCode;

    public String getTwoDigitCode() {
        return twoDigitCode;
    }

    public void setTwoDigitCode(String twoDigitCode) {
        this.twoDigitCode = twoDigitCode;
    }

    public String getThreeDigitCode() {
        return threeDigitCode;
    }

    public void setThreeDigitCode(String threeDigitCode) {
        this.threeDigitCode = threeDigitCode;
    }

    @Override
    public String toString() {
        return twoDigitCode="  = twoDigitCode /" + threeDigitCode + " = threeDigitCode/";
    }
}


