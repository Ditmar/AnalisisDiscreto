import java.util.ArrayList;

public class Prim {
	private int [][] matrixAdy;
	private ArrayList<Integer> P;
	private ArrayList<Integer> N;
	private ArrayList<Tree> T;
	// input matrix ==> GRAFO
	public Prim(int[][] matrix) {
		matrixAdy = matrix;
		P = new ArrayList<Integer>();
		N = new ArrayList<Integer>();
		T = new ArrayList<Tree>();
	}
	public void solve () {
		// STEP 1
		P.add(3);
		for(int i = 0; i < matrixAdy.length; i++) {
			N.add(i);
		}
		N.remove(3);
		// LOOP
		while(!N.isEmpty()) {
			Integer v = searchMinEdge();
			P.add(v);
			N.remove(v);
		}
	}
	public ArrayList<Tree> getEdges() {
		return T;
	} 
	public ArrayList<Integer> getVertex() {
		return P;
	}
	private Integer searchMinEdge() {
		// TODO Auto-generated method stub
		int indexp, indexn, menor = 9999, v = -1, w = -1;
		for(int i = 0; i < P.size(); i++) {
			for(int j = 0; j < N.size(); j++) {
				indexp = P.get(i);
				indexn = N.get(j);
				int value = matrixAdy[indexp][indexn];
				if(value < menor) {
					menor = value;
					v = indexp;
					w = indexn;
				}
			}
		}
		T.add(new Tree(v, w));
		return w;
	}
	
}