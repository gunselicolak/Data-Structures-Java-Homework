//18253069 Günseli ÇOLAK
public class Odev2Ogrenci {
    /**
     * isBST metodu kökü verilen herhangi bir aðacýn ikili arama aðacý olup
     * olmadýðýný hesaplar
     * @param node Kök düðüm
     * @param <T> karþýlaþtýrýlabilir generic tür
     * @return ikili arama aðacý mý deðil mi
     */
    public static <T extends Comparable<T>> boolean isBST(BTNode<T> node) {
      
       /* while(node != null){
            if(node.value.compareTo(node.left.value) > 0){//sola gidip karþýlaþtýrýr
                if(node.left.value == null){//en sola geldiðimizin kontrolü
                node.left = node;
                node.value = node.left.value;//ebeveyni deðiþtirmeye çalýþtým
                }
                else isBST(node.left);// en sola gitmek için fonksiyonumuzu recursive olarak çaðýrýyor
                return false;
            }
            
            else if(node.value.compareTo(node.right.value) <= 0){//saða gidip karþýlaþtýrýyor
                if(node.right.value == null){//en saða geldiðimizin kontrolü
                node.right = node;
                node.value = node.right.value;
                }
                else isBST(node.right);// en saða gitmek için fonksiyonumuzu recursive olarak çaðýrýyor
                return false;
            }
            return false;//while için döngü
        }
        */
            if(node == null){
                //node = node.value;  
                if(node.value.compareTo(node.left.value) < 0){//sola gidip karþýlaþtýrýr
                
                if(node.left.value == null){
                node.left = node;  
                //node.parent = node.left;//ebeveyni döndürür
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
                return false;//if için döngü
            }
            
                     
        return true;
            }
        }
        
