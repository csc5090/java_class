
/* 4번문제(과제)
 * 
 * 
 * 
 */

class HandPhone {
    protected String model;
    protected String number;

    public HandPhone() {} 

    public HandPhone(String model, String number) {
        this.model = model;
        this.number = number;
    }
}

class DicaPhone extends HandPhone {
    private String whaso;

    public DicaPhone(String model, String number, String whaso) {
        super(model, number);
        this.whaso = whaso;
    }

    public void prnDicaphone() {
        System.out.println("모델명 : " + model + " 번호 : " + number + " 화소 : " + whaso);
    }
}

public class Ex16_5 {
    public static void main(String[] args) {
        DicaPhone dica = new DicaPhone("갤럭시", "010", "1024");
        dica.prnDicaphone();
    }
}