//18253069 G�NSEL� �OLAK
public class Odev1LinkedList<T extends Comparable<T>> extends AbstractLinkedList<T> {
    /**
     * Bir listede elemanlar� uygun konuma ekler. Bo� bir listeye elemanlar eklendikten
     * sonra k���kten b�y��e s�ral� olur
     * @param value eklenecek de�er
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
        
        //Liste olusturmadan direkt sadece k��uk olup olmad���na bak�l�p yap�labilir.
        //A�a�idaki kod �ok gereksiz i�lemleri kaps�yor
        //node u null ald��� i�in bo� d�nd�r�yor
        
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
     * Mevcut listeyi de�i�tirmeden, elemanlar�n s�ras� ters �evrilmi� halde geri d�nd�r�r.
     * @return Ters �evrilmi� liste
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
     * Mevcut liste ile parametre olarak gelen listeyi birle�tirip geriye d�nd�r�r.
     * Mevcut listede de�i�iklik yap�lmaz.
     * @param list Mevcut listenin sonuna eklenecek liste
     * @return Birle�mi� liste
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
