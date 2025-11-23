
public class Square extends Shape {
	private int hight;
	private int width;
	
	public Square(){
		this.hight = 3;
		this.width = this.hight;
	}
	
	public Square(int hight) {
		this.hight = hight;
		this.width = this.hight;
	}

	public void printShape() {
		for (int i = 0; i < hight; i++) {
			for (int x = 0; x < width; x++) {
				System.out.print("*");
			}
		System.out.println();
		}
	}
}
