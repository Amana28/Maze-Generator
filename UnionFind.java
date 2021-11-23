public class UnionFind {

    public int numSets = 0;

    public void makeset(Cell x){

        // create a set for Cell x
        LLAddOnly set = new LLAddOnly();
        set.add(x);
        numSets += 1;
    }

    public LLAddOnly find(Cell x){

        // return the set containing x
        return x.head;

    }


    public void union(Cell x, Cell y){

        if(x == null || y == null){
            return;
        }

        // tack on the set containing y next to the set containing x
        // update x's last object
        // iterate through the set containing y and update pointers to x's head
        x.head.last.next = y.head.first;
        x.head.last = y.head.last;
        Cell curr = y.head.first;
        while(curr != null){
            curr.head = x.head;
            curr = curr.next;
        }
        // reduce number of Sets by 1 after union
        numSets--;
    }

}
