
class RegisterFile{
	int size;
	RegisterFileEntry[] registerFile;
	public RegisterFile(int size) {
		this.size=size;
		
		registerFile=new RegisterFileEntry[size];
		for(int i=0;i<size;i++)
			registerFile[i]=new RegisterFileEntry(i, 0);
	}
	
static class RegisterFileEntry {
	
public RegisterFileEntry(double value, int qi) {
		this.value = value;
		Qi = qi;
	}

int Qi;
double value;

}

public String toString() {
	StringBuilder sb=new StringBuilder();
	String s="----------------------------------------\n";
	sb.append("The content of the float regitser file\n");
	sb.append(s);
	sb.append(String.format("%20s %10s %10s \n","Register Number","Qi","Value"));
	sb.append(s);
	for(int i=0;i<size;i++) {
		sb.append(String.format("%20s %10s %10s \n",i,registerFile[i].Qi,registerFile[i].value));
		sb.append(s);
			
	}
	sb.append(s);
	return sb.toString();

}

}