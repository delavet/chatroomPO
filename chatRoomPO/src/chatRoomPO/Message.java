package chatRoomPO;

public class Message {
	public static final int REG_REQUEST=1,REG_REPLY=2,LOG_REQUEST=3,
	LOG_REPLY=4,MSG_SEND=5,MSG_RECEIVE=6,BATTLE_SEND=7,BATTLE_RECEIVE=8;
	private String sender;
	private String receiver;
	int type;
	public String getSender() {
		return sender;
	}
	public void setSender(String sender) {
		this.sender = sender;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	Message(String _s,String _r,int _t){
		setSender(_s);
		setReceiver(_r);
		setType(_t);
	}
}
