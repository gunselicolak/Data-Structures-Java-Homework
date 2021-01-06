//18253069 Günseli ÇOLAK 
public class Odev4Graph<T> extends Odev4AbstractGraph<T> {
    /**
     * Mevcut çizgenin komşuluk matrisini hesaplayıp geri döndürür
     * @return Komşuluk matrisi(iki boyutlu tamsayı dizisi)
     */
    @Override
    public int[][] adjacencyMatrix() {
        int [][] adjacencyMatrix = new int[vertices.size()][vertices.size()];
        
        int i = 0;
        for(Vertex<T> v:vertices){
            for(Edge<T> e: v.edges){
                for(int j = 0; j < vertices.size(); j++){
                    if(e.to == vertices.get(j))
                        adjacencyMatrix[i][j] = e.weight;
                }
            }
            i++;
        }
        return adjacencyMatrix; 
    }

    /**
     * Mevcut çizgenin parametre olarak gönderilen çizge ile eşit olup
     * olmadığını döndürür. İki çizgenin birbirine eşit olması için düğümlerin
     * (vertex) referansları farklı olsa bile değerlerinin eşit olması ve de
     * tüm kenarların her iki çizgede de aynı düğümler arasında olması gerekir
     * @param g2 Eşitlik kontrolü için gönderilen çizge parametresi
     * @return Eşit için true aksi halde false döner
     */
    @Override
    public boolean equals(Odev4AbstractGraph<T> g2) {
          int graph[][] = g2.adjacencyMatrix();
        int adjgraph[][] = adjacencyMatrix();
        
        if(g2.vertices.size() != vertices.size()){
            return false;
        }
        else
        {
            for(int i = 0; i < graph.length; i++){
                for(int j = 0; j < graph.length; j++){
                    if(graph[i][j] != adjgraph[i][j]){
                        return false;
                }
            }
        }
    }
    return true;
    }
}
