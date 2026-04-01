package ex002;

// 물리적 버튼
public class Button {
	
	private ClickListener listener;

	public void setListener(ClickListener listener) {
		this.listener = listener;
	}
	
	public void click() {
			listener.onClick();
	}
	
}
