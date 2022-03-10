
public class Addition{
       public String firstName;
        public String lastName;
	public Addition(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public static void main(String[] args){
		
		Addition addObj=new Addition("Kiru","thika");
		String fullName=addObj.stringConcat();
		System.out.println("Full Name:"+fullName);
	}
	public String stringConcat(){
		String fullName=firstName+lastName;
		return fullName;
	}
}
