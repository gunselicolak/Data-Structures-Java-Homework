import java.util.*;

public class LabGraph3<T extends Comparable<T>> extends AbstractGraph3<T> {
    @Override
    public List<T> bfs(T baslangic) {
        List<T> donecek=new ArrayList<>();
        Set<T> visited=new HashSet<>();
        ArrayDeque<T> q=new ArrayDeque<>();
        q.add(baslangic);
        while (!q.isEmpty()){
            T mevcut=q.remove();
            if(visited.contains(mevcut))
                continue;
            donecek.add(mevcut);
            visited.add(mevcut);
            List<Edge<T>> ko=verticesMap.get(mevcut).edges;
            List<T> komsular=new ArrayList<>();
            for(Edge<T> k:ko)
            {
                if(!visited.contains(k))
                    komsular.add(k.to.value);
            }
            Collections.sort(komsular);
            for (T k:komsular)
                q.add(k);
        }
        return donecek;

    }

    @Override
    public List<T> dfs(T baslangic) {
        List<T> donecek=new ArrayList<>();
        Set<T> visited=new HashSet<>();
        Stack<T> s=new Stack<>();
        s.push(baslangic);
        while (!s.isEmpty()){
            T mevcut=s.pop();
            if(visited.contains(mevcut))
                continue;
            donecek.add(mevcut);
            visited.add(mevcut);
            List<Edge<T>> ko=verticesMap.get(mevcut).edges;
            List<T> komsular=new ArrayList<>();
            for(Edge<T> k:ko)
            {
                if(!visited.contains(k))
                    komsular.add(k.to.value);
            }
            Collections.sort(komsular);
            Collections.reverse(komsular);
            for (T k:komsular)
                s.push(k);
        }
        return donecek;
    }
}