package chatRoomPO;

public class RegRequest extends Message {
	private String username;
	private int password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getPassword() {
		return password;
	}
	public void setPassword(int password) {
		this.password = password;
	}
	RegRequest(String _u,String _p){
		super(_u,null,REG_REQUEST);
		setUsername(_u);
		setPassword(_p.hashCode());
	}
}
