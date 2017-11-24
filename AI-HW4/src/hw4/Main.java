package hw4;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Frame ios = new Frame("ios");
		Frame istream = new Frame("istream", ios);
		Frame ostream = new Frame("ostream", ios);
		Frame ifstream = new Frame("ifstream", istream);
		Frame iostream = new Frame("iostream", istream, ostream);
		Frame ofstream = new Frame("ofstream", ostream);
		Frame fstream = new Frame("fstream", iostream);
		
		TopologicalSort TP = new TopologicalSort(ifstream);
		
		for(Frame F : TP.precedenceList)
			System.out.println(F);*/
		
		Frame Employee = new Frame("Employee");
		Frame TemporaryEmployee = new Frame("TemporaryEmployee", Employee);
		Frame Consultant = new Frame("Consultant", TemporaryEmployee);
		Frame Manager = new Frame("Manager", Employee);
		Frame ConsultantManager = new Frame("ConsultantManager", Consultant, Manager);
		Frame PermanentEmployee = new Frame("PermanentEmployee", Employee);		
		Frame PermanentManager = new Frame("PermanentManager", Manager, PermanentEmployee);
		Frame Director = new Frame("Director", Manager);
		
		TopologicalSort TP2 = new TopologicalSort(ConsultantManager);
		
		for(Frame F : TP2.precedenceList)
			System.out.println(F);
	}

}
