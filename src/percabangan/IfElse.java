package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 10000;
        double uangDiDompet = 20000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else if(uangDiDompet>totalBelanja){
            double angsul = uangDiDompet-totalBelanja;
            System.out.println("Uang Cukup, angsul : "+angsul);
        }else{
            System.out.println("Uang cukup... selamat menikmati..");
        }
    }
}
