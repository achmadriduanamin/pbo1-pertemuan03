package percabangan;

public class IfElse {
    public static void main(String[] args){
        double totalBelanja = 20000;
        double uangDiDompet = 10000;

        if(uangDiDompet<totalBelanja){
            System.out.println("Uang kurang, kurangi jajan anda");
        }else{
            System.out.println("Uang cukup... selamat menikmati..");
        }
    }
}
