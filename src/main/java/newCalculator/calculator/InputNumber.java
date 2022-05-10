package newCalculator.calculator;

public enum InputNumber {
    FIRST("первое"),
    SECOND("второе");

    private String value;

    InputNumber(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
