package Converting;

public class Numerals {
    private String arabic;
    private String roman;

    public Numerals(){}

    public Numerals(String arabic, String roman){
        this.arabic = arabic;
        this.roman = roman;
    }

    public String getArabic() {
        return arabic;
    }

    public void setArabic(String arabic) {
        this.arabic = arabic;
    }

    public String getRoman() {
        return roman;
    }

    public void setRoman(String roman) {
        this.roman = roman;
    }
}
