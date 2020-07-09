import java.util.LinkedList;

public class SeperatedChainHash {
    public LinkedList<Integer>[] dizi;

    public SeperatedChainHash() {
        dizi=new LinkedList[23];
    }
    public SeperatedChainHash(int boyut) {
        dizi=new LinkedList[boyut];
    }
    public int hash(int deger){
        return deger%dizi.length;
    }
    public void ekle(int deger){
        int konum=hash(deger);
        if(dizi[konum]==null)
            dizi[konum]=new LinkedList<>();
        dizi[konum].add(deger);
    }
    public boolean sil(int deger){
        int konum=hash(deger);
        if(dizi[konum]==null)
            return false;
        if(dizi[konum].contains(deger)){
            dizi[konum].remove(dizi[konum].indexOf(deger));
            return true;
        }
        return false;
    }
    public void yenidenOzetle() {
        int boyut=nextPrime(dizi.length*2);
        LinkedList<Integer>[] eskiDizi=dizi;
        dizi=new LinkedList[boyut];
        for (LinkedList<Integer> ll:eskiDizi){
            if(ll!=null)
                for (int deger: ll){
                    ekle(deger);
                }
        }
    }
    private int nextPrime(int deger){
        while(!isPrime(deger))
            deger++;
        return deger;
    }
    private boolean isPrime(int deger){
        for (int i = 2; i < (int)Math.sqrt(deger)+1; i++) {
            if(deger%i==0)
                return false;
        }
        return true;
    }
}