/**
 * Huffman düðüm sýnýfý. Bu sýnýfýn içeriðini deðiþtirmemeniz gerekmektedir. Deðiþiklik yaparsanýz test ortamýnda kodunuz beklendiði gibi çalýþmayacaktýr.
 */
public class HuffmanNode {
    public Character value; // Karakter
    public int frequency; // Frekansý
    public HuffmanNode left; // sol çocuk
    public HuffmanNode right; // sað çocuk

    public HuffmanNode(Character value, int frequency, HuffmanNode left, HuffmanNode right) {
        this.value = value;
        this.frequency = frequency;
        this.left = left;
        this.right = right;
    }
}