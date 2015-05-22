package net.hb.day22;

public interface Board {
	
	public boolean dbSave();
	public void login();
	public boolean search(String str);
	public abstract boolean modify();
	public int recordCount();
}
