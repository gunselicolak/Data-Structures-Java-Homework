public class LabGraph<T> extends AbstractGraph<T> {

    @Override
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
}
