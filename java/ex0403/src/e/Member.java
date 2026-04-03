package e;

public class Member {

	String id;
	String name;
	
	public Member(String id, String name) {
		this.id=id;
		this.name=name;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		
		if (obj == null) return false;
		
		if (!(obj instanceof Member)) return false;
		
        Member other = (Member) obj;
		 
		return this.id.equals(other.id) && this.name.equals(other.name);
	}
}
