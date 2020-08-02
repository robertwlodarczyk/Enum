package pl.wlodarczyk.robert.Kalkulator;

public enum Działania {

    DODAWANIE("+"),
    ODEJMOWANIE("-"),
    MNOŻENIE("*"),
    DZIELNIE("/");

    private final String sign;

    Działania(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
