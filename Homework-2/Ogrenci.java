//18253069 G�nseli �OLAK
public class Odev2Ogrenci {
    /**
     * isBST metodu k�k� verilen herhangi bir a�ac�n ikili arama a�ac� olup
     * olmad���n� hesaplar
     * @param node K�k d���m
     * @param <T> kar��la�t�r�labilir generic t�r
     * @return ikili arama a�ac� m� de�il mi
     */
    public static <T extends Comparable<T>> boolean isBST(BTNode<T> node) {
      
       /* while(node != null){
            if(node.value.compareTo(node.left.value) > 0){//sola gidip kar��la�t�r�r
                if(node.left.value == null){//en sola geldi�imizin kontrol�
                node.left = node;
                node.value = node.left.value;//ebeveyni de�i�tirmeye �al��t�m
                }
                else isBST(node.left);// en sola gitmek i�in fonksiyonumuzu recursive olarak �a��r�yor
                return false;
            }
            
            else if(node.value.compareTo(node.right.value) <= 0){//sa�a gidip kar��la�t�r�yor
                if(node.right.value == null){//en sa�a geldi�imizin kontrol�
                node.right = node;
                node.value = node.right.value;
                }
                else isBST(node.right);// en sa�a gitmek i�in fonksiyonumuzu recursive olarak �a��r�yor
                return false;
            }
            return false;//while i�in d�ng�
        }
        */
            if(node == null){
                //node = node.value;  
                if(node.value.compareTo(node.left.value) < 0){//sola gidip kar��la�t�r�r
                
                if(node.left.value == null){
                node.left = node;  
                //node.parent = node.left;//ebeveyni d�nd�r�r
                }
                else isBST(node.left);
                return false;
            }
                else if(node.value.compareTo(node.right.value) >= 0){
               
                if(node.right.value == null){
                node.right = node;
                //node.parent = node.right;
                }
                else isBST(node.right);
                return false;
            }
                return false;//if i�in d�ng�
            }
            
                     
        return true;
            }
        }
        
