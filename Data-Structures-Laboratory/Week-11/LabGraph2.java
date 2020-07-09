import java.util.ArrayList;
import java.util.List;

public class LabGraph2<T> extends AbstractGraph2<T> {

    @Override
    protected Object clone() throws CloneNotSupportedException {
        AbstractGraph2<T> g=new LabGraph2<>();
        for (Vertex<T> v:vertices)
            g.addVertex(v.value);
        for (Vertex<T> v:vertices)
            for (Edge<T> e:v.edges)
                g.addEdge(e.from.value,e.to.value,e.weight);
        return g;
    }

    @Override
    public void removeVertex(T deger) {
        Vertex<T> v=verticesMap.get(deger);
        if(v!=null) {
            vertices.remove(v);
            for(Vertex<T> v2:vertices) {
                List<Edge<T>> silinecek=new ArrayList<>();
                for (Edge<T> e : v2.edges)
                    if (e.to.value.equals(deger))
                        silinecek.add(e);
                v2.edges.removeAll(silinecek);
            }
        }
    }

    @Override
    public List<T> topologicalSort() {
        ArrayList<T> list=new ArrayList<>();
        try {
            LabGraph2<T> klon= (LabGraph2) clone();
            while (klon.vertices.size()>0){
                for (Vertex<T> v:klon.vertices){
                    if (klon.inDegree(v.value)==0) {
                        list.add(v.value);
                        klon.removeVertex(v.value);
                        break;
                    }
                }
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return list;
    }
}