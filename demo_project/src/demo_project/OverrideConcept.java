package demo_project;

public class OverrideConcept {
	int age=23;
	public String overloadMethod(String st){
		return "pitambar";
	}
	
	public Object overloadMethod(Object st){
		return "damodar";
	}
	public int overloadMethod(Integer in){
		return 5;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		
		OverrideConcept con=new OverrideConcept();
		System.out.println(con.overloadMethod("hh"));
		java.util.Calendar cal=null;

	}

}
