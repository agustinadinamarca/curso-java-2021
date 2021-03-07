package javacourse;

// nombre de clases con mayúsculas
public class FiguraPlanaV1 {
	// atributos privados (no los puede tocar el usuario u otras clases externas a ésta)
	private int base;
	private int high;
	private String type;
	
	public FiguraPlanaV1(int base, int high, String type) {
		this.base = base;
		this.high = high;
		this.type = type;
	}
	
	public float calculate_area() {
		if (this.type == "R") {
			return this.base * this.high;
		} else if (this.type == "T") {
			return (float) this.base * this.high / 2;
		} else {
			System.out.print("Error. Choose: T (Triangle) or R (Rectangle).\n");
			return 0;
		}
		
	}
	
	public static void main(String[] args) {
		
		FiguraPlanaV1 object1 = new FiguraPlanaV1(3, 4, "R");
		System.out.print("Result (rectangle 3b x 4h unidades de longitud): " + object1.calculate_area() + " unidades de área.\n");
		
		FiguraPlanaV1 object2 = new FiguraPlanaV1(3, 4, "T");
		System.out.print("Result (triangle 3b x 4h unidades de longitud): " + object2.calculate_area() + " unidades de área.\n");
	}
	
}

