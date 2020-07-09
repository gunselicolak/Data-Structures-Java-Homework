/**
 * Minimum heap s�n�f�
 * @param <T> Generic s�n�f
 */
public class BinaryHeap <T extends Comparable<T>> {
    public T[]  dizi;//Y���n� tutacak dizi(de�i�tirmeyin)
    public int es;//Eleman say�s�(de�i�tirmeyin)

    public BinaryHeap() {//de�i�tirmeyin
        dizi=(T[]) new Comparable[100];
    }
    public BinaryHeap(int boyut){//de�i�tirmeyin
        dizi=(T[])new Comparable[boyut];
    }
    public int ebeveyn(int konum){ return konum/2;}//de�i�tirmeyin, kullan�n
    public int solCocuk(int konum){ return 2*konum;}//de�i�tirmeyin, kullan�n
    public int sagCocuk(int konum){return 2*konum+1;}//de�i�tirmeyin, kullan�n
    public int elemanSayisi(){return es;}

    public void ekle(T eleman){
        dizi[es+1]=eleman;
        int konum=es+1;
        es++;
        while (konum!=1 && dizi[konum].compareTo(dizi[ebeveyn(konum)])<0) {
            T gecici=dizi[konum];
            dizi[konum]=dizi[ebeveyn(konum)];
            dizi[ebeveyn(konum)]=gecici;
            konum=ebeveyn(konum);
        }
    }

    public T sil(){
        T donecek=dizi[1];//K�k
        int konum=1;
        dizi[konum]=dizi[es];
        es--;
        while (solCocuk(konum)<=es+1 && dizi[konum].compareTo(dizi[solCocuk(konum)])>0 || sagCocuk(konum)<=es+1 && dizi[konum].compareTo(dizi[sagCocuk(konum)])>0){
            int degisecekKonum;
            if(dizi[solCocuk(konum)].compareTo(dizi[sagCocuk(konum)])<0)
                degisecekKonum=solCocuk(konum);
            else
                degisecekKonum=sagCocuk(konum);
            T gecici=dizi[konum];
            dizi[konum]=dizi[degisecekKonum];
            dizi[degisecekKonum]=gecici;
            konum=degisecekKonum;
        }
        return donecek;

    }
}