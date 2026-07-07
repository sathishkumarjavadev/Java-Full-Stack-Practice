package p008_oops.p008_oops_13_access_modifiers_01_final_keyword;

public class F2_BlankFinalVariable {
	final int rno;
	//creating constructor
	F2_BlankFinalVariable(int rno) {
		// TODO Auto-generated constructor stub
		this.rno = rno;
	}
	
	void display() {
		System.out.println(rno);
	}
	public static void main(String[] args) {
		F2_BlankFinalVariable obj = new F2_BlankFinalVariable(1001);
		obj.display();
	}
}
