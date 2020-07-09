//18253069 GÜNSELÝ ÇOLAK
public class Odev1LinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {
    /**
     * Bir listede elemanlarý uygun konuma ekler. Boþ bir listeye elemanlar eklendikten
     * sonra küçükten büyüðe sýralý olur
     * @param value eklenecek deðer
     */
    @Override
    public void insertInOrder(T value) {
        
        addFirst(value);
        Node<T> current = getHead();
        current.value = value;
        
        while(current.next != null){
            if(current.next.value.compareTo(current.value)<0){
                T temp = current.next.value;
                current.next.value = current.value;
                current.value = temp;
            }
            
            current = current.next; 
        }
        
        //Liste olusturmadan direkt sadece küçuk olup olmadýðýna bakýlýp yapýlabilir.
        //Aþaðidaki kod çok gereksiz iþlemleri kapsýyor
        //node u null aldýðý için boþ döndürüyor
        
       /*Odev1LinkedList<T> list2 = new Odev1LinkedList<>();
       Node<T> current = getHead();
       Node<T> current1 = list2.getHead();
       
        while(current != null){
            if(list2.getHead() == null && list2.getHead().value.compareTo(value)>0){
                list2.addFirst(value);
                list2.print();
            
            }
            else if(value.compareTo(current1.next.value)<0){
                Node<T> node = new Node<>(value, current1.next);
                list2.print();
                
            }
        
            current = current.next;
            current1 = current1.next;
            
        }
        
        while(current==null){
        list2.addLast(value);
        }
    
        list2.print();
        */
    }

    /**
     * Mevcut listeyi deðiþtirmeden, elemanlarýn sýrasý ters çevrilmiþ halde geri döndürür.
     * @return Ters çevrilmiþ liste
     */
    @Override
    public AbstractLinkedList<T> reverse() {
        
        Odev1LinkedList<T> list = new Odev1LinkedList<>();
        Node<T> current = getHead();
        
        while(current != null){
            list.addFirst(current.value);
            current = current.next;
        }
        
        return list;
    }

    /**
     * Mevcut liste ile parametre olarak gelen listeyi birleþtirip geriye döndürür.
     * Mevcut listede deðiþiklik yapýlmaz.
     * @param list Mevcut listenin sonuna eklenecek liste
     * @return Birleþmiþ liste
     */
    @Override
    public AbstractLinkedList<T> concatenate(AbstractLinkedList<T> list) {
        
        Odev1LinkedList<T> list1 = new Odev1LinkedList<>();
        Node<T> current = getHead();
        Node<T> current1 = list.getHead();
        
        while(current != null){
            list1.addLast(current.value);
            current = current.next;
        }
        
        while(current1 != null){
            list1.addLast(current1.value);
            current1 = current1.next;
        }
        
        return list1;
    }

}
