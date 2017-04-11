import java.util.ArrayList;
import java.util.List;

public class Scacchiera {

	private List<Integer> griglia = null;
	private final int dim;

	public Scacchiera(Scacchiera s) {
		this.griglia = new ArrayList<Integer>(s.getGriglia());
		this.dim = s.getDimension();
	}

	public Scacchiera(int dim) {
		this.griglia = new ArrayList<Integer>();
		this.dim = dim;
	}

	public void add(int i) {
		griglia.add(i);
	}

	public boolean contains(int i) {
		return griglia.contains(i);
	}

	public void remove(int i) {
		griglia.remove(Integer.valueOf(i));
	}

	List<Integer> getGriglia() {
		return griglia;
	}

	int getDimension() {
		return dim;
	}

	public boolean controllaDiagonale(int step) {

		for (int i = 0; i < step; i++) {
			if (step - i == Math.abs(griglia.get(step) - griglia.get(i)))
				return false;
		}

		return true;
	}

	@Override
	public String toString() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < dim; i++) {
			for (int j = 0; j < griglia.get(i); j++)
				sb.append("-");
			sb.append("X");
			for (int j = griglia.get(i) + 1; j < dim; j++)
				sb.append("-");
			sb.append("\n");
		}

		return sb.toString();
	}

}
