import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inf = 9999;
		int[][] matrix = {
				{inf,50,4,inf,inf,inf,inf,inf,inf,inf},
				{50, inf,3, 1,inf,inf,inf,inf,inf,inf},
				{4,3,inf,inf,100,inf,inf,inf,inf,inf},
				{inf,1,inf,inf,10,inf,inf,50,inf,inf},
				{inf,inf,100,10,inf,13,inf,inf,inf,inf},
				{inf,inf,inf,inf,13,inf,61,inf,inf,inf},
				{inf,inf,inf,inf,inf,61,inf,inf,inf,4},
				{inf,inf,inf,50,inf,inf,inf,inf,3,63},
				{inf,inf,inf,inf,inf,inf,inf,3,inf,19},
				{inf,inf,inf,inf,inf,inf,4,63,19,inf}
		};
		Prim p = new Prim(matrix);
		p.solve();
		ArrayList<Integer> v = p.getVertex();
		ArrayList<Tree> t = p.getEdges();
		for(int i = 0 ; i < t.size(); i++) {
			int aa = t.get(i).a + 1;
			int bb = t.get(i).b + 1;
			System.out.println("( V"+aa+" , V"+bb+" )");
		}
	}

}
