package Test;
import java.io.*;
@SuppressWarnings("serial")
public class UserBean implements Serializable
{
	private String name,pword,fname,lname,addr,mid;
	private long phono;
	public UserBean()
	{
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPword() {
		return pword;
	}
	public void setPword(String pword) {
		this.pword = pword;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public long getPhono() {
		return phono;
	}
	public void setPhono(long phono) {
		this.phono = phono;
	}
	
	

}
