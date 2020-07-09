//18253069 Günseli ÇOLAK 
public class Odev4Graph<T> extends Odev4AbstractGraph<T> {
    /**
     * Mevcut çizgenin komþuluk matrisini hesaplayýp geri döndürür
     * @return Komþuluk matrisi(iki boyutlu tamsayý dizisi)
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
     * Mevcut çizgenin parametre olarak gönderilen çizge ile eþit olup
     * olmadýðýný döndürür. Ýki çizgenin birbirine eþit olmasý için düðümlerin
     * (vertex) referanslarý farklý olsa bile deðerlerinin eþit olmasý ve de
     * tüm kenarlarýn her iki çizgede de ayný düðümler arasýnda olmasý gerekir
     * @param g2 Eþitlik kontrolü için gönderilen çizge parametresi
     * @return Eþit için true aksi halde false döner
     */
    @Override
    public boolean equals(Odev4AbstractGraph<T> g2) {
         for (Vertex<T> v:vertices)
            for(Edge<T> e:v.edges)
                if( v.value == g2.v.value)// referans farklý olsa bile deðerleri eþit olmalý
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
