package ch16.sec02.exam02;

public class ButtonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Button btnOk = new Button();
		
		btnOk.setClickListener(() -> System.out.println("OK 버튼을 클릭했습니다."));
		
		btnOk.click();
		
		
		
		Button btnCancle = new Button();
		
		btnCancle.setClickListener(() -> System.out.println("Cancle 버튼을 클릭했습니다."));
		
		btnCancle.click();
	}

}
