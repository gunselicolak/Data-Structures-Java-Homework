//18253069 G�nseli �OLAK 
public class Odev4Graph<T> extends Odev4AbstractGraph<T> {
    /**
     * Mevcut �izgenin kom�uluk matrisini hesaplay�p geri d�nd�r�r
     * @return Kom�uluk matrisi(iki boyutlu tamsay� dizisi)
     */
    @Override
    public int[][] adjacencyMatrix() {
        OdevGraph<T>[] k = Odev4AbstractGraph<>(); 
        for(Vertex<T> v:vertices)
         vertices = v;
        adjacency_matrix = new int[vertices + 1][vertices + 1];
           
        return null;
    }

    /**
     * Mevcut �izgenin parametre olarak g�nderilen �izge ile e�it olup
     * olmad���n� d�nd�r�r. �ki �izgenin birbirine e�it olmas� i�in d���mlerin
     * (vertex) referanslar� farkl� olsa bile de�erlerinin e�it olmas� ve de
     * t�m kenarlar�n her iki �izgede de ayn� d���mler aras�nda olmas� gerekir
     * @param g2 E�itlik kontrol� i�in g�nderilen �izge parametresi
     * @return E�it i�in true aksi halde false d�ner
     */
    @Override
    public boolean equals(Odev4AbstractGraph<T> g2) {
         for (Vertex<T> v:vertices)
            for(Edge<T> e:v.edges)
                if( v.value == g2.v.value)// referans farkl� olsa bile de�erleri e�it olmal�
                    if(e.from.value.eguals(g2.e.to.value) || e.to.value.equals(g2.e.from.value)){
                else
                    return false;
                }
        return true;
    }
    
    public int inDegree(int node){ 
    int sayi=0;
    for(int i=0;i<komsulukMatrisi.length;i++) 
        if(komsulukMatrisi[i][node]==1) 
           sayi++;
        return sayi;
    } 
        
    public int outDegree(int node){ 
    int sayi=0; 
    for(int j=0;j<komsulukMatrisi.length;j++) 
        if(komsulukMatrisi[node][j]==1) 
           sayi++; 
        return sayi;
    }

    
    
 /*   @Override
    public int outDegree(T deger) {
        Vertex<T> v = verticesMap.get(deger);
        if(v == null)
            return -1;
        
        return v.edges.size();
    }

    @Override
    public int inDegree(T deger) {
        Vertex v2 = verticesMap.get(deger);
        if(v2 == null)
            return -1;
        int indeg = 0;
        for(Vertex <T> v : vertices)
           for(Edge<T> e : v.edges)
              if(e.to.value.equals(deger))
              indeg ++;
        return indeg;     
    }
    */
}
