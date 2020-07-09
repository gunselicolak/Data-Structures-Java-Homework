import java.util.Comparator;

/**
 * FrekansKarsilastirici sinifi Huffman a�a�lar�n� köklerindeki frekans degerlerine gore
 * karsilastirir.
 */
class FrekansKarsilastirici implements Comparator<HuffmanNode> {

    @Override
    public int compare(HuffmanNode o1, HuffmanNode o2) {
        
        /*if(o1.frequency < o2.frequency){   
            return -1;
        }else{
            return 1;
        }
        }*/ 
         
         //Üç farkli ayni görevi yapan kod
        
        if(o2.frequency - o1.frequency > 0){//1. a�a� k���k
            return -1;
        }else{
            return 1;
        }
        }
        /*
        if(o1.frequency - o2.frequency > 0)
           return 1;
        else if(o1.frquency - o2.frequency < 0)
           return -1;
        else return 0;
         */
    }

/**
 * AlfabetikKarsilastirici s�n�f� Huffman a�a�lar�n� i�lerinde bulunan en k���k karakterlere
 * g�re kar��la�t�r�r.
 */
class AlfabetikKarsilastirici implements Comparator<HuffmanNode> {

    public Character enKucuk(HuffmanNode node){//stack or kuyruk kullanılabilir
        if(node.value!=null)
            return node.value;
        Character sol = enKucuk (node.left);
        if(sol.compareTo(sag) < 0)
            return sol;
        else return sag;
    }

    @Override
    public int compare(HuffmanNode o1, HuffmanNode o2) {
        Character o1kucuk = enKucuk (o1);
        Character o2kucuk = enKucuk (o2);
        if(o1kucuk.compareTo(o2kucuk) < 0)
            return -1;
        else if(o1kucuk.compareTo(o2kucuk) > 0)
            return 1;
        else return 0;
    }
}
