/**
 * Huffman d���m s�n�f�. Bu s�n�f�n i�eri�ini de�i�tirmemeniz gerekmektedir. De�i�iklik yaparsan�z test ortam�nda kodunuz beklendi�i gibi �al��mayacakt�r.
 */
public class HuffmanNode {
    public Character value; // Karakter
    public int frequency; // Frekans�
    public HuffmanNode left; // sol �ocuk
    public HuffmanNode right; // sa� �ocuk

    public HuffmanNode(Character value, int frequency, HuffmanNode left, HuffmanNode right) {
        this.value = value;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }
}